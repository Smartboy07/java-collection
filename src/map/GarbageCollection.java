package map;

/*
When ever the Object create in Memory it might have refrence or may not
if any Object having reference which is pointing to it then it's a Strong reference
if any Object don't have any reference which is pointing to it then  it's ready to Garbage collection by JVM
We seen Strong Reference there is a Weakrefernce class also available in Java to do the weak reference /pointer for created object
This weak reference will be collected by GC after some time of creation it will not wait until reference got null
 */

import java.lang.ref.WeakReference;

public class GarbageCollection {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone 16", 100000);//As this object  having reference which is pointing to it. it's Strong reference
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Iphone 16", 100000));
        System.out.println(phoneWeakReference);
        System.out.println(phone);
        System.gc();//we are informing JVM explicitly to collect Garbage
        try{
            Thread.sleep(10000);
        }catch (Exception ignored){

        }
        //After this weak reference will be null As it's weak reference object JVM thinks that there is no use of this object now so destroy it
        //once it destroy the reference value will be null But Strong reference will hold the memory address
        System.out.println("After Garbage Collection");
        System.out.println(phoneWeakReference.get());
        System.out.println(phone);
        phone = null;// As soon as i made this pointer as null we can't use  the object which we create as it's pointer now null and become eligible to GC
    }
}
class Phone{
    String brand;
    Integer price;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Phone(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }

}
