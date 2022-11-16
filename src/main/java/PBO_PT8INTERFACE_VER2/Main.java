
package PBO_PT8INTERFACE_VER2;

import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        //instance
	Operasi op = new Operasi ();
        
        //banner
        System.out.println("========== TOKO MINUMAN ===========");
        System.out.println("1. COCA - COLA");
        System.out.println("2. FANTA");
        System.out.println("3. MIZONE");
        System.out.println("4. ISO PLUS");
        System.out.print("MASUKKAN PILIHAN [1/2/3/4] : ");
        int pilihan= Integer.parseInt(br.readLine());
        System.out.print("MASUKKAN JUMLAH BELI : ");
        double banyak= Double.parseDouble(br.readLine());
        op = new Operasi(pilihan, banyak);
         
        //proses + output
        System.out.println("\n=============== NOTA PEMBELIAN ===============");
        System.out.println("NAMA BARANG \t: " + op.getNmBarang());
        System.out.println("HARGA BARANG \t: " + op.getHj());
        System.out.println("JUMLAH BELI \t: " + op.getBanyak());
        System.out.println("SUB TOTAL \t: " + op.subtotal());
        System.out.println("DISKON (10%) \t: " + op.diskon());
        System.out.println("----------------------------------------------");
        System.out.println("TOTAL (Rp) \t: " + op.total());
        System.out.println("==============================================");
    }
    
}
