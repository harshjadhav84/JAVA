import java.util.Scanner;
class one{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int divident = sc.nextInt();
        int divisor = sc.nextInt();

        try{
            int result = divident/divisor;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("divide by 0 is not possible" + e.getMessage());
        }
    }
}