package org.lyc.designpattern;

//单例模式
public class Singleton {
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }

    //重写私有构造方法，防止其他类通过构造方法实例化
    private Singleton(){

    }
    //创建一个实例缓存
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
