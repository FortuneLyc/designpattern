package org.lyc.designpattern.factory;

public class AnimalFactory {
    public static AnimalSpeak getDog(){
        return new Dog();
    }
    public static AnimalSpeak getCat(){
        return new Cat();
    }

    public static void main(String[] args){
        AnimalSpeak dogSpeak = AnimalFactory.getDog();
        AnimalSpeak catSpeak = AnimalFactory.getCat();
        dogSpeak.speak();
        catSpeak.speak();
    }
}
