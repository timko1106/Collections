import java.util.Iterator;
import java.util.HashSet;

public class HashArray<T>{
    private HashSet<T> array;
    private Iterator<T> iterator;

    /**
     * конструктор
     */
    public HashArray(){
        array=new HashSet<>();
    }

    /**
     * метод по добавлению
     * @param adding массив чего добавить
     */
    public void add(T[] adding){
        for (T add:adding) {
            array.add(add);
        }
    }

    /**
     * вывод массива на консоль с помощью foreach
     */
    public void printEach (){
        System.out.println("С помощью foreach:");
        System.out.print("{");
        for (T hash:array) {
            System.out.print(" "+hash);
        }
        System.out.println(" }");
    }

    /**
     * вывод массива с помощью итератора
     */
    public void printIterator (){
        iterator=array.iterator();
        System.out.println("Печать с помощью итератора:");
        System.out.print("{");
        while (iterator.hasNext()){
            System.out.print(" "+iterator.next());
        }
        System.out.println(" }");
    }
}
