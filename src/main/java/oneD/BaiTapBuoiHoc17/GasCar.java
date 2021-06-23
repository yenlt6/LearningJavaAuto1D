package oneD.BaiTapBuoiHoc17;

public class GasCar extends Car{

    public GasCar(String model, String make, int year) {
        super(model, make, year);
    }

    @Override
    public void dieuChinhTocDo() {
        System.out.println("Hàm điều chỉnh tốc độ của Xe Chạy bằng Xăng");
    }

    @Override
    public void dieuChinhDenSang() {
        System.out.println("Hàm điều chỉnh ánh sáng của Xe Chạy bằng Xăng");
    }

    @Override
    public void dieuChinhTiengCoi() {
        System.out.println("Hàm điều chỉnh Tiếng Còi của Xe Chạy bằng Xăng");
    }


}
