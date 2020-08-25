package Homework_23_Aug_2020;

import java.util.*;
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

        // Using Consumer interface
        System.out.println("Using Consumer interface");
        ListUtils.forEachWithDelay_Consumer(colorList, 1000,(a1) -> System.out.println("Current color is " + a1) );
        //ListUtils.forEachWithDelay_Consumer(colorList, 1000,(a1) -> System.out.println(new StringJoiner("Current color is ").add(a1)));

        // Using MyInterface interface
        System.out.println("Using MyInterface interface");
        ListUtils.forEachWithDelay_myInterface(colorList, 300, (a1) -> System.out.println("Current color is " + a1));

    }

}
