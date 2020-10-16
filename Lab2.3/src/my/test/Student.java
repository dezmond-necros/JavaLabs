package my.test;

public class Student
{
    String firstName;
    String lastName;
    String group;
    double averageMask;

    Student (String firstName,String lastName,String group, double averageMask)
    {
        this.averageMask = averageMask;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public void getScholarship()
    {
        if (averageMask==5) System.out.println("Стипуха будет 100");
        else if (averageMask<5) System.out.println("Стипуха увы только 80");
        else System.out.println("Мамкин хакер детектед");
    }
}
