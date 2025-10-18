package Hashing;

import java.util.HashMap;

public class logerRateLimiter {

    HashMap<String, Integer> map;
    int INTERVAL;

    logerRateLimiter(){
        map = new HashMap<>();
        this.INTERVAL=10;
    }

    public boolean isshouldPrint(int timestamp, String message){

        if(!map.containsKey(message)){
            map.put(message, timestamp);
            return true;
        }

        int exitingTimeStamp = map.get(message);

        if(timestamp >= exitingTimeStamp + INTERVAL){
            map.put(message, timestamp);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        logerRateLimiter loger = new logerRateLimiter();

       System.out.println( loger.isshouldPrint(1,"foo"));
        System.out.println( loger.isshouldPrint(2,"bar"));
        System.out.println( loger.isshouldPrint(3,"foo"));
        System.out.println( loger.isshouldPrint(8,"bar"));
        System.out.println( loger.isshouldPrint(10,"foo"));
        System.out.println( loger.isshouldPrint(11,"foo"));
    }
}
