package ru.geekbrains.java.lesson1;
import ru.geekbrains.java.lesson1.animals.*;

public class Main {


    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 200,0, 2);

        cat.run();
        cat.swim();
        cat.jump();

        Dog dog = new Dog("Tuzik",500, 10, 0.5);

        dog.run();
        dog.swim();
        dog.jump();



//        Animal[] animals = {
//                new Cat("Barsik", 200,0, 2),
//                new Dog("Tuzik", 500, 10, 0.5)
//
//        };
//        for (int i = 0; i < animals.length; i++) {
//
//        }
//      int distance = 150;
//        if ((dog.run() > distance)  ){
//
//        }





    }

}
