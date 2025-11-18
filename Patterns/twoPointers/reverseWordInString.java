package Patterns.twoPointers;

public class reverseWordInString {

    public static String reversWords(String s){

        String trim = s.trim();

        String[] arr = trim.split("\\s+");

        int i=0,
                j=arr.length-1;
        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return String.join(" ",arr);
    }


    public static void main(String[] args) {
        String s ="  Hello   World  ";

        System.out.print("the reverse String is -> "+reversWords(s));
    }
}
