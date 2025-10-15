package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class minIndexsumTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {

        List<String> result = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();


        for(int i=0; i<list1.length; i++){
            map.put(list1[i], i);
        }

        int minIndex = Integer.MAX_VALUE;

        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                if(i+map.get(list2[i]) < minIndex){
                    minIndex = i+map.get(list2[i]);
                    result = new ArrayList<>();
                    result.add(list2[i]);
                }else if(i+map.get(list2[i])== minIndex){
                    result.add(list2[i]);
                }
            }
        }

        String[] ans = new String[result.size()];

        for(int i=0; i<ans.length; i++){
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        String list1[]= {"happy","sad","good"};
        String list2[]= {"sad","happy","good"};

        String[] ans = findRestaurant(list1, list2);

        System.out.println("the common string with the min Index sum is -> "+ Arrays.toString(ans));
    }
}
