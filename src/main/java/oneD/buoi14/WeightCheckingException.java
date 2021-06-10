package oneD.buoi14;

public class WeightCheckingException extends Exception{
    public WeightCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vao Can nang: " + super.getMessage();
    }
}
