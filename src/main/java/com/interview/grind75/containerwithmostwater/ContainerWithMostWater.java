package com.interview.grind75.containerwithmostwater;
/*This brutal force impact have timeout constraint*/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] inputs = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(inputs));
    }


    public static int maxArea(int[] height) {
        int volume=0;
        int left =0;
        if(height.length<2){
            return 0;
        }
        for(int i=0;i<height.length;i++){
               left=height[i];

            for(int j=0;j<height.length;j++) {
              if(!(i==j)) {
                        int newValue =(i<j)?(j-i):(i-j);
                        left=(height[i]<height[j])?height[i]:height[j];
                        if(volume <left*newValue){
                            volume=left*newValue;
                            System.out.println(height[i] + "," + height[j]+"="+volume);
                        }
                }
            }
        }
        return volume;

    }
}
