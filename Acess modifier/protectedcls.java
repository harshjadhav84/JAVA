class Student{
    protected String name;
    protected int age;
    protected int roll_no;
    
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}


public class protectedcls {
    public static void main(String[] args) {
       Student student1 = new Student();
       student1.name = "Harsh"; 
       student1.age = 22; 
       student1.roll_no = 2016; 
       student1.print();
    }
}
