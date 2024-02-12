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
                txt += " " + T[i][j] + " ";
            }
            txt += "\n";
        }
        return txt;
    }

    public void Elhelyez(int kdb) {
        String kiralynojel = "K";
        for (int cz = 0; cz < kdb; cz++) {
            int szi = rnd.nextInt(9);
            int szj = rnd.nextInt(9);
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < T.length; j++) {
                    if (szi == i && szj == j && T[i][j] == UresCella) {
                        T[i][j] = kiralynojel;
                    }
                }
            }
        }
    }

    public boolean UresOszlop(int oszlop) {
        int i = 0;
        while (i < 8 && T[oszlop][i] != "K") {

                i++;

        }
        return i == 8;
    }

    public boolean UresSor(int sor) {
        int i = 0;
        while (i < 8 && T[sor][i] != "K") {

                i++;

        }
        return i == 8;
    }

    public int UresOszlopok() {
        int db = 0;
        for (int i = 0; i < 8; i++) {
            if (UresOszlop(i)) {
                db++;
            }
        }
        return db;
    }

    public int UresSorok() {
        int db = 0;
        for (int i = 0; i < 8; i++) {
            if (UresSor(i)) {
                db++;
            }
        }
        return db;
    }
}
