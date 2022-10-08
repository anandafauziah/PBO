package Inheritance;

/*
 *
 * @author Lenovo
 */
public class sub_class extends super_class{
    //atribut sub class
    private int tinggi;
    
    //cunstractor berprameter dari super dan sub class
    public sub_class (String nama, String keterangan, int tinggi){
        super(nama, keterangan);
        this.tinggi = tinggi;
    }
    
    //getter
    public int getTinggi() {
        return tinggi;
    }
    
    
    //custom method
    public void dataLengkap(){
        System.out.println(super.getNama() +" " + super.getKeterangan() + " " + getTinggi());
    }
    

    @Override
    public void cetak() {
        super.cetak(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    @Override
    public void halo() {
        super.halo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
