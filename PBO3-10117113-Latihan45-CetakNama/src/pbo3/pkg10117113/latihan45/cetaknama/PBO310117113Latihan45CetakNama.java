/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan45.cetaknama;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan nama berulang sesuai angka yang 
 *            dimasukan user
 *            
 */
public class PBO310117113Latihan45CetakNama {

    private static int jmlCetak;
    private static String nama;
    
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);        
        Printer objPrinter1 = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama====="); 
        System.out.print("Masukan Nama Anda : " );
        nama = baca.next();
        System.out.print("Mau Cetak Nama Berapa Kali? : ");
        jmlCetak = baca.nextInt();
        objPrinter1.cetak(nama);
        objPrinter1.cetak(jmlCetak, nama);
    }
    
}
