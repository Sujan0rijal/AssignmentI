import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mass;
        float height;
        System.out.println("Enter the mass: ");
        mass = sc.nextInt();
        System.out.println("Enter the height: ");
        height = sc.nextInt();
        float ram = rame(mass,height);
        System.out.println("BMI of a person is " + ram);
    }
    public static float rame(float mass,float height){
        return mass / (height * height);
    }
}
