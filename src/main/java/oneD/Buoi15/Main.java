package oneD.Buoi15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CountString countString = new CountString();
        String inputStr = new String("You Only Live Once. But if You do it right. once is Enough");
        System.out.println("số ký tự chữ hoa có trong chuối là: " + countString.countCapitalizeLetter(inputStr));
        countString.vietHoaChuDauTienCach1(inputStr);
        String string = new String("You Only Live Once. But if You do it right. once is Enough");
        countString.vietHoaChuDauTienCach2(string);
        countString.chuyenKyTuSauDauCham2(inputStr);

        inputPass();

        inputNumber();

    }

    //Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên trong đó có ít nhất 1 ký tự in hoa,
    public static void inputPass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập pass Word ");
        String pass = sc.nextLine();
        if (pass.length() < 10) {
            System.out.println("mật khẩu yếu");
        } else if (!pass.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{10,}$")) {
            System.out.println("mat khau chua du manh");
        }
    }

//Viết chương trình nhập vào một số nguyên dương, kiểm tra số đó có là một tháng trong năm không. Nếu có thì in ra tháng đó có bao nhiêu ngày. (Xử lý exception đầy đủ)

    public static void inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mot so nguyen duong: ");
        int number = 0;
        try {
            number = sc.nextInt();

        } catch (Exception e) {
            System.out.println("số nhập vào không đúng định dạng, nó phải là dạng số");
        }

        if (number > 0 && number < 13) {
            System.out.println("Sô nhap vao la mot thang trong năm");
            if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
                System.out.println("Thang " + number + " có 31 ngay");
            } else if (number == 4 || number == 6 || number == 9 || number == 11) {
                System.out.println("Thang " + number + " có 30 ngay");
            } else {
                System.out.println("Thang " + number + " có 28 hoặc 29 ngay");
            }
        }


    }


}
