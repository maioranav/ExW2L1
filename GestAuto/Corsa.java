package GestAuto;

import static GestAuto.KmLt.scan;

public class Corsa {
    double km = 100;
    double lt;

    public static void calcolaConsumi() throws CorsaException {
        System.out.println("Inserisci km percorsi");
        double km = scan.nextDouble();
        System.out.println("Inserisci litri consumati");
        double lt = scan.nextDouble();
        if (lt > 0 && km > 0) {
            double consumilt = km / lt;
            double consumikm = lt / km;
            System.out.println(">>Il consumo di questo viaggio è di " + consumilt + " l/km, ovvero " + consumikm + " km al litro.");
        } else {
            throw new CorsaException("Valori inseriti non validi");
        }
    }
}
