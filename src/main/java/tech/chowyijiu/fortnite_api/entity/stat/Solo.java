/**
  * Copyright 2023 bejson.com 
  */
package tech.chowyijiu.fortnite_api.entity.stat;
import java.util.Date;

/**
 * Auto-generated: 2023-06-12 18:36:40
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Solo {

    private int score;
    private double scorePerMin;
    private double scorePerMatch;
    private int wins;
    private int top10;
    private int top25;
    private int kills;
    private double killsPerMin;
    private double killsPerMatch;
    private int deaths;
    private double kd;
    private int matches;
    private int winRate;
    private int minutesPlayed;
    private int playersOutlived;
    private Date lastModified;
    public void setScore(int score) {
         this.score = score;
     }
     public int getScore() {
         return score;
     }

    public void setScorePerMin(double scorePerMin) {
         this.scorePerMin = scorePerMin;
     }
     public double getScorePerMin() {
         return scorePerMin;
     }

    public void setScorePerMatch(double scorePerMatch) {
         this.scorePerMatch = scorePerMatch;
     }
     public double getScorePerMatch() {
         return scorePerMatch;
     }

    public void setWins(int wins) {
         this.wins = wins;
     }
     public int getWins() {
         return wins;
     }

    public void setTop10(int top10) {
         this.top10 = top10;
     }
     public int getTop10() {
         return top10;
     }

    public void setTop25(int top25) {
         this.top25 = top25;
     }
     public int getTop25() {
         return top25;
     }

    public void setKills(int kills) {
         this.kills = kills;
     }
     public int getKills() {
         return kills;
     }

    public void setKillsPerMin(double killsPerMin) {
         this.killsPerMin = killsPerMin;
     }
     public double getKillsPerMin() {
         return killsPerMin;
     }

    public void setKillsPerMatch(double killsPerMatch) {
         this.killsPerMatch = killsPerMatch;
     }
     public double getKillsPerMatch() {
         return killsPerMatch;
     }

    public void setDeaths(int deaths) {
         this.deaths = deaths;
     }
     public int getDeaths() {
         return deaths;
     }

    public void setKd(double kd) {
         this.kd = kd;
     }
     public double getKd() {
         return kd;
     }

    public void setMatches(int matches) {
         this.matches = matches;
     }
     public int getMatches() {
         return matches;
     }

    public void setWinRate(int winRate) {
         this.winRate = winRate;
     }
     public int getWinRate() {
         return winRate;
     }

    public void setMinutesPlayed(int minutesPlayed) {
         this.minutesPlayed = minutesPlayed;
     }
     public int getMinutesPlayed() {
         return minutesPlayed;
     }

    public void setPlayersOutlived(int playersOutlived) {
         this.playersOutlived = playersOutlived;
     }
     public int getPlayersOutlived() {
         return playersOutlived;
     }

    public void setLastModified(Date lastModified) {
         this.lastModified = lastModified;
     }
     public Date getLastModified() {
         return lastModified;
     }

}