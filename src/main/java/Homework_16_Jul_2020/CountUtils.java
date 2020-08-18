package Homework_16_Jul_2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountUtils {

    public static void countOccurrences (ArrayList<String> list){

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String s: list) {
            Integer count = frequencyMap.get(s);
            if (count == null)
                count = 0;

            frequencyMap.put(s, count + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

