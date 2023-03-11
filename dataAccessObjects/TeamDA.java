package dataAccessObjects;

import domainPackage.Team;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamDA {

    private ArrayList<Team> teamList;
    public TeamDA() throws FileNotFoundException {

        Scanner teamInfo = new Scanner(new FileReader("Lab Assignment 2\\src\\csvFiles\\teamInfo.csv"));
        teamList = new ArrayList<>();

        while(teamInfo.hasNextLine()) {
            String[] infoSplit = teamInfo.nextLine().split(",");
            WarriorDA warriorList = new WarriorDA(infoSplit[0]);
            teamList.add(new Team(infoSplit[0], infoSplit[1], warriorList.getWarrior(), warriorList.getTotalKills()));
        }

    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }
}