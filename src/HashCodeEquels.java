import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeEquels {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Oleg");
        Person person2 = new Person(1, "Oleg");

        map.put(person1, "123");
        map.put(person2, "458");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);


    }

    static class Person {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            if (id != person.id) return false;
            return name.equals(person.name);
        }

        // {object} -> преобразуем в {int} любому объекту сопоставляем целое число int. целые числа сравнивать гораздо проще
        @Override
        public int hashCode() {
            int result = id;
            result = 31 * result + name.hashCode();
            return result;
        }
    }


}
