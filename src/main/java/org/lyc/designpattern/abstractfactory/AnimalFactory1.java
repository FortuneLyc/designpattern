package org.lyc.designpattern.abstractfactory;

public class AnimalFactory1 extends  AbstrctAnimalFactory{
    @Override
    public Animal getAnimal(String type) {
        return null;
    }

    @Override
    public Animal1 getAnimal1(String type){
        if("cat1".equalsIgnoreCase(type)){
            return new Cat1();
        }else if("dog1".equalsIgnoreCase(type)){
            return new Dog1();
        }else{
            return null;
        }
    }
}
