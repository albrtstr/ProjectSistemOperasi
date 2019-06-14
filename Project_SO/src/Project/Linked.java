/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;

/**
 *
 * @author ASUS
 */
public class Linked {
    Klinik head;
    Klinik tail;
    public Linked(){
        head=null;
        tail=null;
    }
    
    public void antri(){
        Klinik baru=new Klinik();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    
    public void terpanggil(){
        if(head==null){
            System.out.println("=== Data Belum Ada ===");
        }
        else{
            System.out.println("Telah terpangil nomer antrian : "+head.number);
            head=head.next;
        }
    }
    public void view(){
        if(head==null){
            System.out.println("=== Data Belum Ada ===");
        }
        
        else{
            System.out.println("|| noAntrian \t|| Nama \t|| Usia \t|| Keperluan \t||");
            for(Klinik a=head; a!=null; a=a.next){
                a.view();
            }
        }
    }
}
