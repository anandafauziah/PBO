
package PBO_PT8;

public class Fanta extends Toko { 

    public Fanta(int hargaBeli) {
        super(hargaBeli);
    }

    @Override
    public int hargaJual() {
        return hargaBeli + (hargaBeli * 10/100);
    }
    
}
