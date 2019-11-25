/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

import Kegiatan3.Harimau;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[]args){
        OverloadingConstructor ov = new OverloadingConstructor();
        ov.panggil();
        
        Karnivora ra = new Karnivora();
        ra.tampilprofil();
        
        Harimau au = new Harimau();
        au.tampillayar();
        au.pesan();
        
    }
}
