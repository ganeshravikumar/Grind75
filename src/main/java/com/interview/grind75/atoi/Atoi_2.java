package com.interview.grind75.atoi;

public class Atoi_2 {
    public static void main(String[] args) {
        String string = "42";
        int s = myAtoi(string);
        System.out.println(s);
    }


    public static int myAtoi(String s) {
        int a = 0;
        String outputString = "";
        boolean spaceCheck=false;
        boolean signCheck=false;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isWhitespace(s.charAt(i))){
                if(!spaceCheck) {
                }else break;
            }
            else if (Character.getNumericValue(s.charAt(i)) < 10 ) {
                if((outputString.length()==0&&!signCheck)){
                if (String.valueOf(s.charAt(i)).equalsIgnoreCase("-"))
                {

                        outputString =outputString+ "-";
                        signCheck=true;
                        spaceCheck = true;

                }else if (String.valueOf(s.charAt(i)).equalsIgnoreCase("+")){

                        signCheck=true;
                        spaceCheck = true;

                }}else if(Character.getNumericValue(s.charAt(i)) >= 0) {
                    outputString = outputString + s.charAt(i);
                    spaceCheck = true;
                }else break;
            } else break;
        }
        if (outputString == null|| outputString.length()==0){
            return a;
        }else if(outputString.equalsIgnoreCase("-")){
            return a;
        }
        try {
            return Integer.parseInt(outputString);
        }catch (Exception e){
            if(String.valueOf(outputString.charAt(0)).equalsIgnoreCase("-")) {
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }
    }
}
