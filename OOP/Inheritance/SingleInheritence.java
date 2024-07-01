class Employee{
    void Salary(){
        System.out.println("Salary is: 70000");
    }
}

class Hr extends Employee{
    void Bonus(){
        System.out.println("Bonus is: 20000");
    }
}

public class SingleInheritence {
    public static void main(String[] args) {
        Hr obj = new Hr();
        obj.Salary();
        System.out.println();
        obj.Bonus();

    }
}
