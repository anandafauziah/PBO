/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance3;

public class Laptop extends Komputer {
  private int size, berat;

  //construc
    public Laptop(int size, int berat, String processor, String merk, String memory) {
        super(processor, merk, memory);
        this.size = size;
        this.berat = berat;
    }
  
  //getter

    public int getSize() {
        return size;
    }

    public int getBerat() {
        return berat;
    }

    
    
   
  public void  lihatSpec() { 
    System.out.println("============= DATA SPESIFIKASI LAPTOP ADALAH =============");
    System.out.println("Processor : " + super.getProcessor());
    System.out.println("Merk : " + super.getMerk());
    System.out.println("Memory (GB): " + super.getMemory());
    System.out.println("Size (Inch): " + getSize());
    System.out.println("Berat (Kg): " + getBerat());
    
  }
}