package my.test;

import my.test.fruits.Apple;
import my.test.fruits.Orange;

public class main
{
    public static void main(String[] args)
    {
        Orange orange = new Orange(1.0f);
        Apple apple = new Apple(1.5f);
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.addBox(new Orange());
        orangeBox1.addBox(new Orange());
        orangeBox1.addBox(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }
}
