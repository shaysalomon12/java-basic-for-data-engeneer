package Homework_16_Aug_2020;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Populate ArrayList of Colors
        List<String> colorList = new ArrayList<>();
        colorList.add ("Blue");
        colorList.add ("Red");
        colorList.add ("Green");
        colorList.add ("Yellow");
        colorList.add ("Red");
        colorList.add ("Purple");
        colorList.add ("Blue");
        colorList.add ("Red");
        colorList.add ("Yellow");
        colorList.add ("White");
        colorList.add ("Yellow");
        colorList.add ("Blue");
        colorList.add ("Red");
        colorList.add ("Green");
        colorList.add ("Blue");
        colorList.add ("White");

        // Check Occurrences
        System.out.println("Color Count Occurrences");
        CountUtils.countOccurrences((ArrayList<String>) colorList);



    }
}
