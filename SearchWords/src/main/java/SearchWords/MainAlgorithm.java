package SearchWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by ppolozhe on 5/2/19.
 */
public class MainAlgorithm {
    private String[] words = null;
    private  String[] sentences = null;
    private  String[] normInput = null;
    private  String filePath;
    private  DecideWhatBePrint print;
    private int num;
    private int count;


    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void Algo(){

        ReadInput readinput = new ReadInput();
    String input = readinput.readInput();

    input = input.replaceAll("[,]", "");
    normInput = input.split(" ");
        for (int i = 0; i < normInput.length; i++) {
        num = 0;
        System.out.printf("\nsearching word : %s\n", normInput[i]);
        try {
            File f1 = new File(filePath);
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {

                sentences = s.split("\\.");
                for (String sent : sentences) {
                    num++;
                    words = sent.split(" ");
                    for (String word : words) {
                        if (word.equals(normInput[i])) {
                            count++;
                        }
                    }
                    print = new DecideWhatBePrint(normInput[i], count, num);
                    print.Decided();
                    count = 0;
                }
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}
