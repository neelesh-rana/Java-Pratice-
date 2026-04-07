package com.OOPS2.ARRAY;

public class ReverseTravesal {

    public static void main(String[] args) {


        int []  arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;



        for( int i = n-1; i>=0; i--){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
