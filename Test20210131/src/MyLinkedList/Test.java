package MyLinkedList;


import java.util.Scanner;

public class Test {
    public static Node createList(){
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }
    public static void main(String[] args) {
        Node head = createList();

        //遍历链表，打印链表的每个元素
        System.out.println("遍历链表，打印链表的每个元素");
        for (Node tmp = head; tmp != null; tmp = tmp.next) {
            System.out.println(tmp.val);
        }
        System.out.println("-----------------------------------------");
        //找链表的最后一个节点
        System.out.println("找链表的最后一个节点");
        Node cur = head;
        while(cur != null && cur.next != null){
            cur = cur.next;
        }
        System.out.println(cur.val);
        System.out.println("-----------------------------------------");
        //遍历链表，找到链表的倒数第二个节点
        System.out.println("遍历链表，找到链表的倒数第二个节点");
        cur = head;
        while(cur != null && cur.next != null && cur.next.next != null){
            cur = cur.next;
        }
        System.out.println(cur.val);
        System.out.println("-----------------------------------------");
        //取链表的第n个节点
        System.out.println("取链表的第n个节点:");
        cur = head;
        int index = 3;
        for (int i = 1; i < index; i++) {
            try{
                cur = cur.next;
            }catch(NullPointerException e){
                System.out.println("节点超出上限，该链表共有" + i + "个节点！");
                e.printStackTrace();
            }
        }
        try{
            System.out.println(cur.val);
        }catch(NullPointerException e){
            System.out.println("节点超出上限！");
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------");
        //获取链表的长度
        System.out.println("获取链表的长度:");
        cur = head;
        int count = 0;
        for (;cur != null;cur = cur.next) {
            count++;
        }
        System.out.println("该链表共有" + count + "个节点！");
        System.out.println("-----------------------------------------");
        //遍历链表，是否存在某个元素
        System.out.println("遍历链表，是否存在某个元素:");
        cur = head;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的元素：");
        int findNum = scanner.nextInt();
        for (;cur != null; cur = cur.next) {
            if (cur.val.equals(findNum)){
                break;
            }
        }
        if (cur != null){
            System.out.println("找到了！");
        }else {
            System.out.println("没找到！");
        }
    }
}
