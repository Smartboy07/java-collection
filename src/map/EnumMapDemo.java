package map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/*
When ever we use Enums as a key then we need to gor for Enum Map As this know how many Keys can come
So no resizing is required as we pass the Day enum class in constructor it will create same size as Enum available in that class
and to do the index no hash function is required it will use Enum ordinal as a index
by this calculation of hashcode and retrieve the index is reduced
All inserting and retrieving will happen very fast and there is no chance of collision as ordinal will be unique for all enum
and it will maintain the order of ordinal
Memory efficient
 */
public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new HashMap<>();
        EnumMap<Day,String> enumMap = new EnumMap<>(Day.class);
    }
}

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
