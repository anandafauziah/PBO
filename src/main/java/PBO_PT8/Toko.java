/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_PT8; 

abstract public class Toko {
    //attribut
    public int hargaJual, hargaBeli;  
    
    //construc
    public Toko(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }
    
    
    //get
    public int getHargaJual() {
        return hargaJual;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }
    
    
    //abstract method 
    abstract public int hargaJual ();
}
