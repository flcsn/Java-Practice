/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frankie
 */
public class Match {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    public Match (String homeTeam, String visitingTeam, int homePoints, int visitingPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public int getHomePoints() {
        return this.homePoints;
    }
    
    public int getVisitingPoints() {
        return this.visitingPoints;
    }
    
}
