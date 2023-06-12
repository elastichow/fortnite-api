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
public class Daily {

    private String name;
    private List<Entries> entries;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setEntries(List<Entries> entries) {
         this.entries = entries;
     }
     public List<Entries> getEntries() {
         return entries;
     }

}