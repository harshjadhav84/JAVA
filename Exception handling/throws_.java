public class throws_ {

    public static void divisiondemo(int dividend, int divisior)throws ArithmeticException{
        System.out.println("The result is :" + dividend/divisior);
    }


    public static void main(String[] args) {
        divisiondemo(10, 0);
    }
}
