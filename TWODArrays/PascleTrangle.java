package TWODArrays;

import java.util.ArrayList;
import java.util.List;

public class PascleTrangle {
    //Leetcode 118
    //Pascle Trangle

    public static List<List<Integer>> traingle(int num){

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<num; i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int val =result.get(i-1).get(j-1)+result.get(i-1).get(j);
                    row.add(val);
                }
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int num =5;

        List<List<Integer>> ans = traingle(num);

        for (List<Integer> row : ans) {
            System.out.println(row);
        }

    }
}
