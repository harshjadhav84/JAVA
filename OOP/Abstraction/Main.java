package Abstraction;

abstract class Car{
    abstract public void fueltype();
    public void color(){
        System.out.println("Black");
    }
}

class Tata extends Car{
    public void fueltype(){
        System.out.println("Petrol");
    }
}


public class Main {
    public static void main(String[] args) {
        Tata obj = new Tata();
        obj.color();
        obj.fueltype();
    }
}
