/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan34_.oo.kalkuator;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan penjumlahan,
* pengurangan,perkalian seperti pada kalkulator. angka di inputkan oleh user
 */
public class PBO3_10117082_Latihan34_OOKalkuator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
 Scanner scn = new Scanner(System.in);
        Kalkulator kalutor = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka Ke-1 : ");
        kalutor.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka Ke-2 : ");
        kalutor.value2 = scn.nextDouble();

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kalutor.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalutor.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kalutor.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kalutor.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kalutor.sisaBilangan());
                
                
              
        
    
    }
    
}
