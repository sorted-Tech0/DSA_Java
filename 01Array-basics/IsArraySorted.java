package doing;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        boolean ans = checkForSorted(arr);
        System.out.println(ans);
    }
    public static boolean checkForSorted(int[] arr){
        boolean flag = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flag = false;
            }
        }
        if(flag){
            return true;
        } else{
            return false;
        }
    }
}
