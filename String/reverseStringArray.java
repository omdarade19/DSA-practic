package String;

public class reverseStringArray {
    //Leetcode 344

    //Write a function that reverses a string. The input string is given
    // as an array of characters s.
    //
    //You must do this by modifying the input array in-place with O(1) extra memory.
    public static void reverse(char s[]){
        int lp=0, rp=s.length-1;

        while(lp <= rp){
            char temp = s[lp];
            s[lp] = s[rp];
            s[rp] = temp;
            lp++;
            rp--;
        }
    }

    public static void main(String[] args) {
        char s[] ={'h','e','l','l','o'};

      for(char st:s){
          System.out.print(st+" ");
      }
      System.out.println();
      reverse(s);
        for(char st:s){
            System.out.print(st+" ");
        }

    }
}
