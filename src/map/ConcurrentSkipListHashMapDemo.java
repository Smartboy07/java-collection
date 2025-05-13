package map;

import java.util.concurrent.ConcurrentSkipListMap;

/*
WhenEver we want a Map with sorted key and with Synchronized (concurrency) We need to use ConcurrentSkipListMap.
The Data which will store in the in ConcurrentSkipListMap will be stored in a Data Structure called SkipList
What is this skipList?.
Assume we have data {1,2,3,4,5,6,7,8,9}
How this will store in skip list
First it will keep the original copy {1,2,3,4,5,6,7,8,9}
And Now it will skip some element in the original data and store one more copy assume like this {1,3,5,7,9}
So it skip some data from original again it will skip data from second copy and create a new copy like this {1,5,9}
Like this Data will be stored in Skip List so this will increase the search efficiency
Now assume I want to search the element 3 in this skip list it will check the last copy which is {1,5,9}
now it will search in this
1st element 1 = 3 no is 1> 3 no so check the next element 5 = 3 no is 5>3 yes then skip this copy and go to next
As element stored in sorted order along with match it will check the greater than to skip the list if it's greater

It is a probabilistic Data structure that allows for efficient search, insertion and deletion operation
It's similar to sorted linked list but with multiple layers that skip ove portion of the list to provide faster access to elements
 */
public class ConcurrentSkipListHashMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,Integer> skipListMap = new ConcurrentSkipListMap<>();
        skipListMap.put(1,2);
        skipListMap.put(2,3);
        skipListMap.put(3,4);
        skipListMap.put(4,5);
        System.out.println(skipListMap.pollFirstEntry());
        System.out.println(skipListMap.pollLastEntry());
        System.out.println(skipListMap.descendingMap());
        System.out.println(skipListMap.headMap(4));
    }
}
