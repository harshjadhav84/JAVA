// to invoke parent class variable 


class Animal {
    String color = "White";
}

class Dog extends Animal{
    String color = "Black";
    void printcolor(){
        System.out.println(color);   // Black
        System.out.println(super.color); //white
    }
}

public class by_variable {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printcolor();
    }
}
