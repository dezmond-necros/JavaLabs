package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("print 3 num please");
        int num[]=new int[3];
        for (int i = 0;i< num.length;i++)
        {
          num[i] = in.nextInt();
        }
        int min=num[0];
        for (int i = 0;i< num.length;i++)
        {
            if (min > num[i]) min = num[i];
        }

        System.out.printf("Min num: %d \n",min);
    }
}
