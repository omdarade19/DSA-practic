package Arrays;

public class validMountainArray {
    //Leetcode 941
    //Given an array of integers arr, return true if and only if it is a valid mountain array.
    //
    //Recall that arr is a mountain array if and only if:
    public static boolean isValid(int arr[]){

        int i =0, n=arr.length;

        while(i+1 < n&& arr[i] < arr[i+1]){
            i++;
        }

        if(i==0 || i==n-1){
            return false;
        }

        while(i+1 < n && arr[i] > arr[i+1]){
            i++;
        }

        if(i == n-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr []={0,3,2,1};

        System.out.println("the give i" +
                "arra is a mountain Array ?-> "+isValid(arr));
    }
}
