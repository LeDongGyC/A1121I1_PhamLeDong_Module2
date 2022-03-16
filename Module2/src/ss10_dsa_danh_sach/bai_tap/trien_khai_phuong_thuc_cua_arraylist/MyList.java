package ss10_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_cua_arraylist;

import ss7_asbtract_and_interface.thuc_hanh.lop_animal_and_interface_edible.Animal;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        size = 0;
        for (int i = 0; i <elements.length ; i++) {
            elements[i] = null;
        }
    }

    public void ensureCapa(int minCapacity){
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public boolean add (E e){
        elements[size] = e;
        size++;
        return true;
    }


    public void add(int index , E element){
        if (index < 0 || index >size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else if (elements.length == size){
            ensureCapa(size+1);
        }
        for (int i = size+1; i >=index ; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }

    public E get(int i){
        if (i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public int indexOf(E o){
        for (int i = 0; i<elements.length; i++){
            if (elements[i]==o){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E o){
        return this.indexOf(o)>=0;
    }
    public MyList<E> clone(){
        MyList<E> myListCopy = new MyList<>(this.size());
        for (int i = 0; i <size ; i++) {
            myListCopy.elements[i] = this.elements[i];
        }
        return (MyList<E>)myListCopy;
    }
}
