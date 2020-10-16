package my.test;

public class Animal
{
    String food;
    String location;

    Animal (String food,String location)
    {
        this.food=food;
        this.location=location;
    }

    void makeNoise()
    {
        System.out.println("Животное делает звук))");
    }

    void eat()
    {
        System.out.println("животинка хочет кушац");
    }
    void sleep()
    {
        System.out.println("животное спит");
    }

}
