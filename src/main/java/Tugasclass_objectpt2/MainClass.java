package Tugasclass_objectpt2;
import java.io.*;

public class MainClass {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (
        new InputStreamReader (System.in));
        
        Mahasiswa nanda = new Mahasiswa();
        Karyawan yoppy = new Karyawan();
        
        try{
            do{
                System.out.println("=== UNDIKA ===");
                System.out.println("|1| CEK SPP MAHASISWA");
                System.out.println("|2| CEK GAJI KARYAWAN");
                System.out.println("|3| KELUAR APLIKASI");
                System.out.print("PILIH MENU : ");
                int pilih = Integer.parseInt(br.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("-- INPUT DATA MAHASISWA --");
                        System.out.print("NIM :");
                        nanda.setNim(br.readLine());
                        System.out.print("Prodi :");
                        nanda.setProdi(br.readLine());
                        System.out.print("Angkatan :");
                        nanda.setAngkatan(Integer.parseInt(br.readLine()));
                        System.out.print("Semester :");
                        nanda.setSemester(Integer.parseInt(br.readLine()));
                        
                        System.out.print("SPP Mahasiswa : Rp: " + nanda.getSPP());
                        System.out.println(" ");
                        break;
                        
                        
                    case 2:
                        System.out.println("-- INPUT DATA KARYAWAN -- ");
                        System.out.print("NIK :");
                        yoppy.setNik(br.readLine());
                        System.out.print("Bagian :");
                        yoppy.setBagian(br.readLine());
                        System.out.print("Kehadiran :");
                        yoppy.setKehadiran(Integer.parseInt(br.readLine()));
                        System.out.print("gaji_per_hari :");
                        yoppy.setGaji_per_hari(Integer.parseInt(br.readLine()));
                        
                        
                        System.out.println("Total Gaji : Rp. " + yoppy.getGaji());
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
