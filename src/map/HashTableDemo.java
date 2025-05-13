package map;

import java.util.Hashtable;

/*
HashTable is a legacy class which is introduced in java 1.0
Later it moved to Map Collection By extending Map interface all the methods of Map is available here also
But the Main difference with other Maps are this one is synchronized and ensure thread safety in multi threaded Enr
This will not allow Null Keys as well as null values to store.
All the methods inside the Hashtable are synchronized So at one time only one thread can read the hashtable as get() also synchronized
So to over come this concurrent Hash Map came
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1,"Shash");
        hashTable.put(2,"Sam");
        hashTable.put(3,"Sulek");

        Thread t1 = new Thread(()->{
            for(int i= 0 ;i<=1000;i++){
                hashTable.put(i,"dummy");
            }
        });

        Thread t2 = new Thread(()->{
            for(int i= 1001 ;i<=2000;i++){
                hashTable.put(i,"dummy");
            }
        });
        t1.start();
        t2.start();
       try {
           t1.join();
           t2.join();
       }catch (Exception error){

       }
        System.out.println(hashTable);
    }
}
