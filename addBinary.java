public class addBinary {

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            ans.append(sum % 2);   // 0 or 1
            carry = sum / 2;       // new carry
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String a ="101";
        String b ="11";

        System.out.print("the addition of two binary string is -> "+ addBinary(a,b));
    }
}
