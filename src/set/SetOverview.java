package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 Set is a collection that cannot contain duplicate values
faster operation
Implementation classes are HashSet , LinkedHashset, TreeSet, EnumSet
There is no Key value like it will store only keys  with unique records
Same hashingFunctions and equals methods will apply here to store values
So if same value come again it will not make entry as there is already existing
We can't retrive data based on index as there is no order maintain
A Set is unordered by definition (in most implementations like HashSet), so there's no concept of an element at a specific index.
But we can convert Set in to List to access data on index based
to achieve concurrency and Synchronization we can use ConcurrentSkipListSet<>() which has built in synchronization
 */
public class SetOverview {
    public static void main(String[] args) {
        Set<Integer>  integers = new HashSet<>();
        Set<Integer>  insertionOrderInteger = new LinkedHashSet<>();//insertionOrder
        Set<Integer>  orderInteger = new TreeSet<>();//naturalOrder
    }
}
