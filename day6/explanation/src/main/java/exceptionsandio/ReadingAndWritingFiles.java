package exceptionsandio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class ReadingAndWritingFiles {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("someFile.txt")){
            int i;
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Whoops, can't find it");
            System.out.println(e.getMessage());
        }

        System.out.println("Let's move on...");

        try(FileWriter fw = new FileWriter("someFile2.txt", true)) {
            fw.write("promise\n");
        } catch (IOException e) {
            System.out.println("Something went wrong");
            System.out.println(e.getMessage());
        }

    }
}
