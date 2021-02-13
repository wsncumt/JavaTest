package Node;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static Node creatList(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }

    //按值删除
    public static Node removeValue(Node head, int toDelete){
        if (head == null){
            return head;
        }
        if (head.val == toDelete){
            return head.next;
        }

        Node prev = head;
        while (prev != null && prev.next != null && prev.next.val != toDelete){
            prev = prev.next;
        }
        if (!(prev == null || prev.next == null)) {
            Node deleteNode = prev.next;
            prev.next = deleteNode.next;
            deleteNode.next = null;//回收删除节点的下一个指针
            return head;
        }
        return head;
    }
    //按节点位置删除1
    public static Node removeNode(Node head,Node toDelete){
        if (head == null){
            return head;
        }
        if (head == toDelete){
            return head.next;
        }
        Node prev = head;
        while(prev != null &&  prev.next != toDelete){
            prev = prev.next;
        }
        if (!(prev == null)){
            prev.next = toDelete.next;
            toDelete.next = null;
            toDelete = null;
            return head;
        }
        return head;
    }
    //按节点位置删除2
    public static Node removeNode1(Node head,Node toDelete) {
        if (head == null){
            return head;
        }
        if (head == toDelete){
            return head.next;
        }
        //无法删除最后一个节点
        if (toDelete.next != null){
            toDelete.val = toDelete.next.val;
            toDelete.next = toDelete.next.next;
            return head;
        }
        return head;
    }
    //统计有效值节点的个数
    public static int size(Node head){
        int count = 0;
        for (Node cur = head; cur != null ; cur = cur.next) {
            count++;
        }
        return count;
    }
    //按下标删除
    public static Node removeIndex(Node head, int index){
        //找到待删除节点的前一个位置index - 1
        if (index < 0){
            System.out.println("下标越界，下界为0。您输入的下界是" + index + "。");
            return head;
        }
        if(index >= size(head)){
            System.out.println("下标越界，上界为" + size(head) + "。您输入的下界是" + index + "。");
            return head;
        }
        if (index == 0){
            return head.next;
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static Node removeTail(Node head){
        if (head == null){
            return head;
        }
        Node pre = head;
        while( pre != null &&pre.next.next!= null && pre.next != null){
            pre = pre.next;
        }
        if (!(pre.next == null)){
            pre = pre.next;
            return head;
        }
        return head;
    }
    //把数组转为链表
    public static Node arrayToLinkedList(int[] array){
        Node head = new Node(0);
        Node tmp = head;
        for (int i = 0; i < array.length; i++) {
            Node cur = new Node(array[i]);
            tmp.next = cur;
            tmp = tmp.next;
        }
        return head.next;
    }

    //输出链表
    public static void printLinkedList(Node head){
        for (;head != null; head = head.next){
            System.out.println(head.val);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = creatList();
        Node insert = new Node(-3);
        Node pre = null;
        Node next = null;
//        System.out.println("请输入要插入元素的位置（比如在2和3之间插入，则输入2）");
//        int index = scanner.nextInt();
//        for(pre = head;pre != null;pre = pre.next){
//            if (index == pre.val){
//                next = pre.next;
//                break;
//            }
//        }
//        if (pre != null){
//            insert.next = next;
//            pre.next = insert;
//            insert = null;
//        }else {
//            System.out.println("下标越界，无法插入！");
//        }
//        for (pre = head;pre != null;pre = pre.next){
//            System.out.println(pre.val);
//        }
//        //节点插入到链表的头部
//        insert.next = head;
//        head = insert;
//        for (pre = head;pre != null;pre = pre.next){
//            System.out.println(pre.val);
//        }
        System.out.println("请输入数组的规模：");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        initArray(arr);
        System.out.println(Arrays.toString(arr));
        Node head1 = arrayToLinkedList(arr);
        printLinkedList(head1);
    }


    public static void initArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
    }
}
