
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
            int o = melyik();
            kever(o);
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
        System.out.printf("%-10s%-10s%-10s\n", "1. o", "2. o", "3. o");
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-10s", pakli[i]);
            if(i % 3 == 0){
                System.out.println("");
            }
        }
    }

    private static int melyik() {
        System.out.print("Melyik oszlop? (1-3): \n");
        int oszlop = beolv.nextInt();
        while(oszlop < 1 || oszlop > 3){
            System.out.print("Hibás, újra: \n");
            oszlop = beolv.nextInt();
        }
        
        return oszlop;
        
    }

    private static void kever(int oszlop) {
        String[] ujPakli = new String[22];
        
        switch(oszlop){
            case 1 -> {
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20-(i-1)*3];
                    ujPakli[i+7] = pakli[19-(i-1)*3];
                    ujPakli[i+14] = pakli[21-(i-1)*3];
                }
            }
            case 2 -> {
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19-(i-1)*3];
                    ujPakli[i+7] = pakli[20-(i-1)*3];
                    ujPakli[i+14] = pakli[21-(i-1)*3];
                }
            }
            
            case 3 -> {
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19-(i-1)*3];
                    ujPakli[i+7] = pakli[21-(i-1)*3];
                    ujPakli[i+14] = pakli[20-(i-1)*3];
                }
            }
        }
        
        pakli = ujPakli;
    }

    private static void ezVolt() {
        System.out.println("Ez volt a kártyád: " + pakli[11]);
    }
    
}
