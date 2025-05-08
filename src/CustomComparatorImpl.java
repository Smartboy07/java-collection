import java.util.Comparator;

/*
Comparator is interface which is responsible for sorting the elements in a collection
we can use default implementation class or can do our own implementation
it's having compare method which will return int value
if method return -1 or negative then it will consider 1 element over second
if method return 1 positive then it will consider 2 element over first
if method return 0 then any one of them will consider in sorting as both the value or equal
 */

public class CustomComparatorImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;// Desc order
       // return o2-o1; Asc order
    }
}
