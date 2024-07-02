// to invoke parent class method 

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Eating bread.....");
    }
    void bark(){
        System.out.println("Barking dog..");
    }
    void work(){
        super.eat();
        bark();
    }
}
public class by_method {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.work();
    }
}
