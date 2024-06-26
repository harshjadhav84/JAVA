class Student{
    String name;
    int age;
    int roll_no;
    
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}


public class defaultcls {
    public static void main(String[] args) {
       Student student1 = new Student();
       student1.name = "Harsh"; 
       student1.age = 22; 
       student1.roll_no = 2016; 
       student1.print();
    }
}
