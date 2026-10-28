/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elips
 */
public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    public String getVisitingTeam(){
        return this.visitingTeam;
    }
    public int getHomeTeamPoints(){
        return this.homeTeamPoints;
    }
    public int getVisitingTeamPoints(){
        return this.visitingTeamPoints;
    }
    
    public boolean teamParticipates(String teamName){
        if(this.homeTeam.equals(teamName) || this.visitingTeam.equals(teamName)){
            return true;
        }
        return false;
    }
    
    public boolean teamWins(String teamName){
        if(this.homeTeam.equals(teamName) && this.homeTeamPoints > this.visitingTeamPoints){
            return true;
        }
        if(this.visitingTeam.equals(teamName) && this.visitingTeamPoints > this.homeTeamPoints){
            return true;
        }
        return false;
    }
}
