package String;

public class indexofString {
    //Leetcode 28

    //Given two strings needle and haystack, return the index of the first
    // occurrence of needle in haystack, or -1 if needle is not part of haystack.
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String str ="sadbutsad";
        String needle = "sad";

        System.out.println("the index of the needle str in the main str is -> "+strStr(str,needle));
    }
}
