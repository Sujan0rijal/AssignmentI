package Qn5;

import java.util.Scanner;
public class HollowSquarePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int up = sc.nextInt();
        System.out.println("Enter the number of col");
        int down = sc.nextInt();
        for (int i = 1; i <=up; i++) {
            for (int j = 1; j <= down; j++)
                if((i==1 || i==down) || (j==1 || j==down))
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

        }
    }
}