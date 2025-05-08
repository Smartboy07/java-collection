/*
Linked List is using Doubly Linked list to Store the Data
It will not use store the data in contiguous Memory it will use Node
A node contains Data and Pointer
Assume first element is 1 this will have pointer which will point to next element assume it's 5. So 1 -> 5 like this
this pointer will store the reference of next Node and one more will point to previous Node
As this is not storing in contiguous memory block need to traverse each element from head using a counter until we find our index so finding element in LL is o(n)
But Delete/insert at start or in middle is very easy in LL As it's not required shifting
Randomly access the elements in LL is slower when compare to ArrayList
Memory required More as in each Node we are storing the reference of previous and next node
this also preserve the insertion order
duplicates are allowed we can store multiple null values
 */

import java.util.LinkedList;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(null);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(null);
        linkedList.get(9);
        linkedList.remove(3);
        linkedList.getFirst();
        linkedList.getLast();
        System.out.println(linkedList);
    }
}
