import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write_file {
    public static void main(String[] args) {
        try{
            FileWriter obj = new FileWriter("File_handling.txt");
            obj.write("This is our first file from this java course \nOK now Byee!!");
            obj.close();
            System.out.println("Successfully wrote the file");
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
