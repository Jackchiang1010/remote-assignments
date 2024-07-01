package com.example.assignments;

import org.springframework.boot.SpringApplication;

import java.util.Arrays;

public class Assignment5 {

    private static int[] twoSum(int[] nums, int target) {
        // your code here
        int[] result = new int[2];

        for( int index = 0; index < nums.length; index++ ) {
            for( int allIndex = 0; allIndex < nums.length; allIndex++ ) {
                if( nums[index] + nums[allIndex] == target && index != allIndex) {
                    result = new int[]{index,allIndex};
                    return result;
                }
            }
        }

        return new int[]{-1,-1};
    }
    /*
        For example:
        twoSum([2, 7, 11, 15], 9);
        Should returns:
        [0, 1]
        Because:
        nums[0]+nums[1] is 9
    */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
