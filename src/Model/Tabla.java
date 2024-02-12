/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gerge
 */
public class Tabla {
    private char[][] T;
    private char UresCella;
    

    public Tabla(char UresCella) {
        this.T = new char[8][8];
        this.UresCella = UresCella;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < 10; j++) {
                this.T[i][j] = this.UresCella;
            }
        }
    }
    
    
}
