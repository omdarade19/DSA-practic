package String;

public class reverseStringArray {
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
