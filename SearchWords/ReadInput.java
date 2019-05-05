package SearchWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ppolozhe on 5/2/19.
 */
public class ReadInput {
    public ReadInput(){}

    public String readInput() throws IOException {
        String str = "";
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line of words: ");
        try {
            str = stdin.readLine();
        } catch (IOException ex) {
            System.out.println("Reading error");
        }
        stdin.close();
        return str;
    }

}
