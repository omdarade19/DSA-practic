package Patterns.twoPointers;

public class validPalindromII {
    //Leetcode 680

    public static boolean helper(int i, int j, String s){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean validPalindrom_II(String s){
        int i=0, j=s.length()-1;

        while(i<j){

            if(s.charAt(i) != s.charAt(j)){
                return helper(i+1,j,s) || helper(i,j-1,s);
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="abca";

        System.out.print("the string are palindrom after removing at most one char is -> "+validPalindrom_II(s));
    }
}
