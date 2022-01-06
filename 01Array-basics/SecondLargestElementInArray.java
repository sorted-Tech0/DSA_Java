package doing;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int foundIndex = findSecondLargest(arr);
        System.out.println(foundIndex);
    }

    public static int findSecondLargest(int[] arr){
        int res = -1, largest = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            } else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
//  note:Below one is another solution
    public static int mySolution(int[] arr){
        int max1 = 0;
        int max2 = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[max1]){
                max2 = max1;
                max1 = i;
            } else if(arr[i] < arr[max1]){
                if(max2 < arr[i]){
                    max2 = i;
                }
            }
        }
        return max2;
    }

}
