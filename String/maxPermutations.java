package String;

public class maxPermutations {

    // Q 5 COGNIZANT

//    replace the all vowels and return the pemutations of
//    the remaining string inthe array

    public static long factorial(int N){
        long fact = 1;
        for(int i=2; i<=N;i++){
            fact *=i;
        }
        return fact;
    }

    public static long maxPermutations(String [] arr, int N){
        int maxLength=0;
        for(String s : arr){
            String noVovels = s.replaceAll("(?i)[aeiou]","");
//            System.out.println(noVovels);
            maxLength= Math.max(maxLength,noVovels.length());
        }

        if(maxLength ==0){
            return 0;
        }
//        System.out.println(maxLength);

        return factorial(maxLength);
    }

    public static void main(String[] args){
        String [] arr={"darade"};
        int N = 1;

        System.out.println("the maxpermutations is :"+maxPermutations(arr,N));
    }
}
