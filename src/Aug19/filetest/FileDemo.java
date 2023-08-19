package Aug19.filetest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class FileDemo {
    public static void main(String[] args) {

      /*  try ( FileWriter fileWriter = new FileWriter("pragra.txt");){

            fileWriter.write("Hello file I am learning java ");
        }
        catch (IOException e){
            System.out.println(e);
        }*/

        try {
            File file = new File("pragra.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){

                String s = scanner.nextLine();
                System.out.println(s.toUpperCase());
            }

        }catch (Exception e){
            System.out.println(e);
        }


       /* File file = new File("pragra1.txt");

        try{
            boolean newFile = file.createNewFile();
            System.out.println(file.isFile());
            file.getName();
            System.out.println(file.delete());

        }
        catch (IOException e){
            System.out.println(e);
        }
*/

    }
}
