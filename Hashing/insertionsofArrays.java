package Hashing;
import java.util.HashSet;
public class insertionsofArrays {

    //Leetcode 349

    public static int InsertionsofArrays(int[] arr, int[] arr2){
        int n= arr.length, m=arr2.length;
        int count =0;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }

        for(int j=0; j<m; j++){
            if(set.contains(arr2[j])){
                System.out.println(arr2[j]);
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args){
        int arr[] = {7,3,9}, arr2[] = {6,3,9,7,4,2,9};

        int Ans=InsertionsofArrays(arr, arr2);
        System.out.println("the common Elements are :"+Ans);

    }
}
