package SearchWords.Service;


/**
 * Created by ppolozhe on 5/2/19.
 */
public class DecideWhatBePrint {
    private int count;
    private int num;
    private String normInput;
    PrintGoodResult pgr;
    PrintBadResult pbr;

    public DecideWhatBePrint(String normInput, int count, int num){
        this.normInput = normInput;
        this.count = count;
        this.num = num;
    }

    public void decided() {
        if (count != 0) {
            pgr = new PrintGoodResult(normInput, count, num);
            pgr.show();
        } else {
            pbr = new PrintBadResult(normInput, num);
            pbr.show();
        }
    }
}
