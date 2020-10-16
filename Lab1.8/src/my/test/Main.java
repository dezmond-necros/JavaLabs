package my.test;
import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] num = new int[] {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        printArray(num);
        maxArray(num);
        sumPositive(num);
        sumMinusNumber(num);
        kolvoPositive(num);
        ariphmetics(num);
    }


    public static void printArray(int[] num)
    {
        System.out.print("Вывод эталонного массива: ");
        for (int i=0;i<num.length;i++) System.out.print(num[i]+" ");
        System.out.println();
    }

    public static void maxArray(int[] num)
    {
        int max = num[0];
        for (int i=0;i<num.length;i++)
            if (num[i] > max) max = num[i];
        System.out.println("Максимальное число: "+max);
    }

    public static void sumPositive(int[] num)
    {
        int sum = 0;
        for (int i=0;i<num.length;i++)
            if (num[i] > 0) sum = sum+ num[i];
        System.out.println("Сумма положительных элементов массива: "+sum);
    }

    public static void sumMinusNumber(int[] num)
    {
        int sum = 0;
        for (int i=0;i<num.length;i++)
            if ((num[i] < 0)&&(num[i]%2==0)) sum = sum+ num[i];
        System.out.println("Сумма отрицательных четных элементов массива: "+sum);
    }

    public static void kolvoPositive(int[] num)
    {
        int kolvo = 0;
        for (int i=0;i<num.length;i++)
            if ((num[i] > 0)) kolvo++;
        System.out.println("Количество положительных элементов массива: "+kolvo);
    }

    public static void ariphmetics(int[] num)
    {
        double a = 0;
        int sum = 0;
        for (int i=0;i<num.length;i++)
            if ((num[i] < 0))
            {
                sum++;
                a = a+num[i];
            }
        a = a/sum;
        System.out.println("Среднее арифметическое отрицательных элементов массива: "+a);
    }
}
