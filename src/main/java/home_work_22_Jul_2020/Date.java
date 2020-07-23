package home_work_22_Jul_2020;

import java.math.BigInteger;

public class Date {

    private String year;
    private String month;
    private String day;
    // private String dateRegex = null;
    private int epoch = 0;
    private Integer a = 0;

    // Constructor that verifay date end return epoch (number of seconds since 01/01/1970
    public Date(String date1) {

        // Verify mm/dd/yyyy format
        //dateRegex = "^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$";
        a = verifyDate(date1);
        if (a < 0 ){
            System.out.println("Not a Valid date !!!");
        }
    }

    // Verify this is a valid date
    public Integer verifyDate(String date) {
        // mm/dd/yyyy format
        String dateRegex = "^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$";
        if (date.matches(dateRegex)) {
            // convert to epoch
            String[] epoch1 = date.split("/");
            int m = Integer.parseInt(epoch1[0]);
            int d = Integer.parseInt(epoch1[1]);
            int y = Integer.parseInt(epoch1[2]);
            a = this.epoch(d, m, y);
            System.out.println(d + " " + m + " " + y);
            System.out.println("Epoch a = " + a);
            return a;
        }

        // dd-mm-yyyy format
        dateRegex = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
        if (date.matches(dateRegex)) {
            // convert to epoch
            String[] epoch1 = date.split("-");
            int d = Integer.parseInt(epoch1[0]);
            int m = Integer.parseInt(epoch1[1]);
            int y = Integer.parseInt(epoch1[2]);
            System.out.println(d + " " + m + " " + y);
            a = epoch(d, m, y);
            return a;
        }

        // yyyy-mm-dd format
        dateRegex = "^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";
        if (date.matches(dateRegex)) {
            // convert to epoch
            String[] epoch1 = date.split("-");
            int y = Integer.parseInt(epoch1[0]);
            int m = Integer.parseInt(epoch1[1]);
            int d = Integer.parseInt(epoch1[2]);
            System.out.println(d + " " + m + " " + y);
            a = epoch(d, m, y);
            return a;
        }
        return a;
    }

    private Integer epoch(int day, int month, int year) {
        // Calculate "epoch like" - number of hours since 01/01/1970
        // We divide each number by 3600 to get all number by hours instead of seconds
        // because int cannot handle such numbers
        int dayM = (86400/3600);
        int monthM = (2629743/3600);
        int yearM = (31556926/3600);
        // System.out.println("Verify calc: " + dayM + " " + monthM + " " +  yearM);
        return ((day * dayM) + (month * monthM) + (year * yearM));

    }

    // Getter and Setter
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
