package oneD.Buoi16;

public class Employee {
    int id;
    String name;
    int age;
//    public Employee(int id, String name, int age){
//        this.age=age;
//        this.id=id;
//        this.name=name;
//         }
//

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }

}
