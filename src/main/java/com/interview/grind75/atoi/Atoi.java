package com.interview.grind75.atoi;

public class Atoi {
    public static void main(String[] args) {
        String string = "      -11919730356x";
        int s = myAtoi(string);
        System.out.println(s);
    }


    public static int myAtoi(String s) {
        int a = 0;
        String outputString = "";
        boolean spaceCheck=false;
        boolean signCheck=false;
        for (int i = 0; i < s.length(); i++) {

            if (i == 0) {
                if (String.valueOf(s.charAt(0)).equalsIgnoreCase("-")) {
                    outputString = "-";
                    spaceCheck=true;
                    signCheck=true;
                } else if (String.valueOf(s.charAt(0)).equalsIgnoreCase("+")) {
                    outputString = "";
                    spaceCheck=true;
                    signCheck=true;
                }else if (Character.getNumericValue(s.charAt(i)) < 10 && Character.getNumericValue(s.charAt(i)) >= 0) {
                    outputString = outputString + s.charAt(i);
                    spaceCheck=true;

                }else if(Character.isWhitespace(s.charAt(i))){

                } else {
                    break;
                }
            }else if(Character.isWhitespace(s.charAt(i))){
                if(!spaceCheck) {
                }else break;
            }
            else if (Character.getNumericValue(s.charAt(i)) < 10 ) {
                System.out.println(Character.getNumericValue(s.charAt(i)) + "=" + s.charAt(i));
                System.out.println(outputString.length()==0);

                if (String.valueOf(s.charAt(i)).equalsIgnoreCase("-"))
                {
                    if((outputString.length()==0&&!signCheck)){
                    outputString =outputString+ "-";
                        signCheck=true;
                    spaceCheck = true;}
                    else{
                        break;
                    }
                }else if (String.valueOf(s.charAt(i)).equalsIgnoreCase("+")){
                    if((outputString.length()==0&&!signCheck)){
                        signCheck=true;
                        spaceCheck = true;}
                    else{
                        break;
                    }
                }else if(Character.getNumericValue(s.charAt(i)) >= 0) {
                    outputString = outputString + s.charAt(i);
                    spaceCheck = true;
                }else break;
            } else break;
        }
        System.out.println(outputString);
        if (outputString == null|| outputString.length()==0){
            return a;
        }else if(outputString.equalsIgnoreCase("-")){
           return a;
        }
        try {
            return Integer.parseInt(outputString);
        }catch (Exception e){
            System.out.println(String.valueOf(s.charAt(0)));
            if(String.valueOf(outputString.charAt(0)).equalsIgnoreCase("-")) {
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }
    }
}
