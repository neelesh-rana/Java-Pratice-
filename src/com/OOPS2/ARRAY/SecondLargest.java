package com.OOPS2.ARRAY;

public class SecondLargest {

    public static void main(String[] args) {


        int [] nums = {1,2,4,5,7,7};
        int n =nums.length;



        int largest  =nums[n-1];


       for( int i = n-2; i>=0;  i--){
           if(nums[i]!=largest){
               System.out.println(nums[i]);


           }
       }







    }
}
