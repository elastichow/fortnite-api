package tech.chowyijiu.fortnite_api.utils;

import java.util.function.Function;

/**
 * @author elastic chow
 * @date 8/6/2023
 */
public class StringUtil {

    public static <R> R hasLength(String str, Function<String, R> function) {
        if (str != null && str.length() > 0) {
            return function.apply(str);
        } else {
            return null;
        }
    }
}
