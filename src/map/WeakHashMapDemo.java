package map;

import java.util.WeakHashMap;

/*
WeakHashMap is used as a cache as The Keys which we used in WeakHashMap will be removed when they will not in ordinal use
So when ever a key is not use no longer those keys will be removed from weakHashMap
But If Use literal keys these keys will not ready to gc why as this keys are created in string pool constant
this can be reference any where in the application with same value it will be fetched from same memory so those will not remove
if we want the key to collect by GC then we need to create Non-literals keys
 */

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String,Image>  imageWeakHashMap = new WeakHashMap<>();
        String key1 = new String("img2");
        imageWeakHashMap.put("img1",new Image("shash.png"));
        imageWeakHashMap.put(key1,new Image("shash.png"));
        key1 = null;
        System.gc();
        doSomething();
        System.out.println(imageWeakHashMap);
    }
    public static void doSomething(){
        try {
            Thread.sleep(5000);
        }catch (Exception error){
            System.out.println("Error occurred while Doing something");
        }
    }
}


class Image{
    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
