package Inheritance;
import java.io.*;

/**
 *
 * @author Lenovo
 */
public class MinClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        // TODO code application logic here
        sub_class sub = new sub_class (" ", " ", 0);
        
        try{
            //input data
            System.out.print("isi nama : ");
            String n = br.readLine();
            System.out.print("isi keetrangan : ");
            String k = br.readLine();
            System.out.print("isi tinggi : ");
            int t = Integer.parseInt(br.readLine());
            
            //masukkan variable ke parameter objek
            sub = new sub_class (n,k, t);
            
            //cetak data lengkap 
            sub.dataLengkap();
            
            //panggil 
            sub.cetak();
            sub.halo();
            
            System.out.println();
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
}
