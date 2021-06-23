package oneD.Buoi17;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Yến");
        LocalDate a = LocalDate.of(1970, 11, 02);
        System.out.println("=====" + a);
        AbstractClassA abstractClassA = new ClassB(15,"Nhân Viên Lập Trình Cao Cấp");


        abstractClassA.id = 1111;
        abstractClassA.name = "Yenlt6";
        abstractClassA.method1();
        abstractClassA.method2();
        System.out.println("In ra: " + abstractClassA);





//        Employees employee = new Employees();
//        ArrayList<Employees> employees = employee.addEmployee();
//        employee.updateEmployee(employees);
//        employee.removeEmployee(employees);

    }
}
