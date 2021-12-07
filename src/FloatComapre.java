import java.util.Scanner;
public class FloatComapre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating point number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second floating point number: ");
        float num2 = sc.nextFloat();
        sc.close();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("They are same");
        } else {
            System.out.println("They are not same");
        }
    }

}