package SearchWords;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by ppolozhe on 5/2/19.
 */
//public class SearchWords {
//    private String[] words = null;
//    private  String[] sentences;
//    String[] normInput = null;
//    private int num = 0;
//    private int count = 0;
//    private int i;
//    private String s;
//    BufferedReader br;
//
//    public SearchWords(String s, int i, BufferedReader br){
//        this.s = s;
//        this.i = i;
//        this.br = br;
//    }
//    public String[] Search() throws IOException {
//            System.out.println("s " + s);
//            sentences = s.split("\\.");
//            for (String sent : sentences) {
//                System.out.println("jfj");
//                num++;
//                words = sent.split(" ");
//                for (String word : words) {
//                    if (word.equals(normInput[i])) {
//                        count++;
//                    }
//                }
//                DecideWhatBePrint print = new DecideWhatBePrint(normInput[i], count, num);
//                print.Decided();
//                count = 0;
//            }
//        return normInput;
//    }
//}
