package Arrays;

import java.util.HashSet;
import java.util.Set;

public class NandItsDubble {
    public static boolean checkIfExist(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num*2) || (set.contains(num/2) && num%2 == 0)){
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int arr[] ={7,1,14,11};

        System.out.println("the N And its Dubbules contais ? ->"+checkIfExist(arr));
    }
}
