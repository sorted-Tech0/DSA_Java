package doing;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int largestElementIndex = largestIndex(arr);
        System.out.println(largestElementIndex);
    }
    public static int largestIndex(int[] arr){
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[idx]){
                idx = i;
            }
        }
        return idx;
    }
}
