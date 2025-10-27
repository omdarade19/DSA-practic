package Arrays;

public class replaceElement {
    //Leetcode 1299
    //Given an array arr, replace every element in that array with the greatest
    // element among the elements to its right, and replace the last element with -1.
    //
    //After doing so, return the array.
    public static int[] replaceElements(int[] arr) {

        int max =-1;
        for(int i=arr.length-1; i>=0; i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }


        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};

        int nums[]= replaceElements(arr);

        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}
