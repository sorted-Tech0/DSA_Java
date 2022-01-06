package doing;

import java.util.Scanner;

public class RevesreArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        // print the array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        reverseArray(arr);
        System.out.println();
        // print the array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void reverseArray(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
//    :Below one is another solution
    public static void mySolution(int[] arr){
        int n = arr.length / 2;
        for(int i = 0; i < n; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
