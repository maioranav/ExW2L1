package GestAuto;

import java.util.Scanner;

public class KmLt {
    public static void main(String[] args) throws CorsaException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci km percorsi");
            double km = scan.nextDouble();
            System.out.println("Inserisci litri consumati");
            double lt = scan.nextDouble();
            Corsa corsa = new Corsa(km, lt);
            try {
                Corsa.calcolaConsumi(corsa);
            } catch (CorsaException e) {
                throw new CorsaException("Valori inseriti non validi");
            }
        }
    }
}
