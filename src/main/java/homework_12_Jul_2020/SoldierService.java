package homework_12_Jul_2020;

import java.util.ArrayList;

public class SoldierService {

    // Create ArrayList of soldiers
    private ArrayList<Soldier> soldiers = new ArrayList<Soldier>();
    private Soldier soldier;


    // Class Constructor - doing nothing
    public SoldierService() {
    }

    public void addSoldier(Soldier soldier) {
        this.soldier = soldier;
        if (soldiers.contains(soldier)) {

            System.out.println("*** Error: soldier ID " + soldier.getSoldierID() + " already exists with name " + soldier.getSoldierName());

        } else {
            soldiers.add(soldier);
            System.out.println("soldier ID " + soldier.getSoldierID() + " with name " + soldier.getSoldierName() + " and age " + soldier.getSoldierAge() + " added to soldiers list");
        }
    }

    public void printAllnames() {
        int i;
        for (i = 1; i < soldiers.size(); i++) {
            System.out.println("Name: " + soldiers.get(i).getSoldierName() + ", Age: " + soldiers.get(i).getSoldierAge() + ", ID: " + soldiers.get(i).getSoldierID());
        }
    }

    public int soldierAgeAvg() {

        int sumAll = 0;
        int avgAll = 0;
        int i = 0;
        for (i = 0; i < soldiers.size(); i++) {
            sumAll = sumAll + soldiers.get(i).getSoldierAge();
        }

        avgAll = sumAll / i;
        return avgAll;
    }

    public int soldierAgeSum() {

        int sumAll = 0;
        int i = 0;
        for (i = 0; i < soldiers.size(); i++) {
            sumAll = sumAll + soldiers.get(i).getSoldierAge();
        }

        return sumAll;
    }

    public int soldierAgeMax() {

        int maxAll = 0;
        int i = 0;
        for (i = 0; i < soldiers.size(); i++) {
            if (maxAll < soldiers.get(i).getSoldierAge()) {
                maxAll = soldiers.get(i).getSoldierAge();
            }
        }

        return maxAll;
    }
}
