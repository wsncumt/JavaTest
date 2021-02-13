package MyLinkedList;

public class MyLinkedList<E> {
    public E elem;
    public MyLinkedList<E> next;

    public MyLinkedList(E elem){
        this.elem = elem;
    }


    @Override
    public String toString() {
        return "[" + elem + ']';
    }
}
