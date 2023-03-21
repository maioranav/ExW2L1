package GestAuto;

import java.util.Scanner;

public class KmLt {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws CorsaException {
        while (true) {
            try {
                Corsa.calcolaConsumi();
            } catch (CorsaException e) {
                e.printStackTrace();
            }
        }
    }
}
