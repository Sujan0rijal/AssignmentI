//Write a Java program for sorting a given list of names in ascending order?

import java.io.*;
import java.util.*;

class assending
{
    public static void main(String args[])
    {
        int i, j;
        System.out.println("Enter number of strings : ");
        Scanner sc = new Scanner(System. in);
        int num = sc.nextInt();
        String a[] = new String[num];
        System.out.println("Enter "+num +" Strings: ");
        for (i=0;i < num;i++)
        {
            a[i]=sc.next();
        }
        for (i=0;i < num;i++)
        {
            for (j=i+1;j < num;j++)
            {
                if (a[i].compareTo(a[j]) > 0)
                {
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Names after sorting  : ");
        for (j=0;j < num;j++)
            System.out.println(a[j]);

    }
}