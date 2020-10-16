package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("print num please");
        int num = in.nextInt();
        if (num > 0) num++;
        else if (num < 0) num = num-2;
        else num=10;
        System.out.printf("This num: %d \n",num);
    }
}
