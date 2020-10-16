package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] num = new int[] {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        printArray(num);
        reverseZero(num);

    }


    public static void printArray(int[] num)
    {
        System.out.print("Вывод массива: ");
        for (int i=0;i<num.length;i++) System.out.print(num[i]+" ");
        System.out.println();
    }

    public static void reverseZero(int[] num)
    {
        int t = 0;
        int j= num.length-1;
        for (int i=0;i<=j;i++)
            if ((num[i] == 0))
            {
                if (num[i]==num[j]) j--;
                    t = num[j];
                    num[j] = num[i];
                    num[i]=t;
                    j--;
            }
        printArray(num);
    }


}
