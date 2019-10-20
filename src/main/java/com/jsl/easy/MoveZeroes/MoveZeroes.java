package com.jsl.easy.MoveZeroes;

import java.util.Arrays;

/**
 * Created by shaoliang.
 */
public class MoveZeroes {
    //TODO: to try for statement
    private void moveZeroes(int[] nums) {
        int i=0,j=0;
        //init i
        while(i<nums.length-1&& nums[i]!=0 ) i++;

        /** use while
//        init j
//        j=i+1;
//        while(j<nums.length){
//            while(nums[i]!=0 && i<nums.length-1) i++;
//            while(j<nums.length && nums[j]==0) j++;
//            if(j==nums.length) break;
//            nums[i] = nums[j];
//            nums[j] = 0;
//        }
         **/

        // combine for and while
//        for(j=i+1;j<nums.length;j++){
//            if(nums[j]!=0){
//                nums[i] = nums[j];
//                nums[j] = 0;
//                while(nums[i]!=0 && i<nums.length-1) i++;
//            }
//        }

        // for statement only
//        for(j=i+1;j<nums.length;j++){
//            if(nums[j]!=0){
//                nums[i] = nums[j];
//                nums[j] = 0;
//                for(;nums[i]!=0 && i<nums.length-1;i++){
//
//                }
//            }
//        }

        // new model
//        for(j=i+1;j<nums.length;j++){
//            if(nums[j]!=0){
//                nums[i] = nums[j];
//                nums[j] = 0;
//            }
//        }
//
//        for(;nums[i]!=0 && i<nums.length-1;i++){
//
//        }

        //reference
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args){
//        int[] nums = {};
//        int[] nums = {0};
//        int[] nums = {1};
//        int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {1, 0, 0, 3, 12};

        System.out.println(Arrays.toString(nums));
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
