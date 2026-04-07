package com.OOPS2.ARRAY;

public class REMOVEDUPLICATE {



    public static void main(String[] args) {


        int[] nums = {1,2,1,4};

        int k =1;


        for ( int i =0; i<nums.length; i++) {


            if (nums[i]!= nums[i-1]) {

                nums[i]=nums[k];
                k++;


            }


        }


        }



    }




