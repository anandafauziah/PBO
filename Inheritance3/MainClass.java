
package Inheritance3;
import java.io.*;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //deklarasi var 
//        String processor, merk, memory;
//        int size, berat;
        
        Laptop lap = new Laptop (0, 0, " ", " ", " "); 
        
        try{
            //input data
            System.out.print("isi size : ");
            int s  = Integer.parseInt(br.readLine());
            System.out.print("isi berat : ");
            int b = Integer.parseInt(br.readLine());
            System.out.print("isi prosesor : ");
            String p = br.readLine();
            System.out.print("isi merk : ");
            String m = br.readLine();
            System.out.print("isi memory: ");
            String me = br.readLine();
            
            
            //masukkan variable ke parameter objek
            lap = new Laptop (s,b, p, m, me);
            
            //cetak data lengkap 
            lap.lihatSpec();
            System.out.println();
            
            
        
        }catch (Exception e){
        
        }
    }
    
}
