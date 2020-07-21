package Homework_19_Jul_2020;

import java.util.Iterator;

public class StupidPersonIterable implements Iterable<Person> {

    @Override
    public Iterator<Person> iterator() {
        return new RealPersonIterator();
    }
}
