package com.interview.grind75.containerwithmostwater;

public class ContainerWithMostWater_3 {
    public static void main(String[] args) {
        int[] inputs = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(inputs));
    }


    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int ans = 0;
        while (i < j) {
            int t = Math.min(height[i], height[j]) * (j - i);
            ans = Math.max(ans, t);
            if (height[i] < height[j]) {
                ++i;
            } else {
                --j;
            }
        }
        return ans;


    }


}
