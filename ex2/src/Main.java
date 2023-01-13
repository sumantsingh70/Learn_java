import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 0 for Rock
        //1 for Paper
        //2 for Scissor

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper and 2 for scissor");
        int userInput = in.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt();

        if (userInput==computerInput){
            System.out.println("Draw");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 &&computerInput==1){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer Win!");
        }
        System.out.println("computer choice: " + computerInput);
    }
}