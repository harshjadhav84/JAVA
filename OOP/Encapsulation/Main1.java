package Encapsulation;

class Student{
    private String Name;
    private int Age;
    private int Roll_no;

    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public int getRoll_no(){
        return Roll_no;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public void setRoll_no(int Roll_no){
        this.Roll_no = Roll_no;
    }


}

public class Main1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Harsh");
        obj.setAge(21);
        obj.setRoll_no(2016);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRoll_no());
    }
}
