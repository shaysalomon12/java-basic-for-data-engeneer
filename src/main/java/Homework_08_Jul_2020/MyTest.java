package Homework_08_Jul_2020;

import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) {

        // We must create the Soldier object with age because we forced it in the constructor
        Soldier soldier = new Soldier(19);

        // Call newSoldier with name and age
        System.out.println ("Call with name and age:");
        soldier.newSoldier("Dan", 22);

        // Call newSoldier with no age
        System.out.println ("Call with no name and no age:");
        soldier.newSoldier(null, 0);

        // Create ArrayList of soldiers
        ArrayList<Soldier> soldiers = new ArrayList<>();

        // Populate the array of soldiers
        int i = 0;
        for (i = 20; i < 30; i++) {
            soldiers.add(new Soldier(i));
        }

        // Call method to calclulate Avg of ages
        SoldierService soldierService = new SoldierService();
        int getSoldierAvg = new SoldierService().SoldierAge_Avg(soldiers);
        System.out.println("Soldiers Avg of ages: " + getSoldierAvg);

        // Call method to calclulate Sum of ages
        int getSoldierSum = new SoldierService().SoldierAge_Sum(soldiers);
        System.out.println("Soldiers Sum of ages: " + getSoldierSum);

        // Call method to calclulate Max of ages
        int getSoldierMax = new SoldierService().SoldierAge_Max(soldiers);
        System.out.println("Soldiers Max of ages: " + getSoldierMax);

    }
}
