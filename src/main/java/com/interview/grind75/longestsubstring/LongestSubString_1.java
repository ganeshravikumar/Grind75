package com.interview.grind75.longestsubstring;

import java.util.HashMap;

/*Replacing if with match max improved the perfromance from 137ms to 5ms*/

public class LongestSubString_1 {
    public static void main(String[] args) {
        String s ="dvdf";
        int lenght =lengthOfLongestSubstring(s);
        System.out.println(lenght);

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int length=0;
        int stringStartPoint=0;
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character val = s.charAt(i);
            if(characterIntegerHashMap.containsKey(val)){
                if(characterIntegerHashMap.get(val)>=stringStartPoint){
                    stringStartPoint=characterIntegerHashMap.get(val)+1;
                    length =(i+1)-stringStartPoint;
                }else{
                    length =length+1;
                }
                characterIntegerHashMap.put(val,i);
                maxLength = Math.max(length, maxLength);
            }
            else {
                characterIntegerHashMap.put(val, i);
                length=length+1;
                maxLength = Math.max(length, maxLength);
            }
        }
        return maxLength;
    }
}
