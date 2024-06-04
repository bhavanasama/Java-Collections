import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(12);
        ll.add(13);
        ll.add(1,11);
        System.out.println(ll);
        ll.set(0,null);
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);
        System.out.println(ll.get(2));

            Collection<Integer> col = new ArrayList<>();
            col.add(50);
            col.add(100);

        ll.addAll(col);
        System.out.println(ll);
        ll.addAll(3,col);
        System.out.println(ll);
        ll.addFirst(9);
        ll.addLast(108);
        System.out.println(ll);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2 = (LinkedList<Integer>) ll.clone();
        System.out.println("Cloned linked list  "+l2);


        System.out.println("head element "+ll.element());
        System.out.println("indexOf element"+ll.indexOf(7));
        System.out.println("last index element "+ll.lastIndexOf(50));

    }
}
