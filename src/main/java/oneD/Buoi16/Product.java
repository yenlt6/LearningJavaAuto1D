package oneD.Buoi16;

import java.util.ArrayList;

public class Product {
    int id;
    String name;
    int quantity;
    double price;

    public Product() {
    }

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

// Thêm sản phẩm vào danh sách
    public ArrayList<Product> addProduct() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(111, "Sữa", 13, 124));
        products.add(new Product(222, "Keo", 13, 124));
        products.add(new Product(333, "Bia", 14, 125));
        products.add(new Product(444, "Mì Tôm", 15, 126));
        products.add(new Product(555, "Thuoc la", 16, 127));
        System.out.println("in danh sách sản phẩm");
        for (Product p : products) {
            System.out.println(p);
        }
        return products;
    }

    // Tìm kiếm sản phẩm theo tên và sửa thông tin của sản phẩm đó
    public void searchProduct(ArrayList<Product> products, String productName) {
        System.out.println("Tìm kiếm sản phảm có tên là Sữa");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equals(productName)) {
                System.out.println(products.get(i));
                products.set(i, new Product(products.get(i).id, "Sữa chua", products.get(i).quantity, 159.5));
            }
        }

        System.out.println("Sau khi sữa sản phẩm : ");
        for (Product p : products) {
            System.out.println(p);
        }
    }

        public void deleteProduct (ArrayList < Product > products,int productID){
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).id == productID) {
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

