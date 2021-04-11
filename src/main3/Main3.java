/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

import java.util.Scanner;

/**
 *
 * @author ASUS X450JN
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //saya tidak paham dengan tugas yang diberikan, jadi saya ganti menjadi ini
        String Nama,jeniskelamin; 
        int Umur;
        String Sekolah,Jurusan;
        double ulangan1,ulangan2,ulangan3;
        double hasil;
        
        Kelas1 obj = new Kelas1();
        Kelas objk = new Kelas1();
        Scanner sc = new Scanner(System.in);
        //input scanner
        


        System.out.print("Masukkan Nama Anda :");
        Nama = sc.nextLine();
        System.out.println("Masukkan Jenis Kelamin : ");
        jeniskelamin =sc.nextLine();
        System.out.println("Masukkan Umur :");
        Umur = sc.nextInt();
        sc.nextLine();
        System.out.println("Masukkan Sekolah :");
        Sekolah = sc.nextLine();
        System.out.println("Masukkan Jurusan :");
        Jurusan = sc.nextLine();
        //masukkan value
        

        
        
        System.out.print("Masukkan Nilai Ulangan 1 : ");
        ulangan1 = sc.nextDouble();
        System.out.print("Masukkan Nilai Ulangan 2 : ");
        ulangan2 = sc.nextDouble();
        System.out.print("Masukkan Nilai Ulangan 3 : ");
        ulangan3 = sc.nextDouble();
        //memasukkan value
        
        objk.iden(Nama, jeniskelamin, Umur);
        obj.dataSiswa(Sekolah , Jurusan);
        obj.nilaiSiswa(ulangan1, ulangan2, ulangan3);
        //pemanggilan kelas dan kelas1
        
        
        
        
    }
}
   
