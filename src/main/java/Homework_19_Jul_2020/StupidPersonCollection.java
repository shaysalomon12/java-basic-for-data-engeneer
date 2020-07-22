package Homework_19_Jul_2020;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Package was copied from homework gives in class
Todo homework
Used this site:
https://www.tutorialspoint.com/the-addall-method-of-java-abstractcollection-class
*/

public class StupidPersonCollection implements Collection<Person> {

    private Person[] persons = new Person[0];

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
        // The input ArrayList which is a Collection
        AbstractCollection<Object> abs1 = new ArrayList<Object>();
        // The StupidPersonCollection Collection
        StupidPersonCollection abs2 = new StupidPersonCollection();
        // Apply containsAll method
        return abs1.remove(abs2);

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // The input ArrayList which is a Collection
        AbstractCollection<Object> abs1 = new ArrayList<Object>(c);
        // The StupidPersonCollection Collection
        StupidPersonCollection abs2 = new StupidPersonCollection();
        // Apply containsAll method
        return abs1.containsAll(abs2);
    }

    @Override
    public boolean addAll(Collection<? extends Person> c) {
        // The input ArrayList which is a Collection
        AbstractCollection<Object> abs1 = new ArrayList<Object>(c);
        // The StupidPersonCollection Collection
        StupidPersonCollection abs2 = new StupidPersonCollection();
        // Apply addAll method
        return abs1.addAll(abs2);

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // The input ArrayList which is a Collection
        AbstractCollection<Object> abs1 = new ArrayList<Object>(c);
        // The StupidPersonCollection Collection
        StupidPersonCollection abs2 = new StupidPersonCollection();
        // Apply removeAll method
        return abs1.removeAll(abs2);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // The input ArrayList which is a Collection
        AbstractCollection<Object> abs1 = new ArrayList<Object>(c);
        // The StupidPersonCollection Collection
        StupidPersonCollection abs2 = new StupidPersonCollection();
        // Apply retainAll method
        return abs1.retainAll(abs2);
    }

    @Override
    public void clear() {
        persons = new Person[0];
    }

    public void printElements(){
        for (Person p: persons){
            System.out.println(p.getName() + "  " + p.getAge());
        }
    }

}
