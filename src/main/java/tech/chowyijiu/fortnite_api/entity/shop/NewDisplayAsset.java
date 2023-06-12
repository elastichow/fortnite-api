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
public class NewDisplayAsset {

    private String id;
    private String cosmeticId;
    private List<MaterialInstances> materialInstances;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setCosmeticId(String cosmeticId) {
         this.cosmeticId = cosmeticId;
     }
     public String getCosmeticId() {
         return cosmeticId;
     }

    public void setMaterialInstances(List<MaterialInstances> materialInstances) {
         this.materialInstances = materialInstances;
     }
     public List<MaterialInstances> getMaterialInstances() {
         return materialInstances;
     }

}