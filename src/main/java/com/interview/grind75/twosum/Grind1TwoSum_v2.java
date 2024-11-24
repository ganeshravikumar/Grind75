/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.*/

/*
* Stream usage reduced the performance
* 
*
* */
package com.interview.grind75.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Grind1TwoSum_v2 {
    public static void main(String[] args) {
        int[] inputs = new int[]{1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1};
        int target = 11;
        System.out.println("Calling  method");
        int[] output = twoSum(inputs, target);
        System.out.println("output"+output[0] );
        System.out.println("output"+output[1] );
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<Integer, Integer>();
        int[] output =new int[2];
        AtomicInteger count = new AtomicInteger();
        Arrays.stream(nums).sequential().forEach( val->{
            count.set(count.get() + 1);
            int secNum = target - val;
            System.out.println("inside value"+secNum);
            if (!complements.containsKey(secNum)) {
                System.out.println("got not value"+val);
                complements.put(val, count.intValue());
            }
            else{
                System.out.println("got value");
                output[0] = complements.get(secNum)-1;
                output[1] = count.intValue()-1;

            }



        });

        return output;
    }
}
