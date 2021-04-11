/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

/**
 *
 * @author ASUS X450JN
 */
public class Kelas1 extends Kelas {
    private double hasil;
    
    
    void dataSiswa(String Sekolah, String Jurusan){
        System.out.println("Sekolah :"+ Sekolah);
        System.out.println("Jurusan :"+ Jurusan);
         //menampilkan yang telah diiinput olehh user (setelah dipanggil)
        
    }
    
    void nilaiSiswa(double ulangan1, double ulangan2, double ulangan3){
        hasil = ((ulangan1+ulangan2+ulangan3)/3);
        //menghitung value dari user yang masukkan
        System.out.println("Nilai Akhir :" +hasil);
        System.out.println("---------------");
    }
    
    
}
