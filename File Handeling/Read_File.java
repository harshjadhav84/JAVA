import java.util.Scanner;
import java.io.IOException;
import java.io.File;
public class Read_File {
    public static void main(String[] args) {
        File myFile = new File("File_handling.txt");

        try{
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
