package Homework_19_Jul_2020;

import java.util.Collection;
import java.util.Iterator;

/*
Package was copied from homework gives in class
Todo homework
*/

public class StupidPersonCollection implements Collection<Person> {

    private Person[] persons = new Person[3];

    public StupidPersonCollection() {

        StupidPersonIterable people = new StupidPersonIterable();
        Iterator<Person> iterator = people.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            persons[i++] = iterator.next();
        }

    }

    @Override
    public int size() {
        return persons.length;
    }

    @Override
    public boolean isEmpty() {
        return persons.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Person person : persons) {
            if (person.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Person> iterator() {
        return new RealPersonIterator();  //replaced it with RealPersonIterator()
    }

    @Override
    public Object[] toArray() {
        return persons;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) persons;
    }

    @Override
    public boolean add(Person person) {
        Person[] newPersons = new Person[persons.length + 1];

        // Replaced the number 3 in the example with "persons.length"
        System.arraycopy(persons, 0, newPersons, 0,persons.length);
        newPersons[persons.length] = person;
        persons = newPersons;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        StupidPersonIterable people = new StupidPersonIterable();
        Iterator<Person> iterator = people.iterator();
        Person p1 = new Person();
        Boolean b = false;

        while (iterator.hasNext()){
            p1 = iterator.next();
            if (p1.equals(o)){
                iterator.remove();
                b = true;
            }
        }
       return b;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Person> c) {

        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        persons = new Person[0];
    }

}
