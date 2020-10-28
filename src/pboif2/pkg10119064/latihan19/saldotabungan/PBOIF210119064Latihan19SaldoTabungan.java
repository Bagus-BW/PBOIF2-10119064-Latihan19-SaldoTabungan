/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan19.saldotabungan;

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
    
    public static void saldoTabungan(double saldoAwal){
        double saldoAkhir;
        int lama = 6;
        
        for (int i = 1; i <= lama; i++) {
            saldoAkhir = (saldoAwal * 0.15) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " Rp. %,1.0f%n", Math.floor(saldoAkhir));
            saldoAwal = saldoAkhir;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal;
        
        saldoAwal = 2500000;
        saldoTabungan(saldoAwal);
    }
    
}
