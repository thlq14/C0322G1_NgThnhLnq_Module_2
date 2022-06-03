package ss21_Design_Patterns.thuc_hanh.object_pool;

public class TaxiNotFoundException extends RuntimeException{
    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
