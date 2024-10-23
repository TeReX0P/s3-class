import java.io.FileWriter;
import java.util.Scanner;
public class filewriter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("eneter file name with .txt: ");
        String filePath = s.nextLine();
        System.out.print("enter the contend to write :");
        String content = s.nextLine();
        try{
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(content);
            System.out.println("Successfully wrote to the file.");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}