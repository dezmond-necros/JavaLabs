package my.test;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("input a number");
        int num = in.nextInt();
        System.out.printf("you number: %d \n",num%10);
    }
}
