package doing;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans = deleteElement(arr, n, x);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(ans);
    }

    public static int deleteElement(int[] arr, int n, int x){
        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == x){
                break;
            }
        }
        if(i == n){
            return n;
        }
        for(int j = i; j < arr.length-1; j++){
            arr[j] = arr[j+1];
        }
        arr[arr.length-1] = 0;
        return (n-1);
    }
}
