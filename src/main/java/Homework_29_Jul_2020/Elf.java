package Homework_29_Jul_2020;

import com.github.javafaker.Faker;

public class Elf implements Hero{

    private String name;
    private int power;
    private int hp;

    // Constructer
    public Elf(String name) {
        // Initial Power
        this.power = 10;
        // Initial HP
        this.hp = 10;
        this.name = "Elf " + name;
    }

    @Override
    public void kick(Hero enemy) {
        int enemyPower = enemy.getPower();
        if (enemyPower < this.power) {
            enemy.setPower(0);
        }
        else {
            enemy.setPower(enemyPower-1);
        }
    }

    @Override
    public boolean isAlive() {
        if (this.power <= 0) {
            return false;
        }
        else {
            return true;
        }
    }

    // Getters and Setters
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
    public void setName(String name) {
        this.name = name;
    }
}
