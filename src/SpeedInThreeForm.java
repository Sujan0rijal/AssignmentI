import java.util.Scanner;
public class SpeedInThreeForm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  length in meter:");
        float meter=sc.nextInt();
        System.out.println("Enter the time in hour:");
        float hour=sc.nextInt();
        System.out.println("Enter the time in minutes:");
        float min=sc.nextInt();
        System.out.println("Enter the time in second:");
        float sec=sc.nextInt();
        float ram = rame(meter,sec);
        float sha = sham(hour,meter);
        float rya = raya(meter,hour);

        System.out.println("The speed in meter/second is"+ram);
        System.out.println("The speed in kilometer/hour is"+sha);
        System.out.println("The speed in miles/hour is"+rya);


    }

    private static float raya(float meter, float hour) {
        return (meter/0.1069f)/hour;
    }

    private static float sham(float hour, float meter) {
        return (meter/1000)/hour;
    }

    public static float rame(float meter,float sec){
        return meter/sec;

    }
}
