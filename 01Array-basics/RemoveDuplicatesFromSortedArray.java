package doing;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
//        print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans = removeDuplicates1(arr);
//        print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(ans);
    }
    public static int removeDuplicates1(int[] arr){
        int size = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[size-1]){
                arr[size] = arr[i];
                size++;
            }
        }
        return size;
    }
    public static int removeDuplicates(int[] arr){
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int size = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != temp[size-1]){
                temp[size] = arr[i];
                size++;
            }
        }
        for(int i = 0; i < temp.length; i++){
            arr[i] = temp[i];
        }
        return size;

    }
}
