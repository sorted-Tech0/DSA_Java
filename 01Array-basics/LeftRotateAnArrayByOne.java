package doing;

import java.util.Scanner;

public class LeftRotateAnArrayByOne {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
//  Print the array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        rotateArray(arr);
        System.out.println();
//  Print the array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateArray(int[] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
