package map;

import java.util.HashMap;
import java.util.Map;

public class LessonHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");

        /*System.out.println(map);
        map.put(3, "другое значение");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(10));//null*/

        //пройдемся по элементам и значениям мапы
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
