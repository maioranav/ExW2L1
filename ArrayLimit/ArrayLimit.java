package ArrayLimit;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLimit {

    static Scanner scan = new Scanner(System.in);

    static int[] array = {3, 5, 7, 9, 6};

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println(Arrays.toString(array));
            sostituisciValore();
        }
    }

    public static void sostituisciValore() throws Exception {
        try {
            System.out.println("Inserisci nuova posizione array (0-5)");
            int pos = scan.nextInt();
            if (pos >= 0 && pos <= 4) {
                System.out.println("Inserisci nuova valore per la posizione" + pos + "(0-10)");
                int val = scan.nextInt();
                if (val >= 0 && val <= 10) {
                    array[pos] = val;
                } else {
                    throw new Exception("Valore fuori dai limiti");
                }
            } else {
                throw new Exception("Posizione inesistente");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
