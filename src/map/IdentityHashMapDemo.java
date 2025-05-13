package map;

/*
Identity HashMap in this hashMap the hashcode value of an object is considered from Object class one
Even though we override the hashcode in the class it will use Object HashCode method for the calculation which we called as Identity Hash code
And in this one we will not use .equals() to check the key is equal with new key
Identity HashMap will use == which used to check the address of the object so even though index came same for two keys
 == will not match
So if Objects created with the same values also will be store twice in the Map
 */
public class IdentityHashMapDemo {
}
