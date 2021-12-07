package Qn5;

import java.util.Scanner;

public class InvertedPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up ;
        System.out.println("Enter the height of Qn5.Pyramid: ");
        up = sc.nextInt();

        for(int i = up; i >= 1; --i) {
            for(int a = 1; a <= up - i; ++a) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
