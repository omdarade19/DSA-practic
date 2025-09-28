package Hashing;

import java.util.HashMap;

public class ExamplesHashMaps {

    public static void main(String[] args){

        HashMap<String , Integer>map = new HashMap<>();

        map.put("India", 140);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 170);

//        if(map.containsKey("China")){
//            System.out.println("is is Contain the key");
//        }else{
//            System.out.println("Not contains key");
//        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indo"));

        System.out.println(map);


    }
}
