package com.OOPS2.ARRAY;

public class MinimumElement {

    public static void main(String[] args) {




        int [] arr = {19,1,3,5,7,8};

        int minimum = arr[0];



        for(int i = 0; i<arr.length; i++){
            if( arr[i]<minimum){
                minimum= arr[i];

            }
        }
        System.out.println(minimum);
    }
}
