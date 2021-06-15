package oneD.Buoi15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountString {
    public int countCapitalizeLetter(String str){
        int count = 0;
        // Đếm số từ viết in hoa trong chuỗi
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count++;
            }
        }
        return count;
    }

    public String vietHoaChuDauTienCach1(String str){
        // (VD You Only Live Once. But If You Do It Right. Once Is Enough)
//        String str = new String("You Only Live Once. But if You do it right. once is Enough");
        String[] arr = str.split(" ");
        String str1 = "";
        for (String x : arr) {
            str1 = str1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
            str1 = str1 + " ";
        }
        System.out.println("Biến các chữ đầu thành hoa: " + str1);
        return str1.trim();
    }

    public void vietHoaChuDauTienCach2(String str) {
        StringBuffer str1 = new StringBuffer();
        String[] array = str.split(" ");

        for (int i = 0; i < array.length; i++) {
            str1.append(Character.toUpperCase(array[i].charAt(0)))
                    .append(array[i].substring(1)).append(" ");
        }
        System.out.println("Biến các chữ đầu thành hoa: " + str1.toString().trim());

    }
//    public void chuyenKyTuSauDauCham(){
//        //Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, các chữ con lại viết thường (VD: You only live once. But if you do it right. Once is enough)
//        String str = new String("you Only Live Once. but if You do it right. once is Enough");
////        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
////        System.out.println("Chuyen ky tu dau tien cua chuoi thanh chu hoa: " + cap);
//
//        StringBuffer str1 = new StringBuffer();
//        String[] array = str.split(". ");
//        System.out.println("=========" + array);
//
//        for (int i = 0; i < array.length; i++) {
//            str1.append(Character.toUpperCase(array[i].charAt(0)));
//
//        }
////         .append(array[i].substring(1)).append(" ");
//        System.out.println("Chuyen thanh chư Hoa sau dấu chấm" + str1.toString().trim());
//    }

    public StringBuilder chuyenKyTuSauDauCham2(String str){
//        String str = new String("you Only Live Once. but if You do it right. once is Enough");
        String arr[] = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        System.out.println("Chuyen thanh chư Hoa sau dấu chấm: ");
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(Character.toUpperCase(arr[i].trim().
//                    charAt(0)) + arr[i].trim().substring(1) + ". ");
            sb.append(Character.toUpperCase(arr[i].trim().
                    charAt(0)) + arr[i].trim().substring(1) + ". ");
        }
        System.out.println(sb);

    return sb;
    }


}
