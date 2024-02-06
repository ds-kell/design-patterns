package factory_method;

public class VietComBank implements Bank{
    @Override
    public String getBankName() {
        return "VietComBank";
    }
}
