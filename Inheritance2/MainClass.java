package Inheritance2;
import java.io.*;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        
        //object : employee
//        Empployee emp[] = new Empployee [2];
        
        //deklarasi var
        String id, name, address, tittle;
        
        try{
            //jmlh array ditentukan user 
            //1. entry jumlah 
            System.out.print("Masukkan Jumlah Array : ");
            int jumlah = Integer.parseInt(br.readLine());
            
            //2. buat object 
            Empployee emp[] = new Empployee [jumlah];
            
            //input 
            for(int i = 0 ; i < emp.length ; i++){
                System.out.print("Entry ID : ");
                id = br.readLine();
                System.out.print("Entry Name : ");
                name = br.readLine();
                System.out.print("Entry Address : ");
                address = br.readLine();
                System.out.print("Entry Title : ");
                tittle = br.readLine();
                
                System.out.print("\n ");
                //masukkan object 
                emp[i] = new Empployee (" ", tittle, id, name, address);
                
            }
            
            //output 
            for(int i = 0 ; i < emp.length ; i++){
                //cetak method get data dari kelas data employee
                emp [i].getData();
            }
            
        }catch (Exception e){
        
        }
    
    }
    
}
