package Homework_08_Jul_2020;

public class Soldier {
    private String soldierName;
    private int soldierAge;

    {
        System.out.println("New soldier object created");
    }

    // Class constructor for the Soldier class that requires age
    public Soldier(int age) {
        soldierAge = age;
    }

    // Creating new method that returns age and name
    public void newSoldier(String name1, int age1) {

        if (age1 == 0) {
            age1 = soldierAge;
        }

        if (name1 == null) {
            name1 = "AnonymousSoldier";
        }

        System.out.println("Soldier Name: " + name1);
        System.out.println("Soldier Age: " + age1);

    }

    //Setters
    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }

    public void setSoldierAge(int soldierAge) {
        this.soldierAge = soldierAge;
    }

    //Getters
    public String getSoldierName() {
        return soldierName;
    }

    public int getSoldierAge() {
        return soldierAge;
    }
}

