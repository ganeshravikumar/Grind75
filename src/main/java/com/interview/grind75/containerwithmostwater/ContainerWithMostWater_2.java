package com.interview.grind75.containerwithmostwater;
/*
* There is no timeout not optimul solution
* Need to while loop for better perfromance
* */
public class ContainerWithMostWater_2 {
    public static void main(String[] args) {
        int[] inputs = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(inputs));
    }


    public static int maxArea(int[] height) {
        int volume=0;
        int left =0;
        int right=height.length-1;
        if(height.length<2){
            return 0;
        }
        return getMaxVolume(left, right,volume,height);


    }

    private static int getMaxVolume(int left, int right, int volume, int[] height) {

        if(!(left>=right)){
            int maxHieght= Math.min(height[left], height[right]);
            int currnetvolume =(right-left)*maxHieght;
            volume= Math.max(currnetvolume, volume);
            if(height[left]<height[right]){
                volume=   getMaxVolume(left+1, right, volume,height);
            }
            else {
                volume=  getMaxVolume(left, right-1, volume,height);
            }
        }

        return volume;

    }
}
