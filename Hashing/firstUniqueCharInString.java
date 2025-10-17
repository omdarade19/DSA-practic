package Hashing;

import java.util.HashMap;

public class firstUniqueCharInString {
    public static int firstChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0; i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";

        int ans = firstChar(s);

        System.out.println("the index of first unique char in String is -> "+ans);
    }
}
