interface A {
    public void run();
}
interface B {
    public void run();
}
class C implements A,B{
    public void run(){
        System.out.println("C class run method");
    }
}

public class MultipleLevelInheritence {
    public static void main(String[] args){
// java not support multiple inheritence it can be achieve by using interface

C obj = new C();
obj.run();


    }
}
