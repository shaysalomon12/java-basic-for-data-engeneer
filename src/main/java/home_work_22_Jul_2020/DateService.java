package home_work_22_Jul_2020;

public class DateService {

    private final int dayM = (86400 / 3600);
    private final int monthM = (2629743 / 3600);
    private final int yearM = (31556926 / 3600);

    public int differenceIndDays(MyDate mydate1, MyDate mydate2) {

        // Get the EPOCH value for each input date
        int epoch1 = mydate1.verifyDate(mydate1.getDate());
        int epoch2 = mydate2.verifyDate(mydate2.getDate());

        // My epochs are calculated in hours
        return (epoch2 - epoch1) / 24;
    }


    public String differenceYearsDays(MyDate mydate1, MyDate mydate2) {
        int epoch1 = mydate1.verifyDate(mydate1.getDate());
        int epoch2 = mydate2.verifyDate(mydate2.getDate());

        int years = (epoch2 / epoch1);

        // Verify result is less than 1 year
        if (epoch2%epoch1 < yearM){
            years = 0;
        }

        int days = (((epoch2 - epoch1) / 24) % 365);
        System.out.println("Epoc1: " + epoch1);
        System.out.println("Epoc2: " + epoch2);
        // System.out.println("Yers: " + years + " Days: " + days);
        return years + " years and " + days + " days";

    }

    public MyDate differenceYearsDaysAdd(MyDate mydate1, int daysToAdd) {
        int epoc3 = mydate1.verifyDate(mydate1.getDate());
        int dayM = (86400 / 3600);
        epoc3 = epoc3 + (daysToAdd * dayM);
        String a = mydate1.reverseEpoch(epoc3);
        System.out.println("Epoc3: " + epoc3);
        return new MyDate(a);
    }

}




