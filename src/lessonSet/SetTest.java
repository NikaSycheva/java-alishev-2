package lessonSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Nika");
        hashSet.add("Evgenij");
        hashSet.add("Iraida");
        hashSet.add("Oksana");
        hashSet.add("Evgenij");
        hashSet.add("Evgenij");

        for(String name : hashSet){
            System.out.println(name);
        }

        System.out.println(hashSet);

        /*System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Iraida"));

        System.out.println(hashSet.isEmpty());*/

    }
}
