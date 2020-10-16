package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("введи код города: ");
        int num = in.nextInt();
        double time = 10;
        switch (num)
        {
            case 905:
                System.out.printf("Москва, стоимость разговора: %s \n",time*4.15);
                break;
            case 194:
                System.out.printf("Ростов, стоимость разговора: %s \n",time*1.98);
                break;
            case 491:
                System.out.printf("Краснодар, стоимость разговора: %s \n",time*2.69);
                break;
            case 800:
                System.out.printf("Киров, стоимость разговора: %s \n",time*5.00);
                break;
            default:
                System.out.println("неверный код города");
        }
    }
}
