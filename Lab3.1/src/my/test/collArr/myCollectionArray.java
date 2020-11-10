package my.test.collArr;
import my.test.myCollectionInterface;


public class myCollectionArray implements myCollectionInterface<String>
{
   private String[] array;
   private int sizeArr;

    public myCollectionArray(int defLen)
    {
        array = new String[defLen];
        sizeArr = 0;
    }

    public myCollectionArray ()
    {
        this(10);
    }

    public int size ()  //возвращает размер массива
    {
        return sizeArr;
    }

    public void add(String item)   //добавление элемента
    {
        if (sizeArr >= array.length)
        {
            increaseArray();
        }
        array[sizeArr] = item;
        sizeArr++;
    }

    private void increaseArray()    //пересоздание массива с +1 элементом
    {
        String[] tmp = new String[array.length+2];
        System.arraycopy(array,0,tmp,0,array.length);
        array = tmp;
    }

    public String get(int index)  // – получение элемента по индексу
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

    public void delete(String str)  //удаление элемента
    {
        int index = -1;
        if(sizeArr <= 0){
            throw new RuntimeException("Collection is empty");
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


    public void clear() //очистка коллекции
    {
        for (String str: array){
            str = null;
        }
        sizeArr = 0;
    }




}
