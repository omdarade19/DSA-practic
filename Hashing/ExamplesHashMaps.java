package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExamplesHashMaps {

    public static void main(String[] args){

        HashMap<String , Integer>map = new HashMap<>();

        map.put("India", 140);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 170);

        if(map.containsKey("China")){
            System.out.println("is is Contain the key");
        }else{
            System.out.println("Not contains key");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indo"));

        // Iterations on the map

       for( Map.Entry<String,Integer>e:map.entrySet()){
           System.out.println(e.getKey());
           System.out.println(e.getValue());
       }

       //2nd option for iterations
        Set<String> keys = map.keySet();

       for(String key : keys){
           System.out.println(key);
           System.out.println(map.get(key));
       }

        map.remove("China");
        map.remove("US");
        map.put("Rushia", 25);
        map.put("Bharat",150);
        map.put("Afganistan",26);

        map.remove("India");

        System.out.println(map);


    }
}
