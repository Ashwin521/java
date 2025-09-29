
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        String filename = "example.txt";
        FileWriter writer=null;
        try {
            writer = new FileWriter(filename);
            writer.append("Updated text");
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file");
            e.getMessage();
        } finally {
            if(writer!= null){
                writer.close();
            }
            
        }
    }
}
