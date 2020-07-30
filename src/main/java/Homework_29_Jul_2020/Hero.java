package Homework_29_Jul_2020;

public interface Hero {

    void kick(Hero enemy);

    public boolean isAlive();

    int getPower();

    String getName();

    int getHp();

    void setHp(int newHp);

    void setPower(int newPower);

    void setName(String name);


}
