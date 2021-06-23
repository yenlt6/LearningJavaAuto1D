package oneD.Buoi17;

public class ClassB extends AbstractClassA{
    int age;
    String position;

    public ClassB() {

    }

    @Override
    public void method2() {
        System.out.println("This is method detail for abstract method of abstractClassA");

    }

    public ClassB(int age, String position) {
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "age=" + age +
                ", position='" + position + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
