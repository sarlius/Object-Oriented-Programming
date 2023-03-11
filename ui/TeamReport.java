package ui;


import dataAccessObjects.TeamDA;
import domainPackage.Team;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TeamReport {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Team> teamList = new TeamDA().getTeamList();

        System.out.println("\nTeam Standing Report\n");
        for (Team team : teamList) {
            System.out.println(team);
        }
    }
}
