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
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int menu = 0;
        Linked link=new Linked();
           System.out.println("======= Selamat Datang Diklinik =======");
        while(menu!=4){
            System.out.print("1.Tambah Antri"
                    +        "\n2.Panggil Antrian"
                    +        "\n3.View Antrian"
                    +        "\n4.Exit\n  ");
            System.out.println("=====================================");
            System.out.print("Pilih Opsi : ");
            menu = in.nextInt();
            if(menu==1){
                link.tambahAntri();
            }
            else if(menu==2){
                link.panggilAntrian();
            }
            else if(menu==3){
                link.viewAntrian();
            }
            else if(menu==4){
                System.out.println("Klinik sudah tutup");
            }
            else{
                System.out.println("\t Salah Variable \t");
            }
            System.out.println("");
        }
    }
}
