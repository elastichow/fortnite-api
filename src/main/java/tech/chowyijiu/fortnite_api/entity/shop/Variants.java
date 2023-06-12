/**
  * Copyright 2023 json.cn 
  */
package tech.chowyijiu.fortnite_api.entity.shop;
import java.util.List;

/**
 * Auto-generated: 2023-06-12 18:44:32
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Variants {

    private String channel;
    private String type;
    private List<Options> options;
    public void setChannel(String channel) {
         this.channel = channel;
     }
     public String getChannel() {
         return channel;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setOptions(List<Options> options) {
         this.options = options;
     }
     public List<Options> getOptions() {
         return options;
     }

}