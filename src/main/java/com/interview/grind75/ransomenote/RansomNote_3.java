package com.interview.grind75.ransomenote;


/*
*this beat 60%
*using frequency map
* */

import java.util.HashMap;

public class RansomNote_3 {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine="ab";

        boolean s = canConstruct(ransomNote,magazine);
        System.out.println(s);    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();

        if ((ransomNote == null) || (magazine == null)) {
            return false;
        }

        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        for (Character c : magazine.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (Character c : ransomNote.toCharArray()) {


            if (hm.containsKey(c)) {
                int count = hm.get(c);
                if (count == 1) {
                    hm.remove(c);
                } else {
                    hm.put(c, count - 1);
                }

            } else {
                return false;
            }


        }
        return true;
    }
}
