package org.lyc.designpattern.factory;

public class Dog implements AnimalSpeak{

    @Override
    public void speak() {
        System.out.println("dog speak wow");
    }
}
