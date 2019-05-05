package SearchWords.Service;
import SearchWords.Show;

/**
 * Created by ppolozhe on 5/2/19.
 */
public class PrintBadResult implements Show {
    private int num;
    private String normInput;

    public PrintBadResult(String normInput, int num){
        this.normInput = normInput;
        this.num = num;
    }
    public  void show(){
        System.out.println("The word \"" + normInput + "\" is not present in " + num + " sentences");
    }
}
