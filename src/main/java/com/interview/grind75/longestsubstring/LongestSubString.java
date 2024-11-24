package com.interview.grind75.longestsubstring;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubString {
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
            System.out.println(s.charAt(i));
            Character val = s.charAt(i);
            if(characterIntegerHashMap.containsKey(val)){
                if(characterIntegerHashMap.get(val)>=stringStartPoint){
                    stringStartPoint=characterIntegerHashMap.get(val)+1;
                    length =(i+1)-stringStartPoint;

                }else{
                    length =length+1;
                }

                characterIntegerHashMap.put(val,i);
                if(length>maxLength){
                    maxLength=length;
                }
            }
            else {
                characterIntegerHashMap.put(val, i);
                length=length+1;
                if(length>maxLength){
                    maxLength=length;
                }
            }

        }

        return maxLength;
    }


}
