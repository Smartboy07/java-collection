import java.util.Vector;

/*
Vector is a Legacy class
Same As ArrayList this also use dynamic arrays
Size will get double when capacity meets size, We can specify capcaity increment
it was there in Java from 1.0 only before Collection came and is synchronized making it thread-safe
Now it's a part of Collection
Due to it's synchronization overhead it's generally recommended to use AL, LL in single-threaded scenario
this is helpful in Multithreaded enr where thread safety is concern
 */
public class VectorImpl {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.capacity());
        list.addElement(1);
        System.out.println(list.capacity());
    }

}
