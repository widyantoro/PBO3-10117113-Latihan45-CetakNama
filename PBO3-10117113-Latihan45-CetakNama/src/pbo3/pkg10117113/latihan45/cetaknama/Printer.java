/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan45.cetaknama;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan nama berulang sesuai angka yang 
 *            dimasukan user
 *            
 */
public class Printer {
    private int jmlCetak;
 private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public void cetak(String nama) {
        System.out.println("Nama Anda : Fitrayana");
    }
    
    public void cetak(int jmlCetak, String nama) {
        
        System.out.println("Hasil Cetak : ");
        
        for (int i = 1; i<=jmlCetak; i++ ) {
            System.out.println(nama);
        }
    }
}
