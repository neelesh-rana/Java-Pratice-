package com.OOPS2.ARRAY;

public class monotonic {

    public static void main(String[] args) {



        boolean incresing = true;
        boolean decresing = false;


        int[] nums= {1,2,2,3};


        for( int i = 1; i<nums.length ; i++){
            if(nums[i]>nums[i-1]){
                decresing=false;

            }
            else{

                incresing=false;

            }

        }
        System.out.println(incresing||decresing);



    }
}
