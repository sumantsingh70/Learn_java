import java.util.Scanner;

public class kilo_to_miles {
    public static void main(String[] args) {
        System.out.print("Enter the kilometres to convert into miles: ");
        Scanner in = new Scanner(System.in);
        float km = in.nextFloat();

        float miles = (float) (km*0.621371);
        System.out.println("In miles: " + miles);



    }
}
