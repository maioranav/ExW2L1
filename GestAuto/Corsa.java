package GestAuto;

public class Corsa {
    double km = 100;
    double lt;

    public Corsa(double km, double lt) {
        this.km = km;
        this.lt = lt;
    }

    public static void calcolaConsumi(Corsa corsa) throws CorsaException {
        if (corsa.lt > 0 && corsa.km > 0) {
            double consumilt = corsa.km / corsa.lt;
            double consumikm = corsa.lt / corsa.km;
            System.out.println(">>Il consumo di questo viaggio è di " + consumilt + " l/km, ovvero " + consumikm + " km al litro.");
        } else {
            throw new CorsaException("Valori inseriti non validi");
        }
    }
}
