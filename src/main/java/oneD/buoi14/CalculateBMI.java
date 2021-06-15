package oneD.buoi14;

import java.util.Random;
import java.util.Scanner;

public class CalculateBMI {
    //viet chuong trinh tinh chi so BMI co xu ly ngoai le
    //Chi so BMI la = chieu cao/can nang, chieu cao, can nang nhap vao tu ban phim, chieu co va can nang phai lon hon >0,
    // xu ly ngoai le ngay tu luc nhap ban phim, nhung luc thuc hien phep chia cung phai xu ly ngoai le nua
    public void inputBMIandCalculate(){
        Scanner scanner = new Scanner(System.in);
        float chieuCao;
        float weight;
        System.out.println("Nhap chieu cao cua ban: ");
        do {
            chieuCao= scanner.nextFloat();
            if(chieuCao<0 || chieuCao==0){
                System.out.println("ban phai nhap lai chieu cao la so >0");
            }
        }while (chieuCao < 0 || chieuCao==0);



        System.out.println("Nhap can nang cua ban: ");
        do {
            weight= scanner.nextFloat();
            if(weight<0 || weight==0){
                System.out.println("ban phai nhap lai can nang la so >0");
            }
        }while (weight < 0 || weight==0);

        try {
            float bmi = chieuCao/weight;

        }catch (Exception e){
            System.out.println("fdfdfdsf");

        }



    }



    public void compareRandom(){
        int random = 5;


        Scanner scanner = new Scanner(System.in);
        int random1;

        System.out.println("Nhap mot so ngau nhien tu ban phim ");
        do {
            random1= scanner.nextInt();
            if(random1<10 || random1>50){
                System.out.println("ban phai nhap lai mot so trong khoang tu 10 den 50");
            }
        }while (random1 < 10 || random1>50);







    }



}
