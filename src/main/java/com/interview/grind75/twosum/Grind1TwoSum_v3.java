/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.*/


package com.interview.grind75.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Grind1TwoSum_v3 {
    public static void main(String[] args) {
        int[] inputs = new int[]{1,5,2,7,11,15};
        int target = 9;
        System.out.println("Calling  method");
        int[] output = twoSum(inputs, target);
        System.out.println("output"+output[0] );
        System.out.println("output"+output[1] );
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<Integer, Integer>();
        int[] output =new int[2];
        for(int i=0;i<nums.length;i++){
            int secNum = target - nums[i];
            if (!complements.containsKey(secNum)) {
                complements.put(nums[i], i);
            }
            else{
                output[0] = complements.get(secNum);
                output[1] = i;
                return output;
            }
        }
        return output;
    }
}
