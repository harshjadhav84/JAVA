// to invoke parent class constructor 

class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
}
class Dog extends Animal{
    Dog(){
        super();
    }
}
public class by_constructor {
    public static void main(String[] args) {
       Dog obj = new Dog(); 
    }
}
