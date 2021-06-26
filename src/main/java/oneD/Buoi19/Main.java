package oneD.Buoi19;

import oneD.Buoi17.Employees;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        baiTap1a();
//        baiTap1b();
        baiTap1c();
    }

    public static void baiTap1c() {
        //Tính trung bình tuổi của người theo từng quốc gia

        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Person> people1 = new ArrayList<>();
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
        people1.addAll(people);
        LinkedList<String> list = new LinkedList<String>();

        for (int i = 0; i < people.size(); i++) {
            list.add(people.get(i).nationality);
        }

        System.out.println("danh sach toàn bộ quốc tịch : " + list);
        Map<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, ArrayList<Person>> mapNaPeo = new HashMap<String, ArrayList<Person>>();

        while (list.size() != 0) {
            int sizeFirst = list.size();
            String key = list.get(0);
            int value = 0;
            list.removeAll(Collections.singleton(key));
            value = sizeFirst - list.size();
            map.put(key, value);
        }
        System.out.println("Số người theo từng quốc gia và in ra màn hình:");
        Set<String> set = map.keySet();
        System.out.println("====" + set);
        for (String key : set) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("======*****");
        for (Person p1 : people1) {
            System.out.println(p1);
        }

        ArrayList<Person> valuePeople = new ArrayList<>();
        Iterator<String> iterator = set.iterator();

        for (String key : set) {
            System.out.println("====2222" + key);
            //                System.out.println((String) iterator.next());
//                String nat = iterator.next();
            for (int i = 0; i < people1.size(); i++) {
                System.out.println("77777777" + people1.get(i).nationality);
                if (people1.get(i).nationality.contains(key)) {
                    System.out.println("Thêm phần tử vào mảng National và peolple");

                    valuePeople.add(new Person(people1.get(i).name,people1.get(i).nationality,people1.get(i).age));
//                    valuePeople.add(people1.get(i));
                    mapNaPeo.put(key, valuePeople);


                }
            }
        }
        Set<String> set1 = mapNaPeo.keySet();
        System.out.println("====11111111111" + set1);
        for (String key : set1) {
            System.out.println(key + ": " + mapNaPeo.get(key));
        }


    }


    public static void baiTap1b() {
        //Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
//    ArrayList<Person> people = new ArrayList<Person>(List.of(new Person("Yenlt1","Viet Nam", 30)));
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Yenlt1", "Viet Nam", 10));
        people.add(new Person("Yenlt1", "Viet Nam", 35));
        people.add(new Person("Yenlt2", "Viet Nam", 25));
        people.add(new Person("Yenlt3", "Trung Quoc", 26));
        people.add(new Person("Yenlt4", "Trung Quoc", 27));
        people.add(new Person("Yenlt1", "Viet Nam", 28));
        people.add(new Person("Yenlt1", "Nhat Ban", 10));
        people.add(new Person("Yenlt1", "Trung Quoc", 20));
        people.add(new Person("Yenlt1", "Viet Nam", 28));
        people.add(new Person("Yenlt1", "Viet Nam", 26));


        Iterator<Person> iter = people.iterator();
        while (iter.hasNext()) {
            Person per = iter.next();
            if (per.age < 25 || per.age == 25) {
                iter.remove();
            }
        }
        System.out.println("Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình:");
        people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
//    for (Person p : people) {
//        System.out.println(p);
//    }
    }

    public static void baiTap1a() {
        //Bài Tập 1: 1.1 Đếm số người theo từng quốc tịch in ra màn hình
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
        System.out.println("Số người theo từng quốc gia và in ra màn hình:");
        Set<String> set = map.keySet();
        System.out.println("====" + set);
        for (String key : set) {
            System.out.println(key + ": " + map.get(key));
        }
    }


}
