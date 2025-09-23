public class fairSplit {

//    Q 2 Cognizant

//    Alice has an integer array A of length N. She wants to split the array
//    into two non-empty parts
//    at some index i. The first part consists of elements from [0..i], and
//    the second part consists of elements from indices [i+1..N-1].
//    Alice considers a split to be fair if the absolute difference between the
//    sum of the two parts is even. Your task is to help Alice find and return
//    an integer value representing the number of fair splits possible in array A.

    public static int fair_split(int N, int[] A){

        int totalSum=0;
        for(int num : A){
            totalSum+=num;
        }

        int prefixSum=0;
        int count=0;

        for(int i=0; i<N-1; i++){
            prefixSum+= A[i];
            int sufixSum = totalSum-prefixSum;

            if(Math.abs((prefixSum-sufixSum))%2==0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int N=5;
        int [] A={10,10,3,7,6};
        int Ans = fair_split(N,A);

        System.out.println("The fair split diff is :"+Ans);
    }
}
