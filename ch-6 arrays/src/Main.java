import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] marks = new int[5];
//        for(int i =0;i<marks.length;i++){
//            marks[i]= in.nextInt();
//        }
//       System.out.println("Inputted array:");
////        for (int i=0;i<marks.length;i++){
////            System.out.println(marks[i]);
////        }
//
//        //display the array using for-each loop:
//        for(int element: marks){
//            System.out.println(element);
//        }

// 2-D arrays
        int[][] flats = new int[2][3];
        System.out.println("Enter array of size 2X3:");
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                flats[i][j]=in.nextInt();
            }
        }

        //displaying array:

        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}