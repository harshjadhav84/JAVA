package Polymorphism;

class Bank{
    void RateOfInterest(){
        System.out.println("Rate of interest is 5%");
    }
}

class SBI extends Bank{
    void RateOfInterest(){
        System.out.println("Rate of interest is 5.5%");
    }
}

class PNB extends Bank{
    void RateOfInterest(){
        System.out.println("Rate of interest is 6%");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Bank obj = new Bank();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();
        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();
    }
}
