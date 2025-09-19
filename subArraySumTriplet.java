public class subArraySumTriplet {
    // cognizant
//  Q 3  return the value reprasent the subarrays sum like 1st and 3rd addition is same as 2nd
    public static int tripletSum(int[] arr, int n){

        int count =0;
        for(int i=0; i<=n-3; i++){

            if(arr[i]+arr[i+2]==arr[i+1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr={1,2,1,3,5,2,4,2};
        int n=8;
        int Ans= tripletSum(arr, n);

        System.out.println("the ANSwer is :"+Ans);
    }
}
