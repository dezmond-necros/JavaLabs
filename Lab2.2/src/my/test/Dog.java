package my.test;

import java.awt.*;

public class Dog extends Animal
{
    String name;

    Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }
    @Override
    void makeNoise()
    {
        System.out.println("Песик лает");
    }
    @Override
    void eat()
    {
        System.out.println("Собакен грызет корм");
    }
}
