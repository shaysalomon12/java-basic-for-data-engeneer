package home_work_22_Jul_2020;

public class DateService {

    String dateString = "23/07/2020";
    MyDate mydate = new MyDate(dateString);
    // MyDate mydate2 = new MyDate(dateString);
    private int epoch1;
    private int epoch2;

    public int differenceIndDays(String mydate1, String mydate2){
        epoch1 = mydate.verifyDate(mydate1);
        System.out.println("epoch1: " + epoch1);
        epoch2 = mydate.verifyDate(mydate2);
        System.out.println("epoch2: " + epoch2);
        // Our epochs are calculated in hours
        return (epoch2-epoch1)/24;
    }
//    public int differenceYearsDays(MyDate date1, MyDate date2){}
//    public MyDate differenceYearsDays(MyDate from, int daysToAdd){}
}
