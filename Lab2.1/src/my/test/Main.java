package my.test;

public class Main {

    public static void main(String[] args) {
        Phone iphone = new Phone("4S",79039001020L,150);
        Phone nokia = new Phone("3310",79261700101L,300);
        Phone samsung = new Phone("S10",79162354030L,100);

        System.out.println("iphone params: "+ iphone.model+" "+iphone.weight+" "+iphone.number);
        System.out.println("nokia params: "+ nokia.model+" "+nokia.weight+" "+nokia.number);
        System.out.println("samsung params: "+ samsung.model+" "+samsung.weight+" "+samsung.number);

        iphone.recieveCall("Вадик",7926600000L);
        iphone.getNumber();
        iphone.sendMessage(79233410919L);

        nokia.recieveCall("Мама");
        nokia.getNumber();

        samsung.recieveCall("Иван");
        samsung.getNumber();

    }
}
