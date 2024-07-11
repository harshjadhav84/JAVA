import java.io.File;
import java.io.IOException;
class Create_File {
    public static void main(String[] args) {
        File myFile = new File("File_handling.txt");
        try{
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            }
            else{
                System.out.println("File already exist");
            }
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
}
}