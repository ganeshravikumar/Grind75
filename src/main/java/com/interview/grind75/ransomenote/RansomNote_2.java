package com.interview.grind75.ransomenote;


/*
* this code work but no efficient
*
* */

import java.util.HashMap;

public class RansomNote_2 {

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine="b";

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
            int magazineIndex=magazine.indexOf(ransomNote.charAt(i));
            String character = String.valueOf(ransomNote.charAt(i));
            if(magazineIndex>=0){
                magazine = magazine.replaceFirst(character, "");
            }
            else{
                return false;
            }

        }

        return true;
    }
}
