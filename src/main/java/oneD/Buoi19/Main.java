package oneD.Buoi19;
import java.util.*;
public class Main {

    public static void main(String[] args) {
//    ArrayList<Person> people = new ArrayList<Person>(List.of(new Person("Yenlt1","Viet Nam", 30)));
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Yenlt1", "Viet Nam", 30));
        people.add(new Person("Yenlt1", "Viet Nam", 30));
        people.add(new Person("Yenlt2", "Viet Nam", 30));
        people.add(new Person("Yenlt3", "Trung Quoc", 30));
        people.add(new Person("Yenlt4", "Trung Quoc", 30));
        people.add(new Person("Yenlt1", "Viet Nam", 30));
        people.add(new Person("Yenlt1", "Nhat Ban", 30));
        people.add(new Person("Yenlt1", "Trung Quoc", 30));
        people.add(new Person("Yenlt1", "Viet Nam", 30));
        people.add(new Person("Yenlt1", "Viet Nam", 30));

        LinkedList<String> list = new LinkedList<String>();

        for (int i = 0; i < people.size(); i++) {
            list.add(people.get(i).nationality);
        }

        System.out.println("danh sach toàn bộ quốc tịch : " + list);
        Map<String, Integer> map = new HashMap<String, Integer>();

        while (list.size() != 0) {
            int sizeFirst = list.size();
            String key = list.get(0);
            int value = 0;
            list.removeAll(Collections.singleton(key));
            value = sizeFirst - list.size();
            map.put(key, value);
        }
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + ": " + map.get(key));
        }
    }


}
