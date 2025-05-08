import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;


/*
ArrayList and LL are not thread safe if we do concurrent modification then desired result will not come
Vector and stack are thread safe Due to this things are locking and performance is slow
to achieve both thread safety and performance CopyOnWriteArrayList came
Copy on Write means whenever a write operation
like adding or removing or updating an element
instead of directly modifying existing list a new copy of list will create and the modification is applied to that copy
this ensure that other threads reading the list while being modified are unaffected
ReadOperation will be fast and direct as there is no interference from modification.
WriteOperation A new copy will create for every modification
then point the original reference to the modified list is then updated so that susequent read use this new list
this we can use when there is more read wirte is less because as it generate a new copy on every write memory will take more
 */
public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(3);
        copyOnWriteArrayList.add(4);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        //we are doing read and write operation at same time on original list  which will lead to concurrent modification exception
//        for(Integer i : linkedList){
//            if(i>1){
//                linkedList.add(5+i);
//                System.out.println("Added incremented value on read");
//            }
//        }
        //But this we can achieve through CopyonWriteList as the modification will go new copy read is on original modification is on copy
        for(Integer i : copyOnWriteArrayList) {
            System.out.println(i);
            if (i > 1) {
                copyOnWriteArrayList.add(5 + i);
                System.out.println("Added incremented value on read with Copy on Write");
            }
        }
        //After Loop ends the old/orginal reference will point to copy list on which modification done
        System.out.println(copyOnWriteArrayList);
    }
}
