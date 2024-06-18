class Student{
    private String name;
    private int age;
    private int roll_no;

    Student(String name, int age, int roll_no){
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }
    
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}


public class privatecls {
    public static void main(String[] args) {
       Student student1 = new Student("Harsh",22, 2016);
       student1.print();
    }
}
