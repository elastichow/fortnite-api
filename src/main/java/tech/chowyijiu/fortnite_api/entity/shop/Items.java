/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.fortnite_api.entity.shop;
import lombok.Data;

import java.util.List;
import java.util.Date;

/**
 * Auto-generated: 2023-06-12 18:44:32
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@Data
public class Items {

    private String id;
    private String name;
    private String description;
    private Type type;
    private Rarity rarity;
    private Set set;
    private Introduction introduction;
    private Images images;
    private List<String> gameplayTags;
    private String showcaseVideo;
    private String displayAssetPath;
    private String definitionPath;
    private String path;
    private String added;
    private List<String> shopHistory;


}