import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int First = s.nextInt();
        System.out.print("Enter the second number : ");
        int Second = s.nextInt();
        System.out.println("List of prime numbers between " + First + " and " + Second);
        for (int i = First; i <= Second; i++) {
            if (isPrime(i)) {
                System.out.println(i);
           }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
