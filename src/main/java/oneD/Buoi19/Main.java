package oneD.Buoi19;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person per = new Person();
        ArrayList<Person> people = new ArrayList<>();
        people.addAll(per.createPersonList());
        Person.baiTap1a(people);
        Person.baiTap1b(people);
        Person.baiTap1c(people);
        Person.baiTap1d(people);
    }



}
