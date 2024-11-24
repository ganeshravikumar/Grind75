package com.interview.grind75.longestpalindromsubstring;

public class LongestPalindromSubstring {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(s.substring(0,1));
        String string = longestPalindrome(s);
        System.out.println(string);    }

    public static String longestPalindrome(String s) {
        String palindromString = "";
        String maxPalindromString = "";
        String palindromStringO="";
        String palindromStringE="";
        if(s.length()==1) {
            return s;
        } else if (s.length()==2) {
            if(s.charAt(0)==s.charAt(1)){
                return s;
            }

        }
        for (int i = 0; i <= s.length()-1; i++) {
            if (i == 0) {
                maxPalindromString = s.substring(0, 1);
            }else{
                if(i<s.length()-1) {
                     palindromStringO = palOdd(s, i - 1, i + 1, 0);
                }
             palindromStringE = palEven(s, i - 1, i,0);
            if(palindromStringO.length()>palindromStringE.length()){
                palindromString=palindromStringO;
            }else{
           palindromString=palindromStringE;
            }
                if (maxPalindromString.length() < palindromString.length()) {
                    maxPalindromString = palindromString;
                }

        }}

        return maxPalindromString;
    }

    private static String palOdd(String s, int left, int right ,int recurssion) {
        String value="";

            if (s.charAt(right) == s.charAt(left)) {
                value = s.substring(left, right+1 );
                if (left == 0 || right > s.length()-1) {
                    value = s.substring(left, right+1 );
                } else {
                    if ((left > 0 && right < s.length()-1)) {
                        left = left - 1;
                        right = right + 1;
                        value = palOdd(s, left , right ,1);
                    }
                }
            }
            else if (recurssion==1){
                return s.substring(left+1, right );
            }


        return value;
    }


    private static String palEven(String s, int left, int right,int recurssion) {
    String value="";

           if (s.charAt(right) == s.charAt(left)) {
                value = s.substring(left, right+1);
                if (left == 0 || right > s.length()-1) {
                    return s.substring(left, right+1);
                } else {
                    if ((left > 0 && right < s.length()-1)) {
                        left = left - 1;
                        right = right + 1;
                        value = palEven(s, left , right,1 );
                    }
                }
            } else if (recurssion==1){
               return s.substring(left+1, right );
           }

        return value;
    }



}


