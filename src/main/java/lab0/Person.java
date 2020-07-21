package lab0;

public class Person {

    public final static int MAX_AGE = 120;
    private String name;
    private int age;

    public static int getMaxAge() {
        return MAX_AGE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
