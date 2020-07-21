package Homework_19_Jul_2020;

import java.util.Objects;

public class Person {

    public final static int MAX_AGE = 120;

    private String name;
    private int age;

    public int doWork(String what) {
        return 4;
    }

    public void printWeight() {
        Person person = new Person();

        int a;
        a = person.doWork("work to do");
        System.out.println(a);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printPersonClassName() {
        System.out.println("Person");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getAge() {
        var x = 4.0;
        x = 4.5;

        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > MAX_AGE) {
            throw new IllegalStateException("age is not in valid range. age =  " + age);

        } else {
            this.age = age;
        }
    }

    public void printMyAge() {
        System.out.println("age = " + age);
    }
}
