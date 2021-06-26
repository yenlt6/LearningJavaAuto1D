package oneD.Buoi19;

import java.util.*;

public class Person {
    String name;
    String nationality;
    int age;

    public Person() {
    }

    ;

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    @Override
    public String toString() {
        return "- " + name + " - " + nationality + " - " + (double) age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Person> createPersonList() {
        ArrayList<Person> people = new ArrayList<>(List.of(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        ));
        return people;
    }


    public static void baiTap1a(ArrayList<Person> people) {
        //Bài Tập 1: 1.1 Đếm số người theo từng quốc tịch in ra màn hình

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
        for (String key : set) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static void baiTap1b(ArrayList<Person> people) {
        //Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình


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

    public static void baiTap1c(ArrayList<Person> people) {
        //Tính trung bình tuổi của người theo từng quốc gia
        ArrayList<Person> people1 = new ArrayList<>();
        people1.addAll(people);
        //đầu tiên là lấy ra danh sách các quốc gia
        List<String> list = new LinkedList<String>();

        for (int i = 0; i < people.size(); i++) {
            list.add(people.get(i).nationality);
        }

        List<String> set = new ArrayList<>(new HashSet<>(list));
     //List<String> listWithoutDuplicates = list.stream().distinct().collect(Collectors.toList());
        System.out.println("danh sach toàn bộ quốc tịch : " + list);
        System.out.println("danh sach Ten cac quoc gia ko lập lại : " + set);

        HashMap<String, String> mapNaPeo = new HashMap<>();
        int averageAge = 0;
        int count = 0;

        ArrayList<Person> valuePeople = new ArrayList<>();
        for (String key : set) {
            for (int i = 0; i < people1.size(); i++) {
                if (people1.get(i).nationality.contains(key)) {
                    count++;
                    averageAge = averageAge + people1.get(i).age;
                }
            }
            float f = averageAge / count;
            String average = String.format("%.01f", f);
            mapNaPeo.put(key, average);
            count = 0;
            averageAge = 0;
        }
        System.out.println("Tính trung bình tuổi của người theo từng quốc gia:");
        Set<String> set1 = mapNaPeo.keySet();
        for (String key : set1) {
            System.out.println(key + ": " + mapNaPeo.get(key));
        }
    }


}
