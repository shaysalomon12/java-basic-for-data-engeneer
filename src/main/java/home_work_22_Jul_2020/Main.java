package home_work_22_Jul_2020;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // MyDate date1 = new MyDate("07/23/2019");
        // MyDate date2 = new MyDate("07/23/2020");

        // String date1 = "07/23/2019";
        // String date2 = "07/23/2020";

        MyDate date1 = new MyDate("07/23/2019");
        MyDate date2 = new MyDate("07/23/2020");

        DateService ds = new DateService();
        int c = ds.differenceIndDays(date1.getDate()  ,date2.getDate());

        System.out.println("Difference in days between " + date1.getDate() + " and " + date2.getDate() + " : " + c);

        //    public int differenceIndDays(MyDate date1, MyDate date2){}
        //    public int differenceYearsDays(MyDate date1, MyDate date2){}
        //    public MyDate differenceYearsDays(MyDate from, int daysToAdd){}
    }
}
