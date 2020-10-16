package my.test;

public class Phone {

    long number;
    String model;
    int weight;

    Phone(String model,long number)
    {
        this.model = model;
        this.number = number;
    }

    Phone(String model,long number,int weight)
    {
        this(model,number);
        this.weight=weight;

    }

    Phone()
    {
        model = "undefined";
        weight = 0;
        number = 0;
    }

    public void recieveCall(String name)
    {
        System.out.println("Звонит "+ name);
    }
    public void recieveCall(String name, long num)
    {
        System.out.println("Звонит "+ name+""+ num);
    }

    public void getNumber()
    {
        System.out.println("Номер телефона "+ number);
    }

    public void sendMessage(long num1)
    {
        System.out.println("Сообщение отправлено абоненту:  "+ number);
    }
}
