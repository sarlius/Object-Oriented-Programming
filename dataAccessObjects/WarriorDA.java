package dataAccessObjects;

import domainPackage.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.Scanner;

public class WarriorDA {

    private ArrayList<Warrior> warriorList;
    private Integer totalKills = 0;

    public WarriorDA(String s) throws FileNotFoundException {

        Scanner teamStatInfo = new Scanner(new FileReader("Lab Assignment 2\\src\\csvFiles\\teamStatInfo.csv"));
        warriorList = new ArrayList<>();

        while(teamStatInfo.hasNextLine()) {

            String warrior1 = new String();
            String[] container = new String[4];
            warrior1 = teamStatInfo.nextLine();
            container = warrior1.split(",");
            String warriorNo;

            if (s.equals(container[0])) {
                totalKills += Integer.parseInt(container[3]);
                warriorNo = container[1];

                if (warriorNo.equals("warrior1")) {
                    warriorList.add(new Clint(container[1], Integer.parseInt(container[2]), Integer.parseInt(container[3])));
                }

                else if (warriorNo.equals("warrior2")) {
                    warriorList.add(new Miya(container[1], Integer.parseInt(container[2]), Integer.parseInt(container[3])));
                }

                else if (warriorNo.equals("warrior3")) {
                    warriorList.add(new Vexana(container[1], Integer.parseInt(container[2]), Integer.parseInt(container[3])));
                }

                else {
                    warriorList.add(null);
                }
            }
        }
    }

    public ArrayList<Warrior> getWarrior() {
        return warriorList;
    }

    public Integer getTotalKills() {
        return totalKills;
    }

}
