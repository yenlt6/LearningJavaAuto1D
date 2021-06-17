//package oneD.Buoi16;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Temp {
//
//
//    ArrayList<String> name = new ArrayList<String>();
//    List<String> cars = new ArrayList<String>();
//        name.add("yen1");
//        name.add("yen2");
//        name.add("yen3");
//        name.add("yen4");
//        name.add("yen5");
//        name.set(3, "Yen Set");
//    boolean a = name.contains("yen1");
//        if (a) {
//        System.out.println("mang chua phan tu: yen1");
//    }
//        System.out.println("vij tri cua phan tu: yen2 = " + name.indexOf("yen2"));
//
//        for (int i = 0; i < name.size(); i++) {
//        System.out.println(name.get(i));
//    }
//
//        name.remove("yen4");
//        System.out.println();
//
//        for (int i = 0; i < name.size(); i++) {
//        System.out.println(name.get(i));
//    }
//
//        System.out.println("Dùng vong lap foreach:");
//        for (String str : name) {
//        System.out.println(str);
//
//    }
//
//    ArrayList<Employee> listEmployees = new ArrayList<Employee>();
//    Employee employee = new Employee(123, "yenlt6", 36);
//    //them đối tượng này vào trong danh sách
//        listEmployees.add(employee);
//        listEmployees.add(new Employee(2, "Yen2", 37));
//        for (int i = 0; i < listEmployees.size(); i++) {
//        System.out.println(listEmployees.get(i));
//    }
//
//        for (Employee employee1 : listEmployees) {
//        System.out.println(employee1);
//    }
//    // Tìm 1 nhân viên có tên là Yen2
//
//        System.out.println("Thong tin nhan vien");
//
//        for (int i = 0; i < listEmployees.size(); i++) {
//        if (listEmployees.get(i).name.contains("yenlt6")) {
//            System.out.println(listEmployees.get(i));
//        }
//    }
//    //Them sửa xoa
//        listEmployees.add(new Employee(111, "yen1", 20));
//
//        for (int i = 0; i < listEmployees.size(); i++) {
//        if (listEmployees.get(i).name.contains("yenlt6")) {
//            System.out.println("Tien hanh sua phan tu có ten la: yenlt6");
//            listEmployees.set(i, new Employee(111, "yenaaaaaaaaaa", 20));
//        }
//    }
//
//        System.out.println(" sau khi sửa:");
//
//        for (Employee employee1 : listEmployees) {
//        System.out.println(employee1);
//    }
//// Thêm sửa xóa, tìm kiếm: quản lý một danh sách nhân viên
//
////        listEmployees.add(111,"yen1",20);
//
//}
////nam trong package : java.util
//
//
//
//// quản lý danh sách sản phẩm, tên sản phẩm,: tiến hành tìm kiếm, thêm sửa xóa.
//
//
//}
