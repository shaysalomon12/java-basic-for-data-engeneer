package Homework_30_Aug_2020;

import java.util.*;
import java.util.stream.Collector;

public class ListUtils {

    public static <T> List<T> sortCustomComparator(List<T> list, CustomComparator customComparator) {
        T a;
        List<T> newList = new ArrayList<>(list);
        for (int i = 0; i < newList.size(); i++) {
            for (int j = 1+i; j < newList.size(); j++){
                if (customComparator.run(newList.get(i), newList.get(j)) > 0 ){
                    a = newList.get(j);
                    newList.set(j,newList.get(i));
                    newList.set(i, a);
                }
            }
        }
        return newList;
    }
}
