package ru.geekbrains.java.lesson1.animals;

public class Animal {
    protected String name;
    protected double run;
    protected double swim;
    protected double jump;


    public Animal(String name, double run, double swim, double jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }


    public void run () { System.out.println(name + " пробежал" + run);}

    public void swim () { System.out.println(name + " проплыл" + swim);}

    public void jump() { System.out.println(name + " подпрыгнул" + jump);}


}
