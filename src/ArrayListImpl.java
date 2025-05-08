/*
Array List the implementation class of List interface
It use Dynamic array to dynamically increase the size
But if we want to reduce the size we need to call .trimToSize() to decrease the size
The initial capacity of arrayList will be 10 it will increase by 1.5 time when it full
we can use parameterized constructor to declare initial capacity explicitly
we can provide a collection to add the data as well
it's index based ,Maintain the insertion order and we can store the duplicate values
time complexity to fetch a data O(1), to insert, delete and update O(n)
it is using resizable array to store the element
so it will be index based
ArrayList can Grow or Shrink when ever ArrayList is full then new Array create with bigger size and all old array element will copy here
Add and remove have time complexity O(n) because whenever element removed in middle other elements need ot shift to fill the empty
space and while adding if arraylist capacity reached then need to create new array with bigger size and copy all the old elements to new then need to add
retrival is having O(1) as it's index based.
 */

import java.util.*;

public class ArrayListImpl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.remove(3);
        list.trimToSize();//to decrease size manually need to call this method
        //to iterate we can use For loop advanced for or iterator
        for(int i: list){
            System.out.println(i);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
       //We can use Factory method create List once we create we cannot add remove or modify this
       List<Integer> unmodifiableList = List.of(1,2,3,4);
       // unmodifiableList.remove(1); UnsupportedOperationException
       //There is one more way to create List using Arrays.asList() when we use this we cannot add or remove elements we can set the value to existing index
        List<Integer> fixedList = Arrays.asList(1,2,3,4);
        //fixedList.add(5); UnsupportedOperationException
        System.out.println();
        fixedList.set(1,0);//But  we can modify existing if we create the list using Arrays.asList
        fixedList.sort(null);// if we send null by default it will consider Natural order
        System.out.print(fixedList);
        System.out.println();
        fixedList.sort(new CustomComparatorImpl());// we can define our own implementation as well
        System.out.println(fixedList);


    }
}
