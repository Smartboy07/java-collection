package map;

/*
Concurrent HashMap is implemented the ConcurrentMap interface which extends Map interface. with concurrent map we can achevie concurrency
How it works
Java 7 --> Segment based Locking  --> by default our concurrent HashMap will divide into 16 segments of smaller HashMaps And each segement
have a separate lock.
Only the segment which is being read or written will be locked not others.
Read: Do not require locking unless there in any write operation in the segment already
Write: Will lock the segement
Java 8 --> in Java 8 we removed this segmentation as it fixed number segments it's not scalable assume we have big HashMap then we need to
wait.
So In java 8 they introduced Compare and swap approach --> There will be no locking until there is an resizing or collision occur
What is this compare and swap
Assume thread taken x to modify at this time x = 42
Now thread changes this value by adding +8 i.e 50
Now before update this value again thread will check the x is still 42 as it picks x at 42 because other threads can change this value before thread
if there is no change in x value then it will update or it will retry with new value.
If Compare and swap fail again and again then thread will wait for some time then it will come and change.
 */

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"Siri");
        concurrentHashMap.put(2,"Sirish");
        concurrentHashMap.put(3,"Sira");
        concurrentHashMap.put(1,"Siren");
    }
}
