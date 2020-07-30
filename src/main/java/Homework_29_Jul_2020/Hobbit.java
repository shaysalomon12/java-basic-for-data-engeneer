package Homework_29_Jul_2020;

import com.github.javafaker.Faker;

import java.util.Random;

public class Hobbit implements  Hero{

    private String name;
    private int power;
    private int hp;

    // Constructor
    public Hobbit(String name) {
        // Initial Power
        this.power = 0;
        // Initial HP
        this.hp = 3;
        this.name = "Hobbit " + name;
    }

    public void toCry() {
        System.out.println("I am Crying :-( ");
    }


    @Override
    public void kick(Hero enemy) {
        this.toCry();
    }

    @Override
    public boolean isAlive() {
        // Hobbit cannot be killed
        return true;

    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int newHp) {
        this.hp = newHp;
    }

    @Override
    public void setPower(int newPower) {
        this.power = newPower;
    }

    @Override
    public void setName(String name1) {
        this.name = name1;

    }
}
