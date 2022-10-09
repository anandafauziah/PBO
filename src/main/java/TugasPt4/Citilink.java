/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPt4;

/**
 *
 * @author Lenovo
 */
public class Citilink extends Tiket {
    int jumlahPenumpang, total, harga;
    String kotaTujuan, noPesawat, noKursi;

    public Citilink(int jumlahPenumpang, String kotaTujuan, String noPesawat, String noKursi, String booking, String nik, String nama, String  jenis_kelamin, String tglBerangkat, String  tglKembali, String kotaAsal) {
        super(booking, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jumlahPenumpang = jumlahPenumpang;
         //asal subaya
        if(kotaAsal.equalsIgnoreCase("Surabaya")){
        if(kotaTujuan.equalsIgnoreCase("Bali") || kotaTujuan.equalsIgnoreCase("Lombok")){
            this.harga = 700000;
            }
        if (kotaTujuan.equalsIgnoreCase("jakarta") || kotaTujuan.equalsIgnoreCase("yogyakarta")){
            this.harga = 800000;
            }
        if (kotaTujuan.equalsIgnoreCase("balikpapan") || kotaTujuan.equalsIgnoreCase("makassar")){
            this.harga = 8500000;
            }
        }
        //asal jakarta
        if(kotaAsal.equalsIgnoreCase("jakarta")){
        if(kotaTujuan.equalsIgnoreCase("Bali") || kotaTujuan.equalsIgnoreCase("Lombok")){
            this.harga = 1000000;
            }
        if (kotaTujuan.equalsIgnoreCase("jakarta") || kotaTujuan.equalsIgnoreCase("yogyakarta")){
            this.harga = 750000;
            }
        if (kotaTujuan.equalsIgnoreCase("balikpapan") || kotaTujuan.equalsIgnoreCase("makassar")){
            this.harga = 900000;
            }
        }
        this.total = total;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public int getTotal() {
        total = getHarga()*getJumlahPenumpang(); 
        return total;
    }

    public int getHarga() {
        
        return harga;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }
    
    public void getData (){
        System.out.println("===================================");
        System.out.println("=====  Preview Tiket CITILINK  ====");
        System.out.println("===================================");
        System.out.println("Booking ID : " + super.getBooking());
        System.out.println("NIK : " + super.getNik());
        System.out.println("Nama : " + super.getNama());
        System.out.println("Kota Asal : " + super.getKotaAsal());
        System.out.println("Kota Tujuan : " + getKotaTujuan());
        System.out.println("Tanggal Berangkat : " + super.getTglBerangkat());
        System.out.println("Tanggal Kembali : " + super.getTglKembali());
        System.out.println("Nomor Pesawat : " + getNoPesawat());
        System.out.println("Nomor Kursi : " + getNoKursi());
        System.out.println("Harga Tiket : " + getHarga());
        System.out.println(" ");
        
    }
    
}
