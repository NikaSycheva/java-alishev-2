package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LessonLinkedHashMap {
    public static void main(String[] args) {
       /* Map<String,String> translations = new HashMap<>();
        translations.put("кошка", "cat");
        translations.put("собака", "dog");
        translations.put("слон", "elephant");
        for(Map.Entry<String, String> entry : translations.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());*/

        Map<Integer, String> hashMap = new HashMap<>();//внутри нет порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//порядок вывода = порядку добавления пары
        Map<Integer, String> treeMap = new TreeMap<>();//отсортированы по ключу от меньшего к большему, от А-Я

        testMap(hashMap);
        System.out.println("=====");
        testMap(linkedHashMap);
        System.out.println("=====");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(12, "Nika");
        map.put(78, "Lola");
        map.put(0, "Ken");
        map.put(1500, "Tim");
        map.put(7, "Tim");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


}
