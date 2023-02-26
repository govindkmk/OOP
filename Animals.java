package Abstraction;

abstract class Animals {
    abstract void sound();
    static void eat(){
        System.out.println("Animals are Eating a meal.");
    }
    public static void main(String[] args) {
        Animals.eat();
        Cat c = new Cat();
        c.sound();
    
        Dog d = new Dog();
        d.sound();
    
        Loin l = new Loin();
        l.sound();
    }
}
class Cat extends Animals{
    void sound(){
        System.out.println("The Cat Says: meow meow...");
    }
}
class Dog extends Animals{
    void sound(){
        System.out.println("The Dog Says: Bow Beow...");
    }
}
class Loin extends Animals{
    void sound(){
        System.out.println("The Loin Says: Hello boys, agaye jawan hoke...");
    }
}


