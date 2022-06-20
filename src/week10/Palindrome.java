package week10;

import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {
        String str = "ada";
        System.out.println("isPalindrome(str) = " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        int strLength = str.length();
        String reverseStr = "";
        for (int i = strLength-1; i >=0 ; i--) {
            reverseStr+=""+str.toLowerCase(Locale.ROOT).charAt(i);
        }
        if(reverseStr.equals(str.toLowerCase(Locale.ROOT))){
            return true;
        }
        return false;
    }
}
