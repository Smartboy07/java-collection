package map;

import java.util.LinkedHashMap;

/*
LinkedHashMap is a subclass of HashMap as it's extending.
It will maintain the insertion order
It uses Doubly linked list to store the Key value pair and ensure the insertion order is maintained
this have accessOrder by default it will be false
when we make this true using constructor So recently accessed element will go to the end of the DoublyLinkedList
This will help to find least recently used element if we want to find.
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put(1,"siri");
        linkedHashMap.put(3,"Darling");
        linkedHashMap.put(4,"Abhi");
        linkedHashMap.put(7,"Venki");
        //as we are making accessOrder true until this it will maintain insertion order now when ever i will access element from this map it will move to end.
        linkedHashMap.get(1);
        linkedHashMap.get(3);
        linkedHashMap.get(7);
        linkedHashMap.get(7);
        linkedHashMap.get(1);
        linkedHashMap.get(7);
        linkedHashMap.get(3);
        linkedHashMap.get(4);
        System.out.println(linkedHashMap);
    }
}
