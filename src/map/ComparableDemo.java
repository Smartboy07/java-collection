package map;

import java.util.ArrayList;
import java.util.List;

/*
When ever we create a class if we want to sort this class object based on any fields available in the class
Or to give a default sorting for the class we need to implement Comparable interface
This interface is having CompareTo method which excepts only one input and compare the value with parameter object with current object
to keep current object -ve value should return, to keep parameter +ve value should return

 */
public class ComparableDemo implements Comparable<ComparableDemo> {

    public String name;
    public Integer age;
    public Integer Id;

    @Override
    public String toString() {
        return "ComparableDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Id=" + Id +
                '}';
    }

    public ComparableDemo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(ComparableDemo o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ComparableDemo c1 = new ComparableDemo("Shashank",24);
        ComparableDemo c2 = new ComparableDemo("Abhishek",24);
        ComparableDemo c3 = new ComparableDemo("Hemanth",24);
        List<ComparableDemo> l1 = new ArrayList<>();
        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.sort(null);
        System.out.println(l1);
    }
}
