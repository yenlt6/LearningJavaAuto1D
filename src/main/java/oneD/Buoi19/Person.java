package oneD.Buoi19;

import java.util.*;

public class Person {
    String name;
    String nationality;
    int age;

    public Person() {
    }


    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    @Override
    public String toString() {
        return "- " + name + " - " + nationality + " - " + age;
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




    public static void countPersonInCountry(List<Person> people) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0; i<people.size();i++){
            String key = people.get(i).getNationality();
            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                int value = map.get(key);
                value++;
                map.put(key,value);
            }
            }
        System.out.println("Số người theo từng quốc gia và in ra màn hình:");
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + ": " + map.get(key));
        }
        }

    public static void sortPersonHaveAgeBiggerThan25YearsOld(List<Person> persons) {
        List<Person> sortedList = new ArrayList<>();
        for (Person p : persons) {
            if (p.getAge() > 25) {
                sortedList.add(p);
            }
        }
        sortedList.sort(Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge));
        for (Person p : sortedList) {
            System.out.println(p);
        }
        //C2 Java Stream
//        sortedList.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }

    public void calAverageAgeByNationality(List<Person> persons) {
        Map<String, List<Integer>> map = groupAgeByCountry(persons);
        Map<String, Double> map2 = new HashMap<>();
        for (String key : map.keySet()) {
            List<Integer> values = map.get(key);
            int sum = 0;
            for (Integer age : values) {
                sum += age;
            }
            double averageAge = calAvg(sum, values.size());
            double value = Math.floor(averageAge * 10) / 10;
            map2.put(key, value);
        }
        printMap2(map2);
    }

    private void printMap2(Map<String, Double> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
    private double calAvg(int sum, int n) {
        double avg = (double) sum / n;
        return avg;
    }



    public Map<String, List<Integer>> groupAgeByCountry(List<Person> persons) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (Person p : persons) {
            String key = p.getNationality();
            List<Integer> values = new ArrayList<>();
            if (!map.containsKey(key)) {
                values.add(p.getAge());
                map.put(key, values);
            } else {
                values = map.get(key);
                values.add(p.getAge());
//                map.put(key, values);
            }
        }
        System.out.println("YYYYYYYY");
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + ": " + map.get(key));
        }
        return map;
    }



    public static void baiTap1a(ArrayList<Person> people) {
        //Bài Tập 1: 1.1 Đếm số người theo từng quốc tịch in ra màn hình
        System.out.println("======= Bài Tập 1a =======");
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


        public static void baiTap1b(List<Person> people) {
        System.out.println("======= Bài Tập 1b =======");
        System.out.println("Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình:");
        ArrayList<Person> people1 = new ArrayList<>();
        people1.addAll(people);
        Iterator<Person> iter = people1.iterator();
        while (iter.hasNext()) {
            Person per = iter.next();
            if (per.age < 25 || per.age == 25) {
                iter.remove();
            }
        }
//        people1.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
        people1.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
//    for (Person p : people) {
//        System.out.println(p);
//    }
    }

    public static void baiTap1c(ArrayList<Person> people) {
        System.out.println("======= Bài Tập 1c =======");
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
            float f = averageAge*1.0f/count;
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

    public static void baiTap1d(ArrayList<Person> people) {
        System.out.println("======= Bài Tập 1d" +
                " =======");
        System.out.println("In ra màn hình đánh giá tuổi mỗi người");
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).age < 20) {
                System.out.println(people.get(i) + "- nổi loạn");
            } else if (people.get(i).age >= 20 && people.get(i).age <= 30) {
                System.out.println(people.get(i) + "- việc làm");
            } else if (people.get(i).age >= 31 && people.get(i).age <= 40) {
                System.out.println(people.get(i) + "- Sự nghiệp");
            } else if (people.get(i).age >= 41) {
                System.out.println(people.get(i) + "- Hưởng thụ");
            }
        }

    }


}
