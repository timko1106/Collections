import java.util.ArrayList;

public class ArrList<T> {
    private ArrayList<T> array;

    /**
     * конструктор
     */
    public ArrList() {
        array=new ArrayList<>();
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
     * @param array массив для печати
     */
    private void printEach (ArrayList<T> array){
        System.out.print("{");
        for (T arr:array) {
            System.out.print(" "+arr);
        }
        System.out.println(" }");
    }

    /**
     * очищение массива от повторяющихся элементов
     * @param ar массив
     * @return массив после очистки
     */
    private ArrayList<T> clear (ArrayList<T> ar){
        ArrayList<T> see=new  ArrayList<>();
        for (T arr:ar) {
            if (see.indexOf(arr)==-1){
                see.add(arr);
            }
        }
        return see;
    }

    /**
     * очищение массива от повторяющихся с печатью
     */
    public void bulldozeTrash (){
        System.out.println("Прошлая версия:");
        printEach(array);
        array=clear(array);
        System.out.println("Стало после очищения:");
        printEach(array);
    }

    /**
     * печать элементов обеих коллекций
     * @param second вторая колекция
     */
    public void whatCommon (ArrayList<T> second){
        System.out.println("Первая коллекция:");
        printEach(array);
        ArrayList<T> ar1=clear(array);
        System.out.println("Вторая коллекция:");
        printEach(second);
        System.out.println("Элементы, которые содержатся в обеих коллекциях:");
        System.out.print("{ ");
        for (T el:ar1) {
            if (second.indexOf(el)!=-1)
            {
                System.out.print(el+" ");
            }
        }
        System.out.println("}");
    }
}