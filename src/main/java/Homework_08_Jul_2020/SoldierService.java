package Homework_08_Jul_2020;

import java.util.ArrayList;

public class SoldierService {
    private int sumAll = 0;
    private int avgAll = 0;
    private int maxAll = 0;
    private int i = 0;

    // Class Constructor - doing nothing
    public SoldierService() {
    }

    public int SoldierAge_Avg(ArrayList<Soldier> soldiers) {
        for (i = 0; i < soldiers.size(); i++) {
            sumAll = sumAll + soldiers.get(i).getSoldierAge();
        }

        avgAll = sumAll / i;
        return avgAll;
    }

    public int SoldierAge_Sum(ArrayList<Soldier> soldiers) {
        for (i = 0; i < soldiers.size(); i++) {
            sumAll = sumAll + soldiers.get(i).getSoldierAge();
        }

        return sumAll;
    }

    public int SoldierAge_Max(ArrayList<Soldier> soldiers) {
        for (i = 0; i < soldiers.size(); i++) {
            if (maxAll < soldiers.get(i).getSoldierAge()) {
                maxAll = soldiers.get(i).getSoldierAge();
            }
        }

        return maxAll;
    }

}
