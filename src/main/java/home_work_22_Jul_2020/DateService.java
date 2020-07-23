package home_work_22_Jul_2020;

public class DateService {

    String dateString;
    MyDate mydate = new MyDate(null);
    // MyDate mydate2 = new MyDate(null);

    private int epoch1;
    private int epoch2;

    public int differenceIndDays(String mydate1, String mydate2){

        epoch1 = mydate.verifyDate(mydate1);
        epoch2 = mydate.verifyDate(mydate2);

        // Our epochs are calculated in hours
        return (epoch2-epoch1)/24;
    }
//    public int differenceYearsDays(MyDate date1, MyDate date2){}
//    public MyDate differenceYearsDays(MyDate from, int daysToAdd){}
}
