import java.util.ArrayList;

public class Main{
    /**
     * главный метод
     * @param args аргументы
     */
    public static void main(String[] args) {

        System.out.println("Первое задание:");
        HashArray<String> first=new HashArray<>();
        first.add(new String[]{"арбуз","банан","вишня","груша","дыня"});
        first.add(new String[]{"ежевика","женьшень","земляника","ирис","картофель"});
        first.printEach();
        first.printIterator();
        System.out.println("");

        System.out.println("Второе задание:");
        ArrList<Byte> second=new ArrList<>();
        second.add(new Byte[]{5,6,2,0,9,2,5,8,2,9,5,5,6});
        second.bulldozeTrash();
        System.out.println("");

        System.out.println("Третье задание:");
        ArrList<Byte> third=new ArrList<>();
        third.add(new Byte[]{5,6,3,2,1});
        ArrayList<Byte> arr=new ArrayList<>();
        for (Byte a:new Byte[]{4,2,8,9,5}) {
            arr.add(a);
        }
        third.whatCommon(arr);
        System.out.println("");

        System.out.println("Четвёртое задание:");
        Map fourth=new Map("ыванфсмВенмМкенгЫФВсчывпЛымсывЦУсчZSD23%ASDCA3rCaqweY^asxcsc$&sdcIdcxscF");
        fourth.count();
    }
}