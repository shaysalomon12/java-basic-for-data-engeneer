package home_work_22_Jul_2020;

import javax.swing.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Get input dates to compare
        String inputDate1 = JOptionPane.showInputDialog("Enter valid date no.1" + "\n" + "Supported formats:\n mm/dd/yyyy \n dd-mm-yyyy \n yyyy-mm-dd \n");
        MyDate date1 = new MyDate(inputDate1);
        if (date1.verifyDate(inputDate1) < 0) {
            JOptionPane.showMessageDialog(null, "Not a valid date format");
            System.exit(0);
        }

        String inputDate2 = JOptionPane.showInputDialog("Enter valid date no.2" + "\n" + "Supported formats:\n mm/dd/yyyy \n dd-mm-yyyy \n yyyy-mm-dd \n");
        MyDate date2 = new MyDate(inputDate2);
        if (date2.verifyDate(inputDate2) < 0) {
            JOptionPane.showMessageDialog(null, "Not a valid date format");
            System.exit(0);
        }

        // Initialize DateService service
        DateService ds = new DateService();
        int diffInDays = ds.differenceIndDays(date1, date2);

        System.out.println("Difference in days between " + date1.getDate() + " and " + date2.getDate() + " : " + diffInDays);
        JOptionPane.showMessageDialog(null, "Difference in days between " + date1.getDate() + " and " + date2.getDate() + " : \n" + diffInDays);

        String differenceYearsDays = ds.differenceYearsDays(date1, date2);
        JOptionPane.showMessageDialog(null, "Difference in years and days between " + date1.getDate() + " and " + date2.getDate() + " : \n" + differenceYearsDays);

        int addDays = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter days to add to date no. 1"));
        MyDate date3 = ds.differenceYearsDaysAdd(date1, (int) addDays);
        JOptionPane.showMessageDialog(null, "New date is (format mm/dd/yyyy): \n " + date3.getDate());

    }
}
