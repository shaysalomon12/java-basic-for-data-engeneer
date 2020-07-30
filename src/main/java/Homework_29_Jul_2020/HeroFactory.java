package Homework_29_Jul_2020;

import com.github.javafaker.Faker;

import java.util.Random;

public class HeroFactory {

    public static Hero createHero(){

        Random random = new Random();
        Faker faker = new Faker();
        int a = random.nextInt(4) + 1; // range is 1 to 4

        // System.out.println(a);

        if (a == 1){
            Hobbit hobbit = new Hobbit(faker.funnyName().name());
            return hobbit;
        }
        else if (a ==2 ){
            Elf elf = new Elf(faker.funnyName().name());
            return elf;
        }
        else if (a ==3 ){
            King king = new King(faker.funnyName().name());
            return king;
        }
        else if (a ==4 ){
            Knight knight = new Knight(faker.funnyName().name());
            return knight;
        }

        else {
            // Default if no hero was chosen
            Hobbit hobbit = new Hobbit(faker.funnyName().name());
            return hobbit;
        }
    }


}
