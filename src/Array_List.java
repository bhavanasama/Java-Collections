import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(5,16);
        list.set(2,18);
        list.remove(2);
        System.out.println(list.get(4));
        System.out.println("Original ArrayList is ..." + list);
//        sort the arraylist
        System.out.println("Sorted ArrayList is ...");
        Collections.sort(list);
//        System.out.println(list);
        System.out.println(list.size());
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.size());
        list.add(null);
        System.out.println(list);
        System.out.println(list.size());

        list.add(null);
        System.out.println(list);
        System.out.println(list.size());


        System.out.println("Heterogeneous Array List Created using Object Type ");
        ArrayList<Object> het = new ArrayList<>();
        het.add("Bhavana");
        het.add(12);
        het.add(6.7D);
        het.add(null);
        System.out.println(het);
        System.out.println(het.size());


        System.out.println("Array List Created using Capacity");
        ArrayList<Integer> cap = new ArrayList<>(3);
        cap.add(12);
        cap.add(24);
        cap.add(36);
        System.out.println(cap);
        System.out.println(cap.size());
        System.out.println(cap.hashCode());
        cap.add(48);
        System.out.println(cap);
        System.out.println(cap.size());
        System.out.println(cap.hashCode());

//      iteration over AL using iterator and enumeration class
        List<Integer> example = Arrays.asList(1,2,3,4,5,6,7,8);
        Iterator i = example.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        Enumeration<Integer> en = Collections.enumeration(example);
        while(en.hasMoreElements()){
            System.out.print(en.nextElement() + " ");
        }

        System.out.println();
//      addAll() method
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println("AL is "+al);

        ArrayList<Integer> bl = new ArrayList<>();
        bl.add(40);
        bl.add(50);
        bl.add(60);
        System.out.println("BL is "+bl);

        al.addAll(bl);
        System.out.println("Combined is" + al);

        al.addAll(1,bl);
        System.out.println("Combined is" + al);


//      cloning of al - shallowcopy
        ArrayList<Integer> cl = new ArrayList<>();
        cl = (ArrayList<Integer>) al.clone();
        System.out.println("Cloned AL is "+cl);
        System.out.println(cl.hashCode());
        System.out.println(al.hashCode());
        System.out.println(cl.isEmpty());


    }
}
