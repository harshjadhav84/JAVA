public class oop1 {
    String name;
    int roll_no;

    public void printdata(){
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        oop1 std1 = new oop1();
        std1.name = "Ram";
        std1.roll_no = 15;
        std1.printdata();

        oop1 std2 = new oop1();
        std2.name = "sham";
        std2.printdata();
    }
}
