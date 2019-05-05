package SearchWords.Service;

import SearchWords.Service.Counter;
import SearchWords.Service.DecideWhatBePrint;

/**
 * Created by ppolozhe on 5/5/19.
 */
public class SearchWords {
    private String[] words;
    private String[] sentences = null;
    private String normInput;
    private DecideWhatBePrint print;
    static private int num ;
    private int count;
    public Counter counter;
    String s;


    public String getNormInput() {
        return normInput;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public SearchWords(String s, int count, String normInput){
        this.s = s;
        this.normInput = normInput;
        this.count = count;
    }
    public void searchWord() {
        sentences = s.split("\\.");
        for (String sent : sentences) {
            num++;
            words = sent.split(" ");
            for (String word : words) {
                if (word.equals(normInput)) {
                    count++;
                }
            }
            counter = new Counter(count);
            counter.countWords();
            print = new DecideWhatBePrint(normInput, count, num);
            print.decided();
            count = 0;
        }
    }
}