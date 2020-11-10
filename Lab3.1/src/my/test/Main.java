package my.test;
import my.test.collArr.myCollectionArray;
import my.test.listColl.myListColl;

public class Main {

    public static void main(String[] args)
    {
        myCollectionInterface<String> collection = new myListColl<>();

        collection.add("Hello");
        collection.add(", ");
        collection.add("World");

        for (int i=0;i<collection.size();i++)
        {
            System.out.print(collection.get(i));
        }
        System.out.println("");

        myCollectionInterface<Integer> collection1 = new myListColl<>();
        collection1.add(1);
        collection1.add(1);
        collection1.add(1);
        collection1.add(1);

        for (int i=0;i<collection1.size();i++)
        {
            System.out.print(collection1.get(i));
        }

        System.out.println("");



    }
}
