package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        if(set.contains(1)){
            System.out.println("the set contains 1");
        }

        set.remove(2);

        System.out.println("the size of the set is :"+ set.size());

        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
