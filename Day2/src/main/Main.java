package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//            Print 1-255
            int number = 255;
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            }
//        Print odd numbers between 1-255
        int n = 255;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
//          Sigma of 255 AKA Sum to 255
        int i, num = 255, sum = 0;

        for(i = 1; i <= num; ++i)
        {
            sum = sum + i;
            System.out.println(sum);
        }
//          Iterating through an array
        int[] intArray = { 1,3,5,7,9,13 };
        System.out.println(Arrays.toString(intArray));

//        Find Max
        int[] nums={6,-1,-2,-3,0,1,2,3,4};
        int currentMax = nums[0];
        for(int i=1;i<=nums.length-1;i++){
            if(currentMax < nums[i]){
                currentMax = nums[i];
                System.out.println("Maximum value is "+ currentMax);
            }
        }




    }
    }



