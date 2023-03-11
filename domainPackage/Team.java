package domainPackage;

import java.util.ArrayList;

public class Team {
    private final ArrayList<Warrior> warrior;
    private String teamID;
    private String teamName;
    private Integer totalKills;

    public Team(String teamID, String teamName,ArrayList<Warrior> warrior, Integer totalKills) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.warrior = warrior;
        this.totalKills = totalKills;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getTotalKills() {
        return totalKills;
    }

    public void setTotalKills(Integer totalKills) {
        this.totalKills = totalKills;
    }

    @Override
    public String toString() {
        String team = "\nTeam id: " + this.teamID
                + "\nTeam name:" + this.teamName
                + "\nTotal kill: " + this.totalKills;

        for (Warrior warrior : warrior) {
            team += "\t" + warrior.showWarriorAndKills() + "\n";
        }
        return team;
    }
}
