package my.test.listColl;
import my.test.myCollectionInterface;


public class myListColl<T> implements myCollectionInterface<T>
{
    private T[] array;
    private  int sizeArr;

    public myListColl(int len)
    {
        array = (T[]) new Object[len];
        sizeArr = 0;
    }
    public myListColl()
    {
        this(10);
    }

    public void add(T str)
    {
        if (sizeArr>=array.length)
        {
            increaseArray();
        }
        array[sizeArr] = str;
        sizeArr++;
    }

    private void increaseArray() {
        T[] tmp = (T[])new Object[array.length+2];
        System.arraycopy(array,0,tmp,0,array.length);
        array = tmp;
    }

   public T get(int index)
    {
        return array[index];
    }
    public void delete(int index)
    {
        if(sizeArr <= 0){
            throw new RuntimeException("Collection is empty");
        }

        if (index <= -1){
            throw new RuntimeException("Элемент не найден");
        }

        for (int i = index; i < this.size() - 1 ; i++) {
            array[i] = array[i+1];
        }
        array[this.size() -1] = null;
        sizeArr--;
    }
    public void delete(T str)
    {
        int index = -1;
        if(sizeArr <= 0){
            throw new RuntimeException("Collection is emplty");
        }
        for (int i = 0; i < this.size()-1; i++) {
            if (array[i].equals(str)){
                index = i;
            }
        }

        if (index == -1){
            throw new RuntimeException("Элемент не найден");
        }

        for (int i = index; i < this.size() - 1 ; i++) {
            array[i] = array[i+1];
        }
        array[this.size() -1] = null;
        sizeArr--;
    }
    public int size()
    {
        return sizeArr;
    }
    public void clear()
    {
        for (T str: array){
            str = null;
        }
        sizeArr = 0;
    }

}
