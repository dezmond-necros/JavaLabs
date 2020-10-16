package my.test;

public class Aspirant extends Student
{

    String scienceWork;
    Aspirant(String firstName, String lastName, String group, double averageMask,String scienceWork)
    {
        super(firstName, lastName, group, averageMask);
        this.scienceWork = scienceWork;
    }
}
