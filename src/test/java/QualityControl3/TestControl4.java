package QualityControl3;

import java.util.HashMap;
import java.util.Map;

public class TestControl4 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(100,"Rajendra");
        map.put(101,"Lamror");
        map.put(102,"Technolamror");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("map.keySet() = " + map.keySet());
        System.out.println("map.values() = " + map.values());

    }
}

