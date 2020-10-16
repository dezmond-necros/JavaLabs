package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int num = in.nextInt();
        int sum = 0;
        while (num>0)
        {
            sum = sum+ num%10;
            num=num/10;
        }
        System.out.printf("сумма чисел: %d \n",sum);
	}
}
