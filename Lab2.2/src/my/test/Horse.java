package my.test;

public class Horse extends Animal
{
    int weight;
    Horse(String food, String location, int weight) {
        super(food, location);
        this.weight=weight;
    }
    @Override
    void makeNoise()
    {
        System.out.println("Лошадь делает ИГОГО");
    }
    @Override
    void eat()
    {
        System.out.println("лошадь ест сено");
    }
}
