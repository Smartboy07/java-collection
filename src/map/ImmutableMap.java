package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Immutable Map is a map in which we can change the values of the Map once declared/instantiated
There are some Ways to create Immutable Map
1. Using Collection.unmodifiableMap(Map);// But this will Not make the original map as unmodifiable it will create/return a copy of this map as unmodifiable, so still we can modify original
2. To overcome above we Have Map.of(pass key values with comma seperated);But in this factory method only we can create 10 Entries.
3. To overcome above we can use Map.ofEntries() we use this to create n number of entries
 */
public class ImmutableMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        Map<Integer, Integer> integerIntegerMap = Collections.unmodifiableMap(map);
        //integerIntegerMap.put(1,5); unsupportedOperation
        map.put(3,4);//still we can  modify original

        Map<Integer,Integer> integerMap = Map.of(1,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);
        System.out.println(integerMap.size());
        //integerMap.put(1,4);unsupportedOperation

        Map<Integer,Integer> immutableMap = Map.ofEntries(Map.entry(12,32), Map.entry(1,34));
    }
}
