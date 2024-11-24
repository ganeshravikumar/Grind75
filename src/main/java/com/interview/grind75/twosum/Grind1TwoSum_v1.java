package com.interview.grind75.twosum;

public class Grind1TwoSum_v1 {
    public static void main(String[] args) {
        int[] inputs = new int[]{3,2,4};
        int target = 6;
        System.out.println("Calling  method");
        int[] output = twoSum(inputs, target);
        System.out.println("output"+output[0] );
        System.out.println("output"+output[1] );
    }

    private static int[] twoSum(int[] inputs, int target) {
        int[] output =new int[2];
        for(int i=0;i<inputs.length;i++){
            System.out.println(inputs[i]);
            for(int j=i+1; j<inputs.length;j++){
                System.out.println("secnd loop"+inputs[j]);
                if(target == inputs[i]+inputs[j]){
                    output[0]=i;
                    output[1]=i+j;
                    return output;
                }
            }
        }
        return output;
    }
}
