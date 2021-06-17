package oneD.Buoi16;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product pro = new Product(111, "Sữa", 12, 123.5);
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(pro);
        products.add(new Product(222, "Keo", 13, 124));
        products.add(new Product(333, "Bia", 14, 125));
        products.add(new Product(444, "Mì Tôm", 15, 126));
        products.add(new Product(555, "Thuoc la", 16, 127));
        System.out.println("in danh sách sản phẩm");
        for (Product p : products) {
            System.out.println(p);
        }
        // Tìm kiếm sản phẩm theo tên:
        System.out.println("Tìm kiếm sản phảm có tên là Sữa");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equals("Sữa")) {
                System.out.println(products.get(i));
                products.set(i, new Product(products.get(i).id, "Sữa chua", products.get(i).quantity, 159.5));
            }
        }
        // sửa sản phẩm
        System.out.println("Sau khi sữa sản phẩm : ");
        for (Product p : products) {
            System.out.println(p);
        }
       // xóa sản phẩm
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).id==222) {
                System.out.println(products.get(i));
                products.remove(i);
            }
        }

        System.out.println("Sau khi xóa:");
        for (Product p : products) {
            System.out.println(p);
        }

    }
}