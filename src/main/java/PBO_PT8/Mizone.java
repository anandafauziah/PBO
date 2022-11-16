
package PBO_PT8;
 
public class Mizone extends Toko{

    public Mizone(int hargaBeli) {
        super(hargaBeli);
    }

    @Override
    public int hargaJual() {
         return hargaBeli + (hargaBeli * 20/100);
    }
    
    
}
