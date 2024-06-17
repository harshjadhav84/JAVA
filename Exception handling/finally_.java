public class finally_ {
    public static void main(String[] args) {
        
        try{
            int[] arr = {2,12,3};
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("if try is right or wrong finally will execute itself!!!");;
        }
    }
}
