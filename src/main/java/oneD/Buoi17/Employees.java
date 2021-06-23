package oneD.Buoi17;
import java.util.ArrayList;
import java.util.Scanner;

public class Employees extends Person{
    String phoneNumber;
    int id;

    public Employees() {
        super();
    }

    public Employees(String name, int age, String address, String phoneNumber, int id) {
        super(name, age, address);
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    // Thêm thông tin nhân viên

    public ArrayList<Employees> addEmployee() {
        ArrayList<Employees> employees = new ArrayList<Employees>();
        employees.add(new Employees("Yenlt1", 30, "LongBien Hà Nội", "0919348512", 1111));
        employees.add(new Employees("Yenlt2", 31, "LongBien Hà Nội", "0919348512", 1112));
        employees.add(new Employees("Yenlt3", 32, "LongBien Hà Nội", "0919348512", 1113));
        employees.add(new Employees("Yenlt4", 33, "LongBien Hà Nội", "0919348512", 1114));
        employees.add(new Employees("Yenlt5", 34, "LongBien Hà Nội", "0919348512", 1115));
        employees.add(new Employees("Yenlt6", 35, "LongBien Hà Nội", "0919348512", 1116));
        employees.add(new Employees("Yenlt7", 36, "LongBien Hà Nội", "0919348512", 1117));
        employees.add(new Employees("Yenlt8", 37, "LongBien Hà Nội", "0919348512", 1118));
        System.out.println("in danh sách nhân viên");
        for (Employees e : employees) {
            System.out.println(e);
        }
        return employees;
    }

    public void updateEmployee(ArrayList<Employees> employees){
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
                System.out.println("Update địa chỉ: ");
                String str = scanner1.nextLine();
                System.out.println("Update số điện thoại: ");
                String phone = scanner1.nextLine();
                employees.set(i, new Employees(name, 35, str, phone, employees.get(i).id));
                haveEmployee =true;
                break;
            }
        }
        if(!haveEmployee){
            System.out.println("Không có nhân viên bạn vừa nhập");
        }else {
            System.out.println("Sau khi sữa nhân viên : ");
            for (Employees e : employees) {
                System.out.println(e);
            }
        }
    }

    public void removeEmployee(ArrayList<Employees> employees){
        //Nhập vào một mã nhân viên và kiểm tra xem có mã này trong danh sách nhân viên không, nếu có xóa nhân viên đó ra khỏi danh sách, nếu không thông báo là không có nhân viên này.
        Scanner scanner = new Scanner(System.in);
        int idEmployee = 0;
        System.out.println("Nhập vào mã ID nhân viên:");
        idEmployee = scanner.nextInt();
        Boolean haveEmployee = false;
        for (int i =0; i<employees.size();i++) {
            if (employees.get(i).id==idEmployee) {
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
            for (Employees e : employees) {
                System.out.println(e);
            }
        }
    }


}
