package Polymorphism;

class poly{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void sum(String a, String b){
        System.out.println(a+b);
    }
}


public class Main1 {
    public static void main(String[] args) {
    poly obj = new poly();
    obj.sum(2, 3);
    obj.sum(23, 05, 04);
    obj.sum("Harsh ", "Jadhav");
    }
}
