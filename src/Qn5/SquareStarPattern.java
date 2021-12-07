package Qn5;

import  java.util.Scanner;
public class SquareStarPattern {

    public static void main(String[] args)
    {
        int x;
        int i = 1;
        int j;
        Scanner  sc = new Scanner(System.in);

        System.out.print(" Please Enter any Side of a Square : ");
        x = sc.nextInt();

        while(i <= x)
        {
            j = 1;
            while(j <= x)
            {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.print("\n");
        }
    }
}