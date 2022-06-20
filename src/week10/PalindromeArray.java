package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeArray {

    public static void main(String[] args) {
        String[] arr = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(Arrays.toString(arr));
        System.out.println("getPalindromeList(arr) = " + getPalindromeList(arr));
        System.out.println("getPalindromeList2(arr) = " + getPalindromeList2(arr));

        String[] arr2 = {"arr","mn"};
        System.out.println("getPalindromeList(arr2) = " + getPalindromeList(arr2));

    }

    public static ArrayList<String> getPalindromeList(String[] array){
        ArrayList<String> result = new ArrayList<>();
        String reverseString = "";
        for (String s : array) {
            reverseString ="";
            String cleanS=s.replace(" ","");
            for(int i = s.length()-1; i>=0;i--){
                reverseString+=cleanS.charAt(i);
            }
            if(cleanS.equals(reverseString)){
                result.add(s);
            }
        }
       return result;
    }

    public static ArrayList<String> getPalindromeList2(String[] array){
        ArrayList<String> result = new ArrayList<>();
        for (String s : array) {
          if( Palindrome.isPalindrome(s)){
              result.add(s);
          }
        }
        return result;
    }
}
