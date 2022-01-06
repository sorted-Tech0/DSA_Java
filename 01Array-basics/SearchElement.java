package doing;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
//        finding an element in unsorted array
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int element = scn.nextInt();
        int foundIndex = serachElement(arr, element);
        System.out.println(foundIndex);
    }

    public static int serachElement(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

}
