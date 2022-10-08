package class_object2;
import java.io.*;

public class MainClass {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (
        new InputStreamReader (System.in));
        
        Handphone hp = new Handphone();
        Samsung samsung = new Samsung();
        
        try{
            do{
                System.out.println("===PBO CELL===");
                System.out.println("|1| ISI DATA HP");
                System.out.println("|2| BELI HP");
                System.out.println("|3| KELUAR APLIKASI");
                System.out.print("PILIH MENU : ");
                int pilih = Integer.parseInt(br.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("-- Isi data --");
                        System.out.print("Tipe :");
                        hp.setTipe(br.readLine());
                        System.out.print("Warna :");
                        hp.setWarna(br.readLine());
                        System.out.print("Kapasitas :");
                        hp.setKapasitas(br.readLine());
                        
                        System.out.print("Harga :");
                        samsung.setHarga(Integer.parseInt(br.readLine()));
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("-- Beli HP -- ");
                        System.out.print("Jumlah Beli :");
                        samsung.setJumlah(Integer.parseInt(br.readLine()));
                        System.out.println("Total bayar : Rp. " + samsung.getBeli());
                        System.out.println(" ");
                        
                        break;
                    case 3:
                        System.exit(0);
                        break;
                        
                }
            }while(true);
            
            
        }catch (Exception e){
            System.out.println("Inputan anda salah / bukan angka");
        }
        
        
    }
    
}
