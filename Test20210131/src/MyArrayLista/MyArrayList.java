package MyArrayLista;

public class MyArrayList<E> {
    //属性
    private E[] data = null;
    //最大容量
    private int capacity = 4;
    //有效元素的个数
    private int size = 0;

    //构造方法
    public MyArrayList(){
        this.data = (E[])new Object[capacity];
    }

    //方法:增删改查

    //实现扩容
    private void realloc(){
        capacity <<= 1;
        E[] newData = (E[])new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        newData = null;
    }

    //尾插
    public void add(E elem){
        if (size >= capacity){
            //如果满了，就需要扩容
            realloc();
        }
        data[size++] = elem;
    }
    //指定位置插入元素
    public void add(int index, E elem)throws IndexOutOfBoundsException{
        if(index < 0 || index > size){//等于size相当于是尾插
            throw new IndexOutOfBoundsException("下标越界");
        }
        if (size >= capacity){
            //如果满了，就需要扩容
            realloc();
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = elem;
        size++;
    }

    //按照下标位置删除元素
    public E remove(int index) throws IndexOutOfBoundsException{
        if (index < 0){
            throw new IndexOutOfBoundsException("输入的下标小于下界（下界为0）,你传入的下标是" + index + "。");
        }
        if (index >= size){
            String str = "输入的下标超过上界（上界为" + (size - 1) + "）,你传入的下标是" + index + "。";
            throw new IndexOutOfBoundsException(str);
        }
        E elem = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
        return elem;
    }

    //按照元素的值来删除元素
    public boolean remove(E e){
        int index = 0;
        for (index = 0; index < size; index++) {
            if (data[index].equals(e)){
                break;
            }
        }
        if (index >= size){
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return true;
    }

    //根据下标获取元素
    public E get(int index)throws IndexOutOfBoundsException {
        if (index < 0){
            throw new IndexOutOfBoundsException("输入的下标小于下界（下界为0）,你传入的下标是" + index + "。");
        }
        if (index >= size){
            String str = "输入的下标超过上界（上界为" + (size - 1) + "）,你传入的下标是" + index + "。";
            throw new IndexOutOfBoundsException(str);
        }
        return data[index];
    }

    //根据下标修改元素
    public void set(int index, E e)throws IndexOutOfBoundsException {
        if (index < 0){
            throw new IndexOutOfBoundsException("输入的下标小于下界（下界为0）,你传入的下标是" + index + "。");
        }
        if (index >= size){
            String str = "输入的下标超过上界（上界为" + (size - 1) + "）,你传入的下标是" + index + "。";
            throw new IndexOutOfBoundsException(str);
        }
        data[index] = e;
    }

    //判断元素是否存在
    public boolean contains(E e){
        int i = 0;
        for (; i < size; i++) {
            if (data[i].equals(e)){
                break;
            }
        }
        if (i >= size){
            return false;
        }
        return true;
    }

    //查找元素位置
    public int indexOf(E e){

        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)){
                return i;
            }
        }

        return -1;

    }

    //从后往前查找元素的位置
    public int lastIndexOf(E e){
        for (int i = size - 1; i >=0 ; i--) {
            if (data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    //清空顺序表
    public void clear(){
        size = 0;
    }

    //表中元素的个数
    public int size(){
        return size;
    }

    //空表判断
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < size - 1; i++) {
            str += data[i];
            str += ",";
        }
        str += data[size - 1];
        str += "]";
        return str;
    }
}
