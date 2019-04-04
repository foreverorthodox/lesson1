package ru.geekbrains.java.lesson1.animals;

public class Cat extends Animal {

    public Cat(String name, double run, double swim,  double jump) {
        super(name, run, swim, jump);


    }

    @Override
    public void run() {
        System.out.println(name + " пробежал " + run);
    }

    @Override
    public void swim () {
        System.out.println(name + " не умеет плавать " + swim);
    }

    @Override
    public void jump () {
        System.out.println(name + " подпрыгнул " + jump);
    }




}
