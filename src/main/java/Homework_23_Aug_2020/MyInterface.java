package Homework_23_Aug_2020;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface MyInterface<T> {

    // Single abstract method interface
    void run(T obj);

}
