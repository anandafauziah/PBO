package Constructor_1;
import java.io.*;
/**
 *
 * @author Lenovo
 */
public class MainClass {
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //instance (buat objek)
        //1. admin
        //2. akun baru 
        
        Akun admin = new Akun();
        Akun akunBaru = new Akun("", "");
        
        //variable
        String username, password, temp;
        
        //menu 
        do{
                System.out.println("=== log in ===");
                System.out.println("|1| LOGIN ADMIN");
                System.out.println("|2| BUAT AKUN BARU");
                System.out.println("|3| LIHAT AKUN");
                System.out.println("|4| UBAH PASSWORD");
                System.out.println("|5| KELUAR");
                System.out.print("PILIH MENU : ");   
                int menu = Integer.parseInt(br.readLine());
                switch (menu){
                    case 1:
                        System.out.println("|1| LOGIN ADMIN");
                        System.out.print("masukkan username : ");
                        username = br.readLine();
                        System.out.print("masukkan password : ");
                        password = br.readLine();
                        
                        //mencocokkan username 
                        if (username.equalsIgnoreCase(admin.getUsername())
                                && password.equals(admin.getPassword()))
                                {
                            System.out.println("Sukses");
                        }else{
                            System.err.println("Gagal!");
                        }     
                        break;
                        
                    case 2:
                        System.out.println("|2| BUAT AKUN BARU");
                        System.out.print("masukkan username : ");
                        username = br.readLine();
                        System.out.print("masukkan password : ");
                        password = br.readLine();
                        
                        //masukkan variable kedala constructor
                        akunBaru = new Akun(username, password);
                        System.out.println("  ");
                        break;
                        
                    case 3:
                        System.out.println("|3| LIHAT AKUN");
                        System.out.println("1. admin");
                        System.out.println("username : " + admin.getUsername());
                        System.out.println("password : " + admin.getPassword());
                        System.out.println("  ");
                        System.out.println("2. akun baru");
                        System.out.println("username : " + akunBaru.getUsername());
                        System.out.println("password : " + akunBaru.getPassword() + "\n");
                        break;
                        
                    case 4:
                        System.out.println("|4| UBAH PASSWORD");
                        //masukkan pass lama 
                        System.out.print("masukkan password lama : ");
                        password = br.readLine();
                        System.out.print("masukkan password baru : ");
                        temp = br.readLine();
                        
                        //mencocokkan password  
                        if (password.equalsIgnoreCase(akunBaru.getPassword()))
                                {
                            akunBaru.setPassword(temp);
                            System.out.println("password telah diubah");
                        }else{
                            System.err.println("password tidak sesuai!");
                        }     
                        break;
                        
                    case 5:
                        System.exit(0);
                        break;
        }
        }while (true);
        
    }
    
}
