package String;

public class StringTransformation {

    //Q 4 Cognizant
    //This program finds the minimum cost to transform string S1 into S2.

    public static int TransfromString(String S1, String S2){

        int [] freq1 = new int[26];
        int [] freq2 = new int[26];

        for(int i=0; i< S1.length(); i++){
            char c = S1.charAt(i);
            int index = c - 'A';
            freq1[index]=freq1[index]+1;
        }

        for(int i=0; i < S2.length(); i++){
            char c = S2.charAt(i);
            int index = c - 'A';
            freq2[index]=freq2[index]+1;
        }

        int cost=0;

        for(int i=0; i<26; i++){
            if(freq2[i] > freq1[i]){
                cost+=freq2[i]-freq1[i];
            }
        }

        return cost;
    }

    public static void main(String[] args){
        String S1="ABC";
        String S2="AABCCAD";

        System.out.println("the cost will be :"+TransfromString(S1,S2));
    }
}
