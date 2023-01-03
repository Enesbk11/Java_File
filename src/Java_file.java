
import java.util.Scanner;
import java.io.*;

public class Java_file {
    
    public static String path_adress = "file_path_adress";
    
    public static void createFile() {
        File file = new File(path_adress);
        try {
            if (file.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void readFile() {
        File file = new File(path_adress);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
                
            }
            reader.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void writeFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter(path_adress, true));
            bufferedWriter.newLine();
            bufferedWriter.write("text1");
            bufferedWriter.write("text2");
            bufferedWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
    
    public static void fileInfo() {
        File file = new File(path_adress);
        if (file.exists()) {
            System.out.println("file name:" + file.getName());
            System.out.println("file path:" + file.getAbsolutePath());
            System.out.println("Is the file writable?:" + file.canWrite());
            System.out.println("Is the file readable?:" + file.canRead());
            System.out.println("file size:" + file.length());
            
        }
        
    }
    
    public static void main(String[] args) {
        createFile();
        writeFile();
        readFile();
        fileInfo();
        
    }
    
}
