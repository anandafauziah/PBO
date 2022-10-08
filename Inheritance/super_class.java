package Inheritance;

/**
 *
 * @author Lenovo
 */
public class super_class{
    //atributv
    private String nama, keterangan;
    
    //constructor

    public super_class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    //getter

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    //method
    
    public void cetak (){
        System.out.println(getNama() + " " + getKeterangan());
    }
    
    public void halo(){
     System.out.println("halo");
    }
}
