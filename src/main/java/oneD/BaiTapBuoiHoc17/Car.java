package oneD.BaiTapBuoiHoc17;
import java.util.Scanner;
//https://www.youtube.com/watch?v=GC2c5X-rtFE&ab_channel=CodingHomework

public abstract class Car {
  private String model;//
  private String make;//nhà sản xuất
  private int year;//năm sản xuất


  public abstract void dieuChinhTocDo();
  public abstract void dieuChinhDenSang();
  public abstract void dieuChinhTiengCoi();

   public void speed(){
      System.out.println("Tốc độ của xe Car");
  }

  public void size(){
      System.out.println("Kích cỡ của xe Car ");
  }

  public void weight(){
      System.out.println("Cân nặng của xe Car");
  }



  Scanner scan = new Scanner(System.in);
  // constructor
    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        while (year<1900 || year>2021){
            System.out.println("Please enter valid year, year must > 1900 and < 2021: ");
            year = scan.nextInt();
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +  "model='" + model + '\'' + ", make='" + make + '\'' + ", year=" + year + ", scan=" + scan + '}';
    }
}
