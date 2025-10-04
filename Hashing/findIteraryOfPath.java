package Hashing;

import java.util.HashMap;

public class findIteraryOfPath {

    public static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key: tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key: tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<>();
        map.put("Chenaai","Begluroo");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chenaai");
        map.put("Delhi", "Goa");

        String Start = getStart(map);

        while(map.containsKey(Start)){

            System.out.print(Start+" -> ");
            Start = map.get(Start);
        }
        System.out.print(Start);
    }
}
