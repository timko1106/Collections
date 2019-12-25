import java.util.HashMap;

public class Map{
    private HashMap<Character, Integer> array;
    private String text;

    /**
     * конструктор
     * @param text текст для подсчёта
     */
    public Map(String text){
        array=new HashMap<>();
        this.text=text;
    }

    /**
     * метод по подсчёту символов
     */
    public void count(){
        System.out.println("Текст: "+text+".");
        for (Character letter:text.toCharArray()) {
            if (!array.containsKey(letter)){
                array.put(letter, 1);
            }
            else{
                array.put(letter, array.get(letter)+1);
            }
        }
        System.out.println("Подсчет: "+array+".");
    }
}
