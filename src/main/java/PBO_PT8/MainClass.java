package PBO_PT8;
import java.io.*;
public class MainClass {
 
    public static void main(String[] args)throws Exception {
       BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
       int hb = 0;
       //instance 
       
       //input 
       System.out.print("Masukan nama barang [Fanta/Mizone]: ");
       String input = br.readLine();
       
       //proses + output
        if (input.equalsIgnoreCase("Fanta")) {
            System.out.print("Masukan harga beli (Rp) \t: " );
            hb = Integer.parseInt(br.readLine());
            Toko f = new Fanta(hb);
            System.out.print("Harga jual adalah (Rp) \t: " + f.hargaJual());
            
        }else if (input.equalsIgnoreCase("Mizone")){ 
            System.out.print("Masukan harga beli (Rp) \t: " );
            hb = Integer.parseInt(br.readLine());
            Toko m = new Mizone(hb);
            System.out.print("Harga jual adalah (Rp) \t: " + m.hargaJual());
        }else{
            System.out.print("Barang tidak tersedia " );
        }
       
       
    }
    
}
