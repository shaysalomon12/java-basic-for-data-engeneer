package homework_12_Jul_2020;

import java.util.Objects;
//aa
public class Soldier {
    private String soldierName;
    private int soldierAge;
    private int soldierID;

    {
        // System.out.println("New soldier object created");
    }

    // Class constructor for the Soldier class that requires: name, age and unique id
    public Soldier(String name, int age, int id) {
        this.soldierAge = age;
        this.soldierName = name;
        this.soldierID = id;
    }

    // Using ALT+Insert selected equals() and hashcode() to create unique check for soldierID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldier soldier = (Soldier) o;
        return soldierID == soldier.soldierID;

    }


    // Creating new method that returns age and name
    public void newSoldier(String name1, int age1, int id1) {

        if (age1 == 0) {
            age1 = soldierAge;
        }

        if (name1 == null) {
            name1 = "AnonymousSoldier";
        }

        System.out.println("Soldier Name: " + name1);
        System.out.println("Soldier Age: " + age1);
        System.out.println("Soldier ID: " + id1);

    }

    //Setters
    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }

    public void setSoldierAge(int soldierAge) {
        this.soldierAge = soldierAge;
    }

    public void setSoldierID(int soldierID) {
        this.soldierID = soldierID;
    }

    //Getters
    public String getSoldierName() {
        return soldierName;
    }

    public int getSoldierAge() {
        return soldierAge;
    }

    public int getSoldierID() {
        return soldierID;
    }
}