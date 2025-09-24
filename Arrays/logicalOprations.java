package Arrays;

public class logicalOprations {

    //Q 7 cognizant
    // return the value of the logical oprations of given two integer values
    public static int logicalOR(int A, int B){

        int Z = A|B ;
        return Z;
    }

    public static void main(String[] args){

int A = 5;
int B =9;

System.out.println("the answer is :"+logicalOR(A,B));
    }
}
