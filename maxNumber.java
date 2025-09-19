public class maxNumber {

    public static void main(String[] args){

        int[] arr={23, 45, 22, 45, 78, 56};
        int max = 0;

        for(int i=0; i<arr.length; i++){
            int curr= arr[i];
            max = Math.max(curr, max);
        }

        System.out.println("the max number is :"+ max);
    }
}
