import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the marks in first subject: ");
        Scanner in = new Scanner(System.in);
        float s1 = in.nextFloat();

        System.out.println("Enter the marks in second subject: ");
        float s2 = in.nextFloat();
        System.out.println("Enter the marks in third subject: ");
        float s3 = in.nextFloat();
        System.out.println("Enter the marks in fourth subject: ");
        float s4 = in.nextFloat();
        System.out.println("Enter the marks in fifth subject: ");
        float s5 = in.nextFloat();

        float percentage =  (s1+s2+s3+s4+s5)*100/500 ;

        System.out.println("Percentage of student is: " + percentage);
    }
}