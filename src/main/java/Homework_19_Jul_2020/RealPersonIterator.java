package Homework_19_Jul_2020;

import com.github.javafaker.Faker;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;

public class RealPersonIterator implements Iterator<Person> {

    Person[] person = new Person[0];
    private int counter;
    // Cannot add class Person here
    // Iterator interface has 2 more overide (remove & forEachRemining)


    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super Person> action) {

    }

    @Override
    public boolean hasNext() {
        return counter < person.length;
    }

    @Override
    public Person next() {
        return person[counter++];
    }
}

