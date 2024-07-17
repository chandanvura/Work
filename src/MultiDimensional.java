import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows


//        int[][] arr= {
//
//                {1,2,3},   //0 th index
//                {4,5,6},   //1 st index
//                {7,8,9}     //2nd index -> arr2D[2] ={7,8,9]
//        };

        //input

        for(int row =0; row<arr.length;row++){
            //for each col in every row

            for(int col =0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }


        //outpue

//        for(int row =0; row<arr.length;row++){
//            //for each col in every row
//
//            for(int col =0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();

        //       or
//        for(int row =0; row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//
//        }
                // or
        for(int[] a :arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
