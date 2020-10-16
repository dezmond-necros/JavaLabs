package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("введи число");
        int num = in.nextInt();
        if (num == 0) System.out.println("нулевое число");
        else if (num > 0)
        {
            if (num%2 ==0) System.out.println("положительное четное число");
            else System.out.println("положительное нечетное число");
        }
        else if (num < 0)
        {
            if (num%2 ==0) System.out.println("отрицательное четное число");
            else System.out.println("отрицательное нечетное число");
        }

    }
}
