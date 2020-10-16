/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan3.memasukkannilaidarikeyboard;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * Kelas        : IF-2 
 * NIM          : 10119077
 * Deskripsi    : Memasukkan Nilai dari Keyboard
 */
public class PBOIF210119077Latihan3MemasukkanNilaidariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan Nama Anda : ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah "+nama);
    }
    
}
