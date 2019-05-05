package SearchWords.Service;

import SearchWords.Show;

/**
 * Created by ppolozhe on 5/2/19.
 */
public class PrintGoodResult implements Show {
   private int count;
   private int num;
   private String normInput;

   public PrintGoodResult(String normInput, int count, int num){
       this.normInput = normInput;
       this.count = count;
       this.num = num;
   }
   public void show() {
    System.out.println("The word \"" + normInput + "\" is present for " + count + " times in " + num + " sentence");
    }
}
