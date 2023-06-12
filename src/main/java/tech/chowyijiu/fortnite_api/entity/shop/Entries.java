/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.fortnite_api.entity.shop;
import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2023-06-12 18:44:32
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@Data
public class Entries {

    private int regularPrice;
    private int finalPrice;
    private Bundle bundle;
    private Banner banner;
    private boolean giftable;
    private boolean refundable;
    private int sortPriority;
    private List<String> categories;
    private String sectionId;
    private String devName;
    private String offerId;
    private String tileSize;
    private String newDisplayAssetPath;
    private NewDisplayAsset newDisplayAsset;
    private List<Items> items;

}