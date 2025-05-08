package map;

/*
Map is a interface which is used to store the Data in Key, value pair
We have some implementation classes of this Map those are HashMap, LinkedHashMap, HashTable, TreeMap, ConcurrentHashMap and ConcurrentSkipListMap
HashMap is a implementation class of Map interface this will store the Data in K,V pair
Key always be unique in Map, HashMap allows one null as key and value can be multiple

Hashmap use Arrays of Linked List to store the data But no Order to store
We use put to add Kye value get(Key) to get the value containsKey() to check key available or not containsValue() to check the value available
to run the Loop we can use map.keySet(); this will return Set<TypeofKey>
Every Key value we store in map is a EntrySet we can use map.entrySet() to get Set<Map.Entry<Key,value>>.
Using this we can Loop through Map in this we can get or set Key as well as value.
if Same Key tries to add again then old entry of the key will get override
HashMap is not synchronized. Performance Constant-time performance O(1) for basic operations like get put
Internal Working/Structure of HashMap
There are Four Basic Component of HashMap
1.Key : The identifier used to retrieve the Value As it's Identifier No duplicate Key will store
2.Value: Data which is associated with Key
3.Bucket: Place where key-Value pairs are stored
4.HashFunction: Converts a Key into an index(bucket location) for storage
Assume we are try to add a entry in Map like map.put(1,"siri") now this Key will go to
HashFunction is an algorithm This function takes key as input and returns a fixed-size String of bytes typically a numerical value
The output is known as HashCode, hashvalue or simply hash, The primary purpose is we give largest input output will come fixed
Same input will always produce same output,
Regardless of the input size the hashcode has a consistent size

How Data Stored in HashMap
Step 1: Hashing the Key
First, the key is passed through a hashfunction to generate a unique hash code. this hashcode helps to determine where Key -value pair will be stored in the bucket array
Step 2: calculating the index
The hashCode is then used to calculate an index in the array int index = hasCode % arraySize;
the index decides which bucket will hold this key-value pair
For example, if the array size is 16 , the key's hashcode will be divided by 16 and the remainder will be the index to store
Step 3: Storing in the bucket
the key-value pair is stored in the bucket in calculated index. Each Bucket can Hold multiple key value pairs(this is called collision handling meachnism)

How retrival of data happen
when we pass the get(key)
Hashing the key this will return a hashcode -> hashcode will divide by bucket size to get index -> in the bucket respect to
index will csearch the key and return it's associated value
Collision handling -> Possibilities are there to get the same remainder when we divide the hashcode of different key with bucket
size. at the time collision will happen as both key are falling under same bucket index so to avoid the collision we store the
data inside bucket with linked list when collision happen the current linkedList will point to next new linked list
But after Java 8 when in a single bucket entries will reach a certain threshold then Linkedlist will convert to Balance Binary search tree(red Balck tree) as this time complexity o(logn)


HashMap resizing By default internal array size is 16
when number of elements grows and exceed a certain load factor(default is 0.75), HashMap Automatically resizes the array to hold more data
Example size is 16 load factor is 0.75 so 16*0.75 = 12 , When 12 elements inserted to HashMap will resize During rehashing the array/Bucket size will be doubled
and all the  existing entries will rehashed to calculate their position acc to new size This ensure HashMap continues to perform More efficiently even more data is added.
We can define Loadfactor by using parameterized constructor
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Siri");
        map.put(2,"Abhi");//add
        map.put(3,"shash");
        map.put(3,"Andy");//modify the existing value for the key shash -> Andy
        map.put(4,"Darling");
        map.containsKey(4);
        map.containsValue("shash");
        map.remove(1,"shash");// will remove if given Entry available in Map

        for(Integer key: map.keySet()){
            System.out.print(map.get(key)+" ,");
        }
        System.out.println();

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Key is :"+ entry.getKey() +", Value is :"+entry.getValue());
        }


    }
}
