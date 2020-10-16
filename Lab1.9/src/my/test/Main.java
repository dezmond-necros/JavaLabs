package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] num = new int[] {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        printArray(num);
        reverseArray(num);
    }


    public static void printArray(int[] num)
    {
        System.out.print("Вывод массива: ");
        for (int i=0;i<num.length;i++) System.out.print(num[i]+" ");
        System.out.println();
    }

    public static void reverseArray(int[] num)
    {
        int[] reverseNum = new int[num.length];
        for (int i=0;i<reverseNum.length;i++) reverseNum[i]=num[num.length-1-i];
        printArray(reverseNum);
    }


}
