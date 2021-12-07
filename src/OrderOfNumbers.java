import java.util.Scanner;

public class OrderOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 ;
        int num2;
        int num3;
        System.out.println("Enter the number 1:");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        num2 = sc.nextInt();
        System.out.println("Enter the number 3:");
        num3 = sc.nextInt();

        if (num1<num2 & num2<num3){
            System.out.println("Assending order");
        }
        else if(num1>num2 & num2>num3){
            System.out.println("Dessending Order");
        }
        else{
            System.out.println("none");
        }

    }
}
