package org.lyc.designpattern.abstractfactory;

public class AnimalFactory extends AbstrctAnimalFactory {
    @Override
    public Animal getAnimal(String type)
    {
        if("cat".equalsIgnoreCase(type)){
           return new Cat();
        }else if("dog".equalsIgnoreCase(type)){
            return new Dog();
        }else{
            return null;
        }
    }
    @Override
    public Animal1 getAnimal1(String type) {
        return null;
    }
}
