package homework_12_Jul_2020;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        // Create new soldiers
        Soldier soldier0 = new Soldier("Dan", 18, 192020);
        Soldier soldier1 = new Soldier("Or", 19, 192021);
        Soldier soldier2 = new Soldier("Neta", 28, 192022);
        Soldier soldier3 = new Soldier("Yariv", 21, 192023);
        Soldier soldier4 = new Soldier("Alon", 22, 192024);
        Soldier soldier5 = new Soldier("Ben", 26, 192025);
        Soldier soldier6 = new Soldier("David", 19, 192026);
        Soldier soldier7 = new Soldier("Rami", 21, 192027);
        Soldier soldier8 = new Soldier("Galit", 18, 192028);
        Soldier soldier9 = new Soldier("Boris", 19, 192029);
        Soldier soldier10 = new Soldier("Irena", 20, 192030);
        Soldier soldier11 = new Soldier("Michal", 23, 192031);
        Soldier soldier12 = new Soldier("Alona", 26, 192022);

        // Add soldiers to ArrayList using method soldierservice.addSoldier
        SoldierService service = new SoldierService();

        System.out.println("Soldiers list added:");
        service.addSoldier(soldier0);
        service.addSoldier(soldier1);
        service.addSoldier(soldier2);
        service.addSoldier(soldier3);
        service.addSoldier(soldier4);
        service.addSoldier(soldier5);
        service.addSoldier(soldier6);
        service.addSoldier(soldier7);
        service.addSoldier(soldier8);
        service.addSoldier(soldier9);
        service.addSoldier(soldier10);
        service.addSoldier(soldier11);
        service.addSoldier(soldier12); /* soldier12 has same ID as soldier2 and should return error */

        // Call our good old SUM, AVG and MAX methods from SoldierService Class
        System.out.println("\r");
        System.out.println("Avg of soldiers age is:" + service.soldierAgeAvg());
        System.out.println("Sum of soldiers age is:" + service.soldierAgeSum());
        System.out.println("Max of soldiers age is:" + service.soldierAgeMax());

        // Print soldiers list
        System.out.println("\r");
        System.out.println("Soldiers list: ");
        service.printAllnames();

    }
}
