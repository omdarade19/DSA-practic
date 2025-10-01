package Hashing;

import java.util.HashSet;

public class meargeArrayusingHashSet {

    public static void main(String[] args){
        int arr[] ={1,4,5,6,7};
        int arr2[] ={1,4,3,2,9,5};

        int n=arr.length , m=arr2.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< n; i++){
            set.add(arr[i]);
        }
        for(int i=0; i<m; i++){
            set.add(arr2[i]);
        }

        System.out.println(set);
        System.out.println(set.size());
    }
}
