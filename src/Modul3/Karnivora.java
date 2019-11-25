package Modul3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Karnivora {
    protected String nama;
    private String asal;
    public int kaki;
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public int getkaki(){
        return kaki;
    }
    
    public void setkaki(int kaki){
        this.kaki = kaki;
    }
    
    public String getasal(){
        return asal;
    }
    
    public void setasal(String asal){
        this.asal = asal;
    }
    public void pesan(){
        Karnivora kar = new Karnivora();
        kar.setasal("Hewan Berasal Mana Saja");
        System.out.println(" "+kar.getasal());
    }
    
    public void hewan(String nama, String asal, int kaki){
        this.asal = asal;
        this.nama = nama;
        this.kaki = kaki;
    }
    
   public void tampilprofil(){
       Karnivora ka = new Karnivora();
       ka.setnama("Harimau");
       ka.setasal("Sumatera");
       ka.setkaki(4);
       System.out.println("Hewan = "+ka.getnama());
       System.out.println("Asal = "+ka.getasal());
       System.out.println("Jumlah Kaki = "+ka.getkaki());
   }
}
