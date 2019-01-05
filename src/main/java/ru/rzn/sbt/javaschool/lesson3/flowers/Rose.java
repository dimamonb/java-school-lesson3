package ru.rzn.sbt.javaschool.lesson3.flowers;

public class Rose implements Flower {
    @Override
    public String whatIsYourName() {
        System.out.println(this.getClass().getName());
        return this.getClass().getSimpleName();
    }
}
