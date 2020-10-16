package my.test;

public class Cat extends Animal
{
    boolean isKitten;
    Cat(String food, String location, boolean isKitten) {
        super(food, location);
        this.isKitten=isKitten;
    }
    @Override
    void makeNoise()
    {
        if (isKitten) System.out.println("Котенок мяукает");
        System.out.println("Кот мурчит");
    }
    @Override
    void eat()
    {
        System.out.println("Кот ест");
    }
}
