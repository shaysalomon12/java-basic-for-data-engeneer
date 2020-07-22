package Homework_19_Jul_2020;

import java.util.Iterator;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        StupidPersonIterable pi = new StupidPersonIterable();
        Iterator<Person> iterator = pi.iterator();

        StupidPersonCollection pc = new StupidPersonCollection();
        while (iterator.hasNext()) {
            pc.add(iterator.next());
        }

        // Create pN objects of type Person
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

        // Add Element to Collection pc
        p1.setName("Avi");
        p1.setAge(10);
        pc.add(p1);

        p2.setName("Yulia");
        p2.setAge(22);
        pc.add(p2);

        p3.setName("Ronit");
        p3.setAge(30);
        pc.add(p3);

        p4.setName("Miri");
        p4.setAge(40);
        pc.add(p4);

        p5.setName("Edi");
        p5.setAge(50);
        pc.add(p5);

        // Print all elements in Collection
        pc.printElements();

        // /remove Element from Collection pc
        System.out.println("Remove: " + pc.remove(p5));
        // pc.printElements();


    }

}
