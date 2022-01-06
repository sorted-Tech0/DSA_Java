package doing;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int n = scn.nextInt();
        int pos = scn.nextInt();
        int element = scn.nextInt();
        int cap = arr.length;

        int ans = insertElement(arr, n, cap, pos, element);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(ans);
    }
    public static int insertElement(int[] arr, int n, int cap, int pos, int element){
        if(n == cap){
            return n;
        }
        int idx = (pos - 1);
        for(int i = n-1; i >= 0; i--){
            arr[i+1] = arr[i];
        }
        arr[idx] = element;
        return (n+1);
    }
}
