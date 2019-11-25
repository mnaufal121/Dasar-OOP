/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kegiatan3;

import Modul3.Karnivora;

/**
 *
 * @author Asus
 */
public class Harimau extends Karnivora{
    public int mata;
    
    public void pesan(){
        super.pesan();
        System.out.println("Harimau Berasal dari Indonesia");
    }

    public int getMata() {
        return mata;
    }

    public void setMata(int mata) {
        this.mata = mata;
    }
    
    public void tampillayar(){
        Harimau ha = new Harimau();
        ha.setMata(2);
        System.out.println("Jumlah Mata = "+ha.getMata());
    }
        
    }


