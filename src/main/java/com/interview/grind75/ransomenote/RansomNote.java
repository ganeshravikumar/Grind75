package com.interview.grind75.ransomenote;


/*
* This code exceeds time limit
*
* */

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine="aab";

        boolean s = canConstruct(ransomNote,magazine);
        System.out.println(s);    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Integer,Integer> hm =new HashMap<>();

        if ((ransomNote==null)|| (magazine==null)){
            return false;
        }

        if(ransomNote.length()>magazine.length()){
            return false;
        }
        for(int i=0;i<ransomNote.length();i++){
            System.out.println(ransomNote.charAt(i));
            for(int j=0;j<magazine.length();j++){
                if(!hm.containsKey(j)) {
                    if (ransomNote.charAt(i) == magazine.charAt(j)) {
                        if(!hm.containsValue(i)) {
                            hm.put(j, i);
                        }
                    }
                }
            }
            if(!hm.containsValue(i)){
                return false;
            }
        }
        return true;
    }
}
