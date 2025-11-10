package Patterns.twoPointers;

public class validPalindrom {

    public static  boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i=0, j=s.length()-1;
        while(i < j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";

        System.out.println("is this string is palindrom -> "+isPalindrome(s));
    }
}
