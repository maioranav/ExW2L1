package GestBancario;

public class BancaException extends Exception{
    String message;
    public BancaException(){};
    public BancaException(String mess){
        this.message = mess;
    };
    public String toString() {
        return this.message;
    }

}
