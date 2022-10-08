/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance3;

/**
 *
 * @author Lenovo
 */
public class Komputer {
  private String processor, merk, memory;
  
  //construc 

    public Komputer(String processor, String merk, String memory) {
        this.processor = processor;
        this.merk = merk;
        this.memory = memory;
    }
  
    //getter

    public String getProcessor() {
        return processor;
    }

    public String getMerk() {
        return merk;
    }

    public String getMemory() {
        return memory;
    }
    
    
    
}