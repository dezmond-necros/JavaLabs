package my.test;

public class Main {

    public static void main(String[] args)
    {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("вискас","кресло",true);
        animals[1] = new Dog("косточка","будка","Поппи");
        animals[2] = new Horse("сено","сарай",120);

        Veterinar veterinar = new Veterinar();

        for (int i=0;i<animals.length;i++)
        {
           veterinar.treatAnimal(animals[i]);
        }

	}
}
