package my.test;

public class Main {

    public static void main(String[] args)
    {
        Student[] inst = new Student[3];
        inst[0] = new Aspirant("Иванов","Иван","2МИБ2001",
            5,"Исследование космических котиков");
        inst[1] = new Student("Петров","Петр","3ОТ2020",3);
        inst[2] = new Student("Сидоров","Вася","2МИБ2001",6);

        for (int i = 0;i< inst.length;i++)
        {
            inst[i].getScholarship();
        }
    }
}
