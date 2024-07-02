class A{
    public void printA(){
        System.out.println("Metod A runs");
    }
}

class B extends A{
    public void printB(){
        System.out.println("Methos B runs");
    }
}

class C extends A{
    public void printC(){
        System.out.println("Method C runs");
    }
}
public class Hierarchical_inheritance{
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.printA();
        obj2.printA();
    }
}