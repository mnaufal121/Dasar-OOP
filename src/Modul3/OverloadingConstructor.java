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
public class OverloadingConstructor {
    int a;
    int b;
    double c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void kali (){
        System.out.println("Hasil = ");
    }
    public void kali(int a, int b){
        System.out.println("Hasil = "+(a*b));
    }
    public void kali (int a, double c){
        System.out.println("Hasil = "+(a*c));
    }
    
    public void panggil(){
        OverloadingConstructor oc = new OverloadingConstructor();
        oc.kali();
        oc.kali(2, 5);
        oc.kali(2, 3);
    }
}
