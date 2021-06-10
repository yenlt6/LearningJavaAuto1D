package oneD.buoi14;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void test1() {
        String str = "abc";
        int num = Integer.parseInt(str);
    }

    //Tao 1 cai mang gom n phan tu, n nhap vao tu ban phim
    @Test
    public void test2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu mang");
        int size = scanner.nextInt();
        int []arr = new int[size];


    }


}