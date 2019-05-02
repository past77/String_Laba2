package SearchWords.Service;

import SearchWords.Show;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by ppolozhe on 5/2/19.
 */
public class SortWords implements Show {
    private String input;
    private int count;
    static Map<String, Integer> hashMap = new HashMap<String, Integer>();

    public SortWords(String input, int count)
    {
        this.input  = input;
        this.count = count;
    }
    public  void addWords(){
        hashMap.put(input, count);
    }
    public  void Show(){
        for (Map.Entry<String, Integer> me : hashMap.entrySet()) {
            System.out.print("\nsorted array : \"" + me.getKey() + "\" - " + me.getValue()+ " \n");
        }
    }
}
