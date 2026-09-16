
package main;

import java.util.Scanner;

public class KartyaKeveres {
    
    static Scanner beolv = new Scanner(System.in);  
    static String[] pakli = new String[22];
    
    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        feltolt();
        
        
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezVolt();
    }
    
    private static void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                String kartya = szin + "_" + ertek;
                if (db < 21){
                    pakli[++db] = kartya;
                }
            }
        }
    }

    private static void kirak() {
        
    }

    private static void melyik() {
        int oszlop = beolv.nextInt();
    }

    private static void kever() {
        
    }

    private static void ezVolt() {
        
    }
    
}
