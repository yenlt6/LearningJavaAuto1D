package oneD.buoi14;

public class InputNumberException extends Exception{
    public InputNumberException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return "Loi: " + super.getMessage();
    }
}
