package home_work_22_Jul_2020;

public class MyDate {

    private String date;
    private String year;
    private String month;
    private String day;
    private String dateRegex;
    private int epoch = 0;
    private Integer a = 0;
    private final int dayM = (86400 / 3600);
    private final int monthM = (2629743 / 3600);
    private final int yearM = (31556926 / 3600);

    // Constructor that verifay date end return epoch (number of seconds since 01/01/1970
    public MyDate(String date1) {
        this.date = date1;
    }

    // Verify this is a valid date. Returns epoch number in hours
    public Integer verifyDate(String date) {

        // mm/dd/yyyy format
        dateRegex = "^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$";
        if (date.matches(dateRegex)) {
            // convert to epoch
            String[] epoch1 = date.split("/");
            int m = Integer.parseInt(epoch1[0]);
            int d = Integer.parseInt(epoch1[1]);
            int y = Integer.parseInt(epoch1[2]);
            a = this.epoch(d, m, y);
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
            a = epoch(d, m, y);
            return a;
        }
        return -1;
    }

    private Integer epoch(int day, int month, int year) {
        // Calculate "epoch like" - number of hours since 01/01/1970
        // Used no. of hours to convert date instead of seconds because int cannot handle such numbers
        return ((day * dayM) + (month * monthM) + (year * yearM));

    }

    public String reverseEpoch(int epochNumber) {

        Integer year = epochNumber / yearM;
        int month1 = epochNumber % yearM;
        Integer month = month1 / monthM;
        int day1 = month1 % monthM;
        Integer day = day1 / dayM;

        if (day == 0){
            day = day + 1;
        }

        String a = month.toString() + "/" + day.toString() + "/" + year.toString();
        System.out.println("New date is " + a);
        return a;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getEpoch() {
        return epoch;
    }

    public void setEpoch(int epoch) {
        this.epoch = epoch;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
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
