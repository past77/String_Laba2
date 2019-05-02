package SearchWords;

import java.io.*;
import java.util.ArrayList;


/**
 * Created by ppolozhe on 5/2/19.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        MainAlgorithm algorithm = new MainAlgorithm();
        algorithm.setFilePath("/Users/ppolozhe/IdeaProjects/SearchWords/src/text.txt");
        algorithm.Algo();
    }
}
