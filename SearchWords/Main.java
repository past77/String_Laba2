package SearchWords;

import SearchWords.Service.MainAlgorithm;

import java.io.*;
/**
 * Created by ppolozhe on 5/2/19.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MainAlgorithm algorithm = new MainAlgorithm();
        algorithm.setFilePath("C:\\Users\\Professional\\IdeaProjects\\SearchWords\\src\\main\\java\\SearchWords\\text.txt");
        algorithm.Algo();
    }
}
