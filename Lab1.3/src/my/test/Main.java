package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("print please");
        int num = in.nextInt();
        if (num > 0)
        {
            num++;
        }
        System.out.printf("This: %d \n",num);
    }
}
