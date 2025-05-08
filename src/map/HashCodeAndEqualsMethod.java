package map;

import java.util.HashMap;
import java.util.Objects;

/*
when we put the Objects as Key in map
the hashcode and equals method will use Object class one
So Hashcode will generate based on memory address and equals method also check this reference is equal
So this time we will not able to get the value based on Key Because we Put the object in Map as a key but this object now not there
But we know what is the value inside the object if we create one more object with the same values still it will check the equals with
Memory address which is different so we will not get value. so we need to Override the Equals method in class to give our implementation
Same Way index will calculated based on Hashcode but Objects HashCode will generate based on Memory Address with this even though object
contain same value multiple entries will happen so we need to make sure to give our implementation to hashCode as wekk
 */
public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person,Integer> personIntegerHashMap = new HashMap<>();
        Person p1 = new Person("siri",1);// HashCode -> index
        Person p2 = new Person("siri",1);// HashCode -> index even though p1 p2 having same value the hash code will generate based on memory so this will not get override if we try to add it as key
        //It will not override the value it will make new entry
        Person p3 = new Person("Abhi",2);// HashCode -> index
        personIntegerHashMap.put(p1,1);
        personIntegerHashMap.put(p2,2);//No override of data new entry again happen
        personIntegerHashMap.put(p3,3);
        System.out.println(personIntegerHashMap);

        HashMap<Student,Integer> studentIntegerHashMap = new HashMap<>();
        Student s1 = new Student("siri",1);// HashCode -> index
        Student s2 = new Student("siri",1);// HashCode -> index  as we override the hashcode based on name and id this values are
        //matching with s1 values so same Hashcode will come and equals also we override with name and id it will compare with these values
        //and override the value not make duplicate entry
        Student s3 = new Student("Abhi",2);// HashCode -> index
        studentIntegerHashMap.put(s1,1);
        studentIntegerHashMap.put(s2,2);// override the previous value 1-> 2
        studentIntegerHashMap.put(s3,3);
        System.out.println(studentIntegerHashMap);
    }
}

class Person{
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }


}

class Student{
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
