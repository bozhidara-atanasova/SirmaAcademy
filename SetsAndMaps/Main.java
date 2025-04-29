import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        Map<String,Integer> phonebook = new HashMap<>();
        phonebook.put("Bozhidara",882760435);
        phonebook.put("Kaloyan",882764435);
        phonebook.put("Bozhidara",888757802);
        //here it is fast for adding and searching
        Map<String, Integer> linkedPhoneBook = new LinkedHashMap<>();
        linkedPhoneBook.put("Ivan",123456);
        linkedPhoneBook.put("Maria",987657);
        linkedPhoneBook.put("Georgi",55555);
        for(Map.Entry<String,Integer> entry : linkedPhoneBook.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //when we go trough them we will gor from: Ivan -> Maria -> Georgi
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Pesho", 55555);
        treeMap.put("Maria", 98765);
        treeMap.put("Ivan", 12345);
        //here they are ordered lexicograph
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Banana"); // It will not be added again
        System.out.println(hashSet); // Something loke [Banana, Apple]

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        System.out.println(linkedHashSet); // [Apple, Banana, Cherry]

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println(treeSet); // [Apple, Banana, Cherry]



    }
}