import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        //1.创建ArrayList实例
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println("-----------------------------------");
        //2.添加元素
        arrayList.add("C");
        arrayList.add("C++");
        arrayList.add("Java");
        arrayList.add("Python");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);
        System.out.println("-----------------------------------");
        arrayList.add(2,"JavaScript");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);
        System.out.println("-----------------------------------");
        //3.删除元素
        //按位置删除
        //arrayList.remove(2);
        //System.out.println(arrayList);
        arrayList.add(5,"JavaScript");
        arrayList.remove("JavaScript");
        System.out.println(arrayList);
        System.out.println("-----------------------------------");
        List<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList2.add(i+1);
        }
        arrayList2.remove(2);
        System.out.println(arrayList2);
        System.out.println("-----------------------------------");
        arrayList2.remove(Integer.valueOf(2));
        System.out.println(arrayList2);
        System.out.println("-----------------------------------");
        //4.查找
        boolean ret  = arrayList.contains("go");
        System.out.println("查找go的结果："+ ret);

        int index = arrayList.indexOf("go");
        System.out.println("查找go的位置："+ index);
        System.out.println("-----------------------------------");
        //5.获取元素/修改元素
        System.out.println(arrayList.get(0));
        arrayList.set(0,"C#");
        System.out.println(arrayList);
        System.out.println("-----------------------------------");
        //6.遍历操作
        //通过下标遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //通过迭代器来遍历
        //先通过iterator方法获取到迭代器对象
        Iterator<String> iterator = arrayList.iterator();
        //再通过while循环来进行遍历
        while (iterator.hasNext()){
            String elem = iterator.next();
            System.out.println(elem);
        }
        //使用for-each来遍历
        for (String str:arrayList) {
            System.out.println(str);
        }
    }
}
