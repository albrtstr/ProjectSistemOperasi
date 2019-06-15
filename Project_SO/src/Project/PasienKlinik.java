/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PasienKlinik {
    int number, usia;
    String nama,perlu;
    PasienKlinik next;
    Scanner in = new Scanner(System.in);
    Scanner str = new Scanner(System.in);
   
    public void input(){
        
        System.out.print("no Antri\t\t: ");
        number=in.nextInt();
        System.out.print("Masukkan nama\t\t: ");
        nama=str.nextLine();
        System.out.print("Masukkan usia\t\t: ");
        usia = in.nextInt();
        System.out.print("Masukkan Keluhan\t: ");
        perlu=str.nextLine();
        next=null;
        System.out.println("Antrian ditambah");
    }

    public void view(){
        System.out.println("|| "+number+" \t\t|| "+nama+" \t|| "+usia+" \t\t|| "+perlu+" \t||");
    }
}
