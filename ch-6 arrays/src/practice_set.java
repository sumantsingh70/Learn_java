import java.util.Scanner;

public class practice_set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //P-1
//        float[] number = {1.2f,2.3f,4.5f,6.7f,6.4f};
//        float sum=0;
//        for (int i=0;i<number.length;i++){
//            sum=sum+number[i];
//        }
//        System.out.println(sum);

        //P-2
//        int n = 9;
//        int[] array = {1,2,3,4,5};
//        boolean isAnArray=false;
//        for (int j : array) {
//            if (n == j) {
//                isAnArray = true;
//                break;
//            }
//        }
//        if (isAnArray){
//            System.out.println("element found");
//        }
//        else {
//            System.out.println("not found");
//        }


        //P-3
//        float[] marks = {96.5f,68.7f,98.5f,99.5f};
//        float sum=0;
//        for (float i : marks){
//            sum = sum + i;
//        }
//        float avg = sum/ marks.length;
//        System.out.println(avg);

        //P-4
//        int[][] array1 = {{1,2,3},
//                {4,5,6}};
//        int[][] array2 = {{7,8,9},
//                {10,11,12}};
//       int[][] result ={{0,0,0},
//                      {0,0,0}};
//        for (int i=0;i<array1.length;i++){
//            for (int j=0;j<array1[i].length;j++){
//                result[i][j]=array1[i][j] + array2[i][j];
//                System.out.print(result[i][j]+ " ");
//            }
//            System.out.println("");
//        }

        //P-5
//        int[] array = {1,2,3,4,5,78,67};
//        int l = array.length;
//        int temp;
//        int n = Math.floorDiv(l,2);
//        for (int i=0;i<n;i++){
//            temp=array[i];
//            array[i]=array[l-i-1];
//            array[l-i-1]=temp;
//        }
//        for (int i  : array){
//            System.out.print(i+" ");
//        }

        //P-6
        int[] array ={1,2,3,4,5,6};
        int temp = 0;
        for (int i=0;i< array.length;i++){
            if (temp<array[i]) {
                temp = array[i];
            }
        }
        System.out.println(temp);


    }
}
