package Homework_29_Jul_2020;

import java.util.Random;

public class Knight implements Hero {

    Random random = new Random();
    private String name;
    private int power;
    private int hp;

    // Constructor
    public Knight(String name) {
        // Initial Power 2-12
        this.power = random.nextInt(11)+2;
        // Initial HP 2-12
        this.hp = random.nextInt(11 )+2;
        this.name = "Knight " + name;
    }

    @Override
    public void kick(Hero enemy) {
        int enemyPower = enemy.getPower();
        int kickPower = random.nextInt(this.getPower());
        enemy.setPower(enemyPower-kickPower);
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
    public void setName(String name1) {
        this.name = name1;
    }
}
