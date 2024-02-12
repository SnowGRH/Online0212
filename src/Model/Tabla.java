package Model;

import java.util.Random;

/**
 *
 * @author gerge
 */
public class Tabla {

    private String[][] T;
    private String UresCella;
    private final Random rnd = new Random();

    public Tabla(String UresCella) {
        this.T = new String[8][8];
        this.UresCella = UresCella;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                this.T[i][j] = this.UresCella;
            }
        }
    }

    public String Megjelenít() {
        String txt = "";
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                txt += T[i][j];
            }
            txt += "\n";
        }
        return txt;
    }

    public void Elhelyez() {
        String k = "K";
        int kdb = 2;
        for (int cz = 0; cz < kdb; cz++) {
            int szi = rnd.nextInt(9);
            int szj = rnd.nextInt(9);
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < T.length; j++) {
                    if (szi == i && szj == j && T[i][j] == UresCella) {
                            T[i][j] = k;
                    }
                }
            }
        }
    }
}
