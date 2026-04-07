package com.OOPS2.ARRAY;

public class ModifyingElemnt {


    public static void main(String[] args) {


        int [] arr  = { 10, 20, 30 , 40 };



        int n = arr.length;


        System.out.println("before modifying ");
        for( int  i = 0; i<n ; i++){
            System.out.println(arr[i]+"");
        }







        for( int i = 0; i<n ; i++){

            arr[i] +=5;

        }


        System.out.println("after modifying the content ");

        for( int i = 0; i<n; i++){
            System.out.println(arr[i]+" ");
        }


    }
}
