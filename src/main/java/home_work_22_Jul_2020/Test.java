package home_work_22_Jul_2020;

public class Test {

    public static void main(String[] args) {

        // Epoc1: 17688524
        // Epoc2: 17689984

        String date1 = "01/01/2018";
        String date2 = "03/01/2018";
        int dayM = (86400 / 3600);
        int monthM = (2629743 / 3600);
        int yearM = (31556926 / 3600);


        // mm/dd/yyyy format
        String[] epoch1 = date1.split("/");
        int m1 = Integer.parseInt(epoch1[0]);
        int d1 = Integer.parseInt(epoch1[1]);
        int y1 = Integer.parseInt(epoch1[2]);
        System.out.println("date1 Year: " + y1 + " Month: " + m1 + " Day: " + d1);

        // mm/dd/yyyy format
        String[] epoch2 = date2.split("/");
        int m2 = Integer.parseInt(epoch2[0]);
        int d2 = Integer.parseInt(epoch2[1]);
        int y2 = Integer.parseInt(epoch2[2]);
        System.out.println("date2 Year: " + y2 + " Month: " + m2 + " Day: " + d2);

        int a = 17689984%17688524;
        // String b = Double.toString(a);
        System.out.println("epoc2/epoc1: 60 days " + 17689984%17688524);
        System.out.println("epoc2/epoc1: 365 days " + 17710962%17702197);
        System.out.println("yearM: " + yearM);

        // int epoc1 = 17702197; // (07/23/2019)
        //int epoc1 = 17710962; // (07/23/2020)

        // Epoc1: 17688524
        // Epoc2: 17689984

        /*
        int epoc1 = 17702507;

        int epochY =  31556926/3600;
        int epochM =  2629743/3600;
        int epochD = 86400/3600;

        int year = epoc1/epochY;
        int month1 = epoc1%epochY;
        int month = month1/epochM;
        int day1 = month1%epochM;
        int day = day1/epochD;

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        */

    }
}
