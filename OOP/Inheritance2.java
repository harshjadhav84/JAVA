class Vehicle{
    int price;
    int mileage;
    String color;
    
    void display(){
        System.out.println("price is: " + price);
        System.out.println("mileage is: " + mileage);
        System.out.println("color is: " + color);
    }
}

class Car extends Vehicle{
    String ftype;
    boolean sunroof;
    String brand;
}

public class Inheritance2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.price = 200000;
        car1.mileage = 20;
        car1.color = "red";
        car1.display();

        car1.ftype = "Petrol";
        car1.sunroof = true;
        car1.brand = "Tata";

        System.out.println(car1.ftype);
        System.out.println(car1.sunroof);
        System.out.println(car1.brand);

        
    }
}
