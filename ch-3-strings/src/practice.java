import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //p-1
        String name = "SUMANT";
        System.out.println(name.toLowerCase());

        //p-2
        String lines = "This is my first line.";
        System.out.println(lines.replace(" ","_"));

        //p-3
        String letter = "Dear <|name|> , Trans a lot.";
        System.out.println(letter.replace("<|name|>", "Sumant"));

        //p-4
        String space = "This line has    double and triple spaces.";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

        //p-5

    }
}
