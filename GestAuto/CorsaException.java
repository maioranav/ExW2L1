package GestAuto;

public class CorsaException extends Exception {
    String message;

    public CorsaException(String mess) {
        this.message = mess;
    }

    ;

    public String toString() {
        return this.message;
    }
}
