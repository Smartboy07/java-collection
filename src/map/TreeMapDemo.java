package map;

/*
SortedMap is an interface which will provide sorting based on keys added By default with natural ordering or we can specify the comparator we want
How it will ensure the natural order the key which we are giving that class should implement comparable to ensure natural order or
else we need to specify the comparator in treeMap constructor
TreeMap is a Implementation class of SortedMap or Navigable Map.
uses Red black tree to store the data self balancing binary search tree
Navigable map is an interface which extends sorted Map Providing powerfull navigation option like finding the closet match or retreving the map in reverse order

 */

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        SortedMap<String,Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Guna",1);
        sortedMap.put("Krishna",2);
        sortedMap.put("Yamuna",3);
        sortedMap.put("Ganga",4);
        System.out.println(sortedMap);
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap("Krishna"));//exclude given key
        System.out.println(sortedMap.tailMap("Krishna"));//include given key

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(10,"Shashank");
        navigableMap.put(5,"Abhi");
        navigableMap.put(2,"Varun");
        navigableMap.put(1, "Hemanth");
        System.out.println(navigableMap.headMap(3,false));
        System.out.println(navigableMap.ceilingKey(4));
        System.out.println(navigableMap.floorEntry(4));
        System.out.println(navigableMap.descendingKeySet());
        System.out.println(navigableMap.navigableKeySet());
        System.out.println(navigableMap.descendingMap());
    }
}
