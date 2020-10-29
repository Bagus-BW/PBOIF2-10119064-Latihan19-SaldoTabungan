/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan19.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menghitung saldo tabungan
 */
public class PBOIF210119064Latihan19SaldoTabungan {
    
    public static void saldoTabungan(double saldoAwal, double bunga, int lama){
        double saldoAkhir, bungabulan;
        
        //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        bungabulan = bunga/100;
        
        for (int i = 1; i <= lama; i++) {
            saldoAkhir = (saldoAwal * 0.15) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", kursIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal, bunga;
        int lama;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan saldo awal : ");
        saldoAwal = keyboard.nextDouble();
        
        System.out.print("Masukkan bunga/bulan(15%) : ");
        bunga = keyboard.nextInt();
        
        System.out.print("Masukkan lama bulan (6) : ");
        lama = keyboard.nextInt();
        
        System.out.println("");
        saldoTabungan(saldoAwal, bunga, lama);
    }
    
}
