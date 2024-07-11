import java.io.File;
import java.io.IOException;
class Create_File {
    public static void main(String[] args) {
        File myFile = new File("File_handling.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace();
        }
}
}