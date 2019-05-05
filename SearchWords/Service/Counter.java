package SearchWords.Service;

/**
 * Created by ppolozhe on 5/2/19.
 */
public class Counter {
    private int count;
    private static int counter;
    private int recount;
    public  Counter(int count){
        this.count = count;
    }

    public void countWords(){
        counter += count;
    }

    public int getCounter(){
        recount = counter;
        counter = 0;
        return recount;
    }
}
