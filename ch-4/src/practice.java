import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //P-2

//        System.out.print("Enter marks in first subject:");
//        float n1 = in.nextFloat();
//        System.out.print("Enter marks in second subject:");
//        float n2 = in.nextFloat();
//        System.out.print("Enter marks in third subject:");
//        float n3 = in.nextFloat();
//        float total = n1+n2+n3;
//        float total_percentage = (total/300)*100;
//
//        if (total_percentage>=40 && n1>=33 && n2>=33 && n3>=33){
//            System.out.println("student is pass");
//        }
//        else {
//            System.out.println("student is fail");
//        }

        //P-3
//        float tax = 0 ;
//        float income = in.nextFloat();
//        if (income<2.5f){
//            tax=tax+0;
//        }
//        else if (income>=2.5f && income<5f){
//            tax = tax + 0.05f *(income-2.5f);
//        }
//        else if (income>=5f && income<10f){
//            tax = tax + 0.05f *(5.0f-2.5f);
//            tax = tax + 0.2f *(income-5f);
//        }
//        else if (income>=10f){
//            tax = tax + 0.05f *(5.0f-2.5f);
//            tax = tax + 0.2f *(10.0f-5f);
//            tax = tax + 0.2f *(income-10.0f);
//        }
//        System.out.println("The total tax paid by the employee is :" +tax);

        //P-4
//        int day = in.nextInt();
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //P-6
//        String url = in.nextLine();
//        if (url.endsWith(".org")){
//            System.out.println("organisation website");
//        }
//         else if (url.endsWith(".in")) {
//            System.out.println("Indian website");
//
//        } else if (url.endsWith(".com")) {
//            System.out.println("Commercial website");
//        }

        //P-5
        System.out.println("Enter a year to check it is leap or not");
        int year = in.nextInt();
        if (year%400==0 ){
            System.out.println("yes");
        }
        if (year % 100 == 0) {

            System.out.println("false");
        }
        if (year % 4 == 0) {

            System.out.println("yes");
        }
else {
            System.out.println("false");
        }
    }
}
