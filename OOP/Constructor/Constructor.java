class Abc {
    int id;
    int age;

    Abc(int id, int age) {
        this.id = id;
        this.age = age;
        System.out.println("Hello");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Abc obj = new Abc(5, 17);
        System.out.println(obj.id + obj.age);
    }
}
