package SearchWords;

import SearchWords.Service.SearchWords;
import SearchWords.Service.SortWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ppolozhe on 5/2/19.
 */
public class MainAlgorithm {

    private  String[] normInput = null;
    private  String filePath;
    private int count;
    public SearchWords srwr;
    private SortWords sortWords;
    private String s;

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void algo() throws IOException {
    ReadInput readinput = new ReadInput();
    String input =  readinput.readInput();

    input = input.replaceAll("[,]", "");
    normInput = input.split(" ");
        for (int i = 0; i < normInput.length; i++) {
        System.out.printf("\nSearching word : %s\n", normInput[i]);
        try {
            File f1 = new File(filePath);
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((s = br.readLine()) != null) {
                srwr = new SearchWords(s, count, normInput[i]);
                   srwr.searchWord();
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        srwr.setNum(0);
        sortWords = new SortWords(srwr.getNormInput(), srwr.counter.getCounter());
        sortWords.addWords();
        }
        sortWords.show();
    }
}
