package home_work_22_Jul_2020;

public class Test {

    public static void main(String[] args) {


        // int epoc1 = 17702197; // (07/23/2019)
        //int epoc1 = 17710962; // (07/23/2020)
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
    }
}
