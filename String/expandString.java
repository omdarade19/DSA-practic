package String;

public class expandString {

    //Q 1 cognizant

    //This program expands a given string based on the first occurrence index of each character.

    public static String expamdString(String str){

        String result ="";
        int [] firstocuurance = new int [26];

        for(int i=0; i< str.length(); i++){

            char ch = str.charAt(i);
            int index = ch- 'a';

            if(firstocuurance[index]==0){
                firstocuurance[index]=i+1;
            }

            if(i>0){
                result+="-";
            }

            int reapeat = firstocuurance[index];
            for(int j=0; j<reapeat; j++){
                result+=str.charAt(i);
            }
        }

        return result;
    }

    public static  void main(String[] args){

        String str ="abcaba";

        System.out.println(expamdString(str));
    }
}
