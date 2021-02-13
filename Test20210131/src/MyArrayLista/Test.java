package MyArrayLista;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList1 = new MyArrayList<>();
        System.out.println(myArrayList1);
        myArrayList1.add("C");
        myArrayList1.add("C++");
        System.out.println(myArrayList1);
        System.out.println("----------------------------------------");
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(1000);
        myArrayList2.add(800);
        myArrayList2.add(0,500);
        myArrayList2.add(3,2000);
        System.out.println(myArrayList2);
        System.out.println("----------------------------------------");
        myArrayList2.remove(Integer.valueOf(500));
        System.out.println(myArrayList2);
        myArrayList2.remove(2);
        System.out.println(myArrayList2);
        System.out.println("----------------------------------------");
        System.out.println(myArrayList2.get(0));
        //System.out.println(myArrayList2.get(3));
        System.out.println("----------------------------------------");
        myArrayList2.set(0,-1);
        System.out.println(myArrayList2);
        myArrayList2.set(1,-2);
        System.out.println(myArrayList2);
        System.out.println(myArrayList2.contains(-1));
        System.out.println(myArrayList2.contains(1));
        System.out.println(myArrayList2.indexOf(-1));
        System.out.println(myArrayList2.indexOf(1));
        myArrayList2.add(0);
        myArrayList2.add(-1);
        myArrayList2.add(3);
        myArrayList2.add(10);
        System.out.println(myArrayList2);
        System.out.println(myArrayList2.lastIndexOf(-1));
        System.out.println(myArrayList2.lastIndexOf(1));
        System.out.println(myArrayList2.size());
        System.out.println(myArrayList2.isEmpty());
        myArrayList2.clear();
        System.out.println(myArrayList2.size());
        System.out.println(myArrayList2.isEmpty());

        List<Integer> list = new LinkedList<>();
    }

}
