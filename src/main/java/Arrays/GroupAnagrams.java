package Arrays;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for(String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key =new String(charArr);
            group.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(group.values());
    }
}

// key learning regarding Maps
/*
Map.get(key) -> returns the value object
so Map.get(key).add(String value) here works because value is a List<String>

When creating a String Object it will automatically convert a charArray to a String
["c", "a", "t"] -> "cat"

In Java, arrays (char[] in this case) do not override equals() and hashCode() — they use the default Object identity versions.
This means two arrays with the same contents are not equal unless they are literally the same instance.

Every Java object inherits two fundamental methods from Object:
public boolean equals(Object obj)
public int hashCode()

These methods define:
equals() → How do we check if two objects are “the same” in a logical sense?
hashCode() → A number used by hash-based collections (HashMap, HashSet) to efficiently group and locate objects.

When you put an object in a HashMap, the map uses hashCode() to find the “bucket” and equals() to check if a key matches an existing one.

By default, Object’s implementations of these methods work like this:
equals() compares object identity —
this == obj
hashCode() is derived from the object’s memory address (or a unique internal ID)

So:
Object a = new Object();
Object b = new Object();
a.equals(b); // false
Because they are two different objects in memory.

char[] is just a regular object that doesnt override these functions
That's why we had to convert char[] -> String for equal to work

*/
