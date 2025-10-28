package Arrays;

import java.util.Arrays;

public class checkHieghts {
    //Leetcode 1051

    //A school is trying to take an annual photo of all the students. The students
    // are asked to stand in a single file line in non-decreasing order by height.
    // Let this ordering be represented by the integer array expected where expected[i]
    // is the expected height of the ith student in line.
    //
    //You are given an integer array heights representing the current order that the
    // students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
    //
    //Return the number of indices where heights[i] != expected[i].

    public static int check(int hieghts[]){

        int ans[] = new int[hieghts.length];

        for(int i=0; i<hieghts.length; i++){
            ans[i] = hieghts[i];
        }
        Arrays.sort(hieghts);
        int k=0;
        for(int i=0; i<hieghts.length; i++){
            if(hieghts[i] != ans[i]){
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int hieghts[] ={1,1,4,2,1,3};

        System.out.print("the hights not match count is -> "+check(hieghts));
    }
}
