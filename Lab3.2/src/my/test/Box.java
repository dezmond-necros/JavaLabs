package my.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T>
{
    private List<T> items;

    public Box(List<T> items)
    {
        this.items = items;
    }
    public Box(T... obj) {
        items = Arrays.asList(obj);
    }

    public Box() {
        items = new ArrayList<T>();
    }

    public <T> void addBox()
    {

    }
    public void getWeight()
    {

    }

    public void compare()
    {

    }

}
