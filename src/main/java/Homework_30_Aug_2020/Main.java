package Homework_30_Aug_2020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Sorting list of Strings
        List<String> colorList = new ArrayList<>();
        colorList.add("Blue");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Red");
        colorList.add("Purple");
        colorList.add("Blue");
        colorList.add("Red");
        colorList.add("Yellow");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("White");

        System.out.println("Un-sorted colorsList:");
        for (String colors : colorList) {
            System.out.println(colors);
        }

        // Using Consumer interface:  int compare(T o1, T o2);
        colorList = ListUtils.sortCustomComparator(colorList, (o1, o2) -> o1.toString().compareTo(o2.toString()));

        System.out.println("\nSorted Colors:");
        for (String sortedColors : colorList) {
            System.out.println(sortedColors);
        }

        // Sorting list of Numbers
        Random rd = new Random();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numberList.add(rd.nextInt(100));
        }

        System.out.println("\nUn-sorted numberList:");
        for (Integer numbers : numberList) {
            System.out.println(numbers);
        }

        // Using Consumer interface:  int compare(T o1, T o2);
        numberList = ListUtils.sortCustomComparator(numberList, (o1, o2) -> (o1.hashCode() - o2.hashCode()));

        System.out.println("\nSorted numberList:");
        for (Integer numbers : numberList) {
            System.out.println(numbers);
        }
    }
}
