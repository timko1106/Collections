import java.util.HashMap;
import java.util.Iterator;

public class Map{
    private HashMap<Character, Integer> array;
    private String text;
    private Iterator<Integer> iterator;

    public Map(String text){
        array=new HashMap<>();
        this.text=text;
    }

    public void count(){
        for (Character letter:text.toCharArray()) {
            if (!array.containsKey(letter)){
                array.put(letter, 1);
            }
            else{
                array.put(letter, array.get(letter)+1);
            }
        }
        System.out.println(array);
    }
}
