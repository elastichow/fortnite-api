/**
  * Copyright 2023 bejson.com 
  */
package tech.chowyijiu.fortnite_api.entity.stat;

/**
 * Auto-generated: 2023-06-12 18:36:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class BrStat {

    private Account account;
    private BattlePass battlePass;
    private String image;
    private Stats stats;
    public void setAccount(Account account) {
         this.account = account;
     }
     public Account getAccount() {
         return account;
     }

    public void setBattlePass(BattlePass battlePass) {
         this.battlePass = battlePass;
     }
     public BattlePass getBattlePass() {
         return battlePass;
     }

    public void setImage(String image) {
         this.image = image;
     }
     public String getImage() {
         return image;
     }

    public void setStats(Stats stats) {
         this.stats = stats;
     }
     public Stats getStats() {
         return stats;
     }

}