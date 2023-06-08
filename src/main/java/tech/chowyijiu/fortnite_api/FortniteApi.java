package tech.chowyijiu.fortnite_api;

import cn.hutool.http.HttpException;
import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import tech.chowyijiu.fortnite_api.entity.shop.ShopEntry;
import tech.chowyijiu.fortnite_api.enums.AccountType;
import tech.chowyijiu.fortnite_api.enums.ImageSource;
import tech.chowyijiu.fortnite_api.enums.TimeWindow;
import tech.chowyijiu.fortnite_api.exception.FortniteApiException;
import tech.chowyijiu.fortnite_api.utils.StringUtil;

import java.util.*;


public class FortniteApi {

    private static final String API_URL = "https://fortnite-api.com";

    private static JSONObject getData(final String body) {
        JSONObject bodyJsonObj = JSONObject.parseObject(body);
        Integer status = (Integer) bodyJsonObj.get("status");
        switch (status) {
            case 200:
                return (JSONObject) bodyJsonObj.get("data");
            case 400:
            case 401:
            case 403:
            case 404:
                throw new FortniteApiException((String) bodyJsonObj.get("error"));
        }
        return null;
    }

    public static HttpRequest apiRequest(String urlSuffix) {
        return HttpRequest.get(API_URL + urlSuffix).form("language", "zh-CN");
    }

    public static JSONObject getShop() {
        return getData(apiRequest("/v2/shop/br/combined").execute().body());
    }

    public static List<ShopEntry> shopEntries() {
        List<ShopEntry> shopEntries = new ArrayList<>();
        JSONObject shop = getShop();
        String[] types = {"featured", "daily", "votes", "voteWinners"};
        for (String type : types) {
            Optional.ofNullable(shop.get(type)).ifPresent(item -> {
                shopEntries.addAll(((JSONArray) ((JSONObject) item).get("entries")).toList(ShopEntry.class));
            });
        }
        return shopEntries;
    }

    public static JSONObject cosmeticsList() {
        return getData(apiRequest("/v2/cosmetics/br").execute().body());
    }

    public static JSONObject newCosmetics() {
        return getData(apiRequest("/v2/cosmetics/br/new").execute().body());
    }

    public static JSONObject brMap() {
        return getData(apiRequest("/br/map").execute().body());
    }


    private Map<String, String> headers;

    private FortniteApi() {

    }

    public FortniteApi(String apiKey) {
        headers = new HashMap<>(1);
        headers.put("Authorization", apiKey);
    }

    public JSONObject brStats(String accountName, String accountType, String timeWindow, String imageSource) {
        HttpRequest httpRequest = apiRequest("/v2/stats/br/v2").addHeaders(headers);
        StringUtil.hasLength(accountName, str -> httpRequest.form("name", str));
        StringUtil.hasLength(accountType, str -> httpRequest.form("accountType", str));
        StringUtil.hasLength(timeWindow, str -> httpRequest.form("timeWindow", str));
        StringUtil.hasLength(imageSource, str -> httpRequest.form("image", str));
        return getData(httpRequest.execute().body());
    }
}