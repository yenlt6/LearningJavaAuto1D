package oneD.buoi13;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BaiTapTest {
    //ký tự đầu tiên của mỗi từ phải đươcj viết hoa, loại bỏ khoảng trắng đầu và cuối chuỗi
//    Mỗi từ cách nhau bằng 1 dấu cách



    @Test
    public void checkStandardName(){
       StringBuilder str = new StringBuilder(" Le Thi     yen  ");
//       String[] array = str.
       for(int i=0; i<str.length();i++){

       }
       assertThat(str).isUpperCase();

    }
//    iết chương trình cho phép người dùng nhập vào mã số nhân viên
//    Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
//    Định dạng mã số sinh viên là “NVxxxxxxx” với x là số nguyên từ 1-9. (Gợi ý, sử dụng regex)

}