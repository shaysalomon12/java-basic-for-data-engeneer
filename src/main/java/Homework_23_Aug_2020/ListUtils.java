package Homework_23_Aug_2020;

import java.util.List;
import java.util.function.Consumer;

public class ListUtils {

    public static <T> void forEachWithDelay_Consumer(List<T> list, int delay, Consumer<T> consumer) {
        for (T list1 : list) {
            consumer.accept(list1);
            try {
                System.out.println("Delaying " + delay + " milisecs ...");
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static <T> void forEachWithDelay_myInterface(List<T> list, int delay, MyInterface<T> myinterface) {
        for (T list1 : list) {
            myinterface.run(list1);
            try {
                System.out.println("Delaying " + delay + " milisecs ...");
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
