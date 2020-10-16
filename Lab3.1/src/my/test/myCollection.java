package my.test;


import java.util.Collection;
import java.util.Collections;


public class myCollection
{
   private E [] array;
   private int size;
   private static final int defLen = 10;

    public myCollection()
    {
        this.array = new E [defLen];
    }

    public myCollection(int size)
    {
        this.size=size;
        if (size >= 0) this.array = new E [size];
    }

    public int size ()
    {
        return size;
    }

    public void add(E item)
    {
        if (size == array.length)
        {
            array = increaseCapacity();
        }
        array[size] = item;
        size++;
    }

    private E [] increaseCapacity(){
        E [] temp = new int[(array.length * 2)];
        System.arraycopy(array, 0, temp, 0, array.length);
        return temp;
    }

    public void remove(int index)  // – удаляет элемент по индексу
    {
        E [] temp = array;
        array = new E [temp.length-1];
        E value = temp[index];
        System.arraycopy(temp, 0, array, 0, index);
        System.arraycopy(temp, index + 1, array, index, temp.length - index - 1);
        size--;
    }

    public void remove(E item)     // – удаляет элемент
    {

    }

    E get(int index)        // – получение элемента по индексу
    {
        return array[index];
    }

    void clear()            // – очищает коллекцию
    {

    }


}
