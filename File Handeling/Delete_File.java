import java.io.File; 
public class Delete_File {
    public static void main(String[] args){
        File myFile = new File("File_handling.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{ 
            System.out.println("Failed to deleting the file!!!");
        }
        
    }
    
}
