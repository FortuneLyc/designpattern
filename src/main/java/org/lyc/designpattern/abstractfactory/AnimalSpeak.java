package org.lyc.designpattern.abstractfactory;

public class AnimalSpeak {
    public static AbstrctAnimalFactory getabstrctAnimalFactory(String type){
        if("AnimalFactory".equalsIgnoreCase(type)){
            return new AnimalFactory();
        }else if("AnimalFactory1".equalsIgnoreCase(type)){
            return new AnimalFactory1();
        }else{
            return null;
        }
    }
    public static void main(String[] args){
        AnimalSpeak.getabstrctAnimalFactory("AnimalFactory").getAnimal("cat").speak();
        AnimalSpeak.getabstrctAnimalFactory("AnimalFactory").getAnimal("dog").speak();
        AnimalSpeak.getabstrctAnimalFactory("AnimalFactory1").getAnimal1("cat1").speak();
        AnimalSpeak.getabstrctAnimalFactory("AnimalFactory1").getAnimal1("dog1").speak();
    }
}
