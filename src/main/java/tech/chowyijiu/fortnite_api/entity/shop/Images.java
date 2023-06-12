/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.fortnite_api.entity.shop;

import lombok.ToString;

/**
 * Auto-generated: 2023-06-12 18:44:32
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
@ToString
public class Images {

    private String smallIcon;
    private String icon;
    private String featured;
    public void setSmallIcon(String smallIcon) {
         this.smallIcon = smallIcon;
     }
     public String getSmallIcon() {
         return smallIcon;
     }

    public void setIcon(String icon) {
         this.icon = icon;
     }
     public String getIcon() {
         return icon;
     }

    public void setFeatured(String featured) {
         this.featured = featured;
     }
     public String getFeatured() {
         return featured;
     }

}