package class_atribute_and_method;

class Student{
    String name;
    int roll_no;
    final String address = "Mumbai";
}
public class clasattribute {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Rahul";
        
        System.out.println(std1.name);
        std1.name = "Raman";
        System.out.println(std1.name);

        Student std2 = new Student();
        std2.name = "Riya";
        System.out.println(std2.name);

        Student add1 = new Student();
        //add1.address = "Satara";
        System.out.println(add1.address);
    }
}
