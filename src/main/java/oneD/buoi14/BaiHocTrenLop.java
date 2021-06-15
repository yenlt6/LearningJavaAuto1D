package oneD.buoi14;

import java.util.InputMismatchException;
import java.util.Scanner;


public class BaiHocTrenLop {

    public void example() {
        //Custom exception
        try {
            float age = inputWeitht();
            System.out.println("Tuổi đã nhập: " + age);
        } catch (WeightCheckingException e) {
            System.out.println(e.getMessage());
        }
    }


        //        int result = 7/0;  // ArithmeticException
//        System.out.println(result);

//        String obj = null;
//        System.out.println(obj.length()); // NullPointerException
//
//        String str = "abc";
//        int num = Integer.parseInt(str); // NumberFormatException
//
//        int arr[] = new int[5];
//        arr[5] = 50; // ArrayIndexOutOfBoundsException
//
//        ExceptionExample exception = new ExceptionExample();
//        exception.checkAge(10);


        //xử lý ngoiaj lệ tại đây
//        try {
//            int age = exception.setAge();
//            System.out.println("Tuổi của nhân viên: " + age);
//        } catch (IOException e) {
//            System.out.println("Tuổi vừa nhập không hợp lệ: " +e.toString());
//        }





//        try{
//            int result = 7/0;
//
//        }catch (Exception e){
//            System.out.println("Ko the chia mot so cho 0");
//        }finally {
//            System.out.println("Khoi lenh nay luon duoc thuc thi");
//
//        }

//
//        try{
//            String str=null;
//            str.length();
//        }catch (Exception e){
//            System.out.println("Ko lay duoc length cua Null");
//        }
//
//        try {
//            String str = "abc";
//            int num = Integer.parseInt(str);
//
//        }catch (Exception e){
//            System.out.println("NumberFormatException: Kieu du lieu ep kieu sang Int ko duoc phe");
//        }
//
//        try
//
//    {
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println(" nhap kich thuoc mang:");
//        n = sc.nextInt();
//        int[] arr = new int[n];
////        }catch (InputMismatchException e){
////            System.out.println("InputMismatchException: kich thuoc mang phai la So");
////        }catch (NegativeArraySizeException e){
////            System.out.println("NegativeArraySizeException: Kich thuoc mang ko phai la so am");
//
//    }catch(
//    Exception e)
//
//    {
////            System.out.println("Ko biet la loi exception gi" + e.getMessage());
////            System.out.println("Ko biet la loi exception gi" + e.getCause());
////            System.out.println("Ko biet la loi exception gi" + e.toString());
////            System.out.println("Ko biet la loi exception gi" + e.getStackTrace());
//        e.printStackTrace();
//    }
//
//
//    //Tinh Chi so BMI va dua ra cac ngoai le cho Chi so do
//        try
//
//    {
//        Scanner sc = new Scanner(System.in);
//        float cao;
//        float nang;
//        System.out.println(" nhap chieu cao");
//        cao = sc.nextFloat();
//
//        Scanner high = new Scanner(System.in);
//        float n;
//
////        }catch (InputMismatchException e){
////            System.out.println("InputMismatchException: kich thuoc mang phai la So");
////        }catch (NegativeArraySizeException e){
////            System.out.println("NegativeArraySizeException: Kich thuoc mang ko phai la so am");
//
//    }catch(
//    Exception e)
//
//    {
////            System.out.println("Ko biet la loi exception gi" + e.getMessage());
////            System.out.println("Ko biet la loi exception gi" + e.getCause());
////            System.out.println("Ko biet la loi exception gi" + e.toString());
////            System.out.println("Ko biet la loi exception gi" + e.getStackTrace());
//        e.printStackTrace();
//    }

//        https://github.com/TechMaster/JavaCore/tree/main/13Exceptions/Example


//            Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println(" nhap n:");
//        n=sc.nextInt();
//        int[] arr = new int[n];



//    static int inputAge() throws AgeCheckingException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Hãy nhập tuổi nhân viên: ");
//        int age = 0;
//        try {
//            age = scanner.nextInt();
//            if (age < 0) throw new AgeCheckingException("tuổi không được nhỏ hơn 0.");
//        } catch (InputMismatchException e) {
//            throw new AgeCheckingException("tuổi phải là một số.");
//        }
//        return age;
//    }


    static float inputWeitht() throws WeightCheckingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập cân nặng của bạn: ");
        float weight = 0;
        try {
            weight = scanner.nextFloat();
            if (weight < 0) throw new WeightCheckingException("Can nang ko duoc nho hon 0.");
        } catch (InputMismatchException e) {
            throw new WeightCheckingException("Can nang phai la mot so.");
        }
        return weight;
    }


}
