import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by ctulhuslp on 13.07.15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        InputStream res = Main.class.getResourceAsStream("/en.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(res));
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
