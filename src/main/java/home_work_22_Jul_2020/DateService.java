package home_work_22_Jul_2020;

public class DateService {


    public int differenceIndDays(MyDate mydate1, MyDate mydate2){

        // Get the EPOCH value for each input date
        int epoch1 = mydate1.verifyDate(mydate1.getDate());
        int epoch2 = mydate2.verifyDate(mydate2.getDate());

        // My epochs are calculated in hours
        return (epoch2 - epoch1)/24;
    }
//    public int differenceYearsDays(MyDate date1, MyDate date2){}
//    public MyDate differenceYearsDays(MyDate from, int daysToAdd){}
}
