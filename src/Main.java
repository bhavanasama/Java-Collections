import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        boolean rtype = list.add(80);
        list.add(8,90);
        System.out.println(rtype);
        System.out.println(list);
        int k = list.set(6,65);
//        previous element
        System.out.println(k);
        System.out.println(list);
        System.out.println(list.indexOf(90));
        System.out.println(list.indexOf(56));
        list.remove(6);
//        list.remove(10);   gives an exception
        System.out.println(list.get(4));
        System.out.println(list.contains(70));
        System.out.println(list);
//      iteration over the list
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
//      using for each loop
        for (Integer i:
             list) {
            System.out.println(i);
        }
    }
}