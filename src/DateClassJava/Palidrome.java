package DateClassJava;

public class Palidrome {


    public boolean isPalindrome(String str) {
        boolean flag = true;

        //Converts the given string into lowercase
        str = str.toLowerCase();

        //Iterate the string forward and backward, compare one character at a time
        //till middle of the string is reached
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Given string is palindrome");
        else
            System.out.println("Given string is not a palindrome");
        return false;
    }

}



