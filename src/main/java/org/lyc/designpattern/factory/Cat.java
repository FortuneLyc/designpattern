package org.lyc.designpattern.factory;

public class Cat implements AnimalSpeak {
    @Override
    public void speak() {
        System.out.println("cat speak miu");
    }
}
