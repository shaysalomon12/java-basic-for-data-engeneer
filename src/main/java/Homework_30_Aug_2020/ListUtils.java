package Homework_30_Aug_2020;

import java.util.*;
import java.util.stream.Collector;
import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class ListUtils {

    public static <T> List<T> sort(List<T> list, Comparator<T> comparator){

        List<T> newList = new ArrayList<>(list);
        newList.sort((Comparator<? super T>) CASE_INSENSITIVE_ORDER);
        return newList;

    }

    public static <T> List<T> sortWithCustomComparator(List<T> list, CustomComparator<T> comparator){

        List<T> newList = new ArrayList<>(list);
        newList.sort((Comparator<? super T>) CASE_INSENSITIVE_ORDER);
        return newList;

    }
}
