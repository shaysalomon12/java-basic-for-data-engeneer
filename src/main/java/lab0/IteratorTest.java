package lab0;

import java.util.Iterator;

public class IteratorTest implements Iterator<Person> {

    Person a = new Person();


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Person next() {

        Person person = new Person();
        person.setAge(10);

        return null;
    }
}
