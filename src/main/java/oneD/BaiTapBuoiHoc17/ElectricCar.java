package oneD.BaiTapBuoiHoc17;

public class ElectricCar extends Car{
    public ElectricCar(String model, String make, int year) {
        super(model, make, year);
    }

    public void speed(){
        super.speed();
        System.out.println("Tốc độ của xe điện");
    }

    public void weight(){
        System.out.println("Cân nặng của xe Điện");
    }

    @Override
    public void dieuChinhTocDo() {
        System.out.println("Điều Chỉnh tốc độ xe chạy bằng điện");
    }

    @Override
    public void dieuChinhDenSang() {
        System.out.println("Điều Chỉnh đèn sáng xe chạy bằng điện");
    }

    @Override
    public void dieuChinhTiengCoi() {
        System.out.println("Điều Chỉnh tiếng còi xe chạy bằng điện");

    }
}
