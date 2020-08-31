package Homework_30_Aug_2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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

        System.out.println("Un-sorted ColorsList ");
        for (String colors : colorList) {
            System.out.println(colors);
        }

        // Using Consumer interface:  int compare(T o1, T o2);
        System.out.println("Using Java Comparator");
        //colorList = ListUtils.sort(colorList,  (o1, o2) -> (o1.toString().compareTo(o2.toString())));
        colorList = ListUtils.sortWithCustomComparator(colorList,  (o1, o2) -> (o1.toString().compareTo(o2.toString())));

        System.out.println("Sorted Colors");
        for (String sortedColors : colorList) {
            System.out.println(sortedColors);
        }
    }
}
