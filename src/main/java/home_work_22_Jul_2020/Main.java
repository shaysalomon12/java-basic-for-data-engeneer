package home_work_22_Jul_2020;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        MyDate a = new MyDate("07/23/2020");
        MyDate b = new MyDate("07/23/2020");
        int c = 0;

        DateService ds = new DateService();
        c = ds.differenceIndDays("07/23/2019","07/23/2020");
        System.out.println("Difference in days between " + a + " and " + b +" : " + c);


        //    public int differenceIndDays(MyDate date1, MyDate date2){}
        //    public int differenceYearsDays(MyDate date1, MyDate date2){}
        //    public MyDate differenceYearsDays(MyDate from, int daysToAdd){}
    }
}
