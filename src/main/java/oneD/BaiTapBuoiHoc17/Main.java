package oneD.BaiTapBuoiHoc17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean quit = false;
        String toQuit;
        String model, make;
        int year = 0;
        Scanner scanner = new Scanner(System.in);
        Car xeXang = new GasCar("ABC","Mexedec",2000);
        xeXang.dieuChinhDenSang();
        xeXang.dieuChinhTiengCoi();
        xeXang.dieuChinhTocDo();
        System.out.println("=====================");
        ElectricCar electricCar =new ElectricCar("XYZ","Vingroup",2010);

        electricCar.dieuChinhDenSang();
        electricCar.dieuChinhTiengCoi();
        electricCar.dieuChinhTocDo();
        electricCar.speed();
        electricCar.size();
        electricCar.weight();

        System.out.println("=====================");

        while(!quit){
            System.out.println("Please enter the car make, model, and year:");
            make=scanner.next();
            model=scanner.next();
            year=scanner.nextInt();
            xeXang.setMake(make);
            xeXang.setModel(model);
            xeXang.setYear(year);
//            scanner.nextLine();
            System.out.println("Here is data you provided" + xeXang);
            System.out.println("Press Q to quit or any key to continue");
            toQuit= scanner.next();
            if(toQuit.equalsIgnoreCase("Q"))
                quit=true;
        }
scanner.close();
        System.out.println("Good bye");


    }


}

