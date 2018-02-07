package C8060117;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C8060117 {
    public static void main(String[] args) {
        int i = 1;
        File file = new File("E:\\Develop\\JAVA_CLASS\\HomeWork\\src\\C8060117\\C8060117.java");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(i + ": " + line);
                i++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
