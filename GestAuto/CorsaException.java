package GestAuto;

public class CorsaException extends Exception {
    String message;

    public CorsaException() {
        super("Valori inseriti non validi");
    }

    public CorsaException(String value) {
        super(value);
        this.message = value;
    }

    ;

    public String toString() {
        return this.message;
    }
}
