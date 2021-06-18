package oneD.Buoi16;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    int id;
    String name;
    int age;
    String address;
    String phoneNumber;

    public Employee() {
    }

    public Employee(int id, String name, int age, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    // Thêm thông tin nhân viên

    public ArrayList<Employee> addEmployee() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(111, "Yenlt1", 30, "Long Biên, Hà Nội1","0919348512"));
        employees.add(new Employee(222, "Yenlt2", 31, "Long Biên, Hà Nội2","0919348513"));
        employees.add(new Employee(333, "Yenlt3", 32, "Long Biên, Hà Nội3","0919348514"));
        employees.add(new Employee(444, "Yenlt4", 33, "Long Biên, Hà Nội4","0919348515"));
        employees.add(new Employee(555, "Yenlt5", 34, "Long Biên, Hà Nội5","0919348516"));
        System.out.println("in danh sách nhân viên");
        for (Employee e : employees) {
            System.out.println(e);
        }
        return employees;
    }

    public void updateEmployee(ArrayList<Employee> employees){
        //Nhập vào tên nhân viên và tìm kiếm xem tên bạn vừa nhập có trong danh sách không, nếu có tiến hành sửa thông tin nhân viên đó, nếu không thông báo ra không có nhân viên này,
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Nhập vào tên nhân viên: ");
        name = scanner.nextLine();
        Boolean haveEmployee = false;
        for (int i =0; i<employees.size();i++) {
            if (employees.get(i).name.equals(name)) {
                System.out.println("Tên vừa nhập có trong danh sách nhân viên, sửa thông tin của nhân viên này");
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Update ID: ");
                int id = scanner1.nextInt();
                employees.set(i, new Employee(id, name, 35, "vinhome ocean park, Hà Nội1","0919348512"));
                haveEmployee =true;
                break;
            }
        }
        if(!haveEmployee){
            System.out.println("Không có nhân viên bạn vừa nhập");
        }else {
            System.out.println("Sau khi sữa nhân viên : ");
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }

    public void removeEmployee(ArrayList<Employee> employees){
        //Nhập vào một mã nhân viên và kiểm tra xem có mã này trong danh sách nhân viên không, nếu có xóa nhân viên đó ra khỏi danh sách, nếu không thông báo là không có nhân viên này.
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Nhập vào mã nhân viên:");
        id = scanner.nextInt();
        Boolean haveEmployee = false;
        for (int i =0; i<employees.size();i++) {
            if (employees.get(i).id==id) {
                System.out.println("ID vừa nhập vào có trong đanh sách, xóa nhân vien này ra khỏi danh sách");
                employees.remove(i);
                haveEmployee =true;
                break;
            }
        }
        if(!haveEmployee){
            System.out.println("Không có nhân viên bạn vừa nhập");
        }else {
            System.out.println("List nhân viên sau khi remove : ");
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }


}
