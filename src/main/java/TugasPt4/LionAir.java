/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPt4;

/**
 *
 * @author Lenovo
 */
public class LionAir extends Tiket {
    int jumlahPenumpang, harga, total;
    String kotaTujuan, noPesawat, noKursi;

    public LionAir(int jumlahPenumpang, String kotaTujuan, String noPesawat, String noKursi, String booking, String nik, String nama, String  jenis_kelamin, String tglBerangkat, String  tglKembali, String kotaAsal) {
        super(booking, nik, nama, jenis_kelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jumlahPenumpang = jumlahPenumpang;
        //asal subaya
        if(kotaAsal.equalsIgnoreCase("Surabaya")){
        if(kotaTujuan.equalsIgnoreCase("Bali") || kotaTujuan.equalsIgnoreCase("Lombok")){
            this.harga = 500000;
            }
        if (kotaTujuan.equalsIgnoreCase("jakarta") || kotaTujuan.equalsIgnoreCase("yogyakarta")){
            this.harga = 600000;
            }
        if (kotaTujuan.equalsIgnoreCase("balikpapan") || kotaTujuan.equalsIgnoreCase("makassar")){
            this.harga = 700000;
            }
        }
        //asal jakarta
        if(kotaAsal.equalsIgnoreCase("jakarta")){
        if(kotaTujuan.equalsIgnoreCase("Bali") || kotaTujuan.equalsIgnoreCase("Lombok")){
            this.harga = 700000;
            }
        if (kotaTujuan.equalsIgnoreCase("jakarta") || kotaTujuan.equalsIgnoreCase("yogyakarta")){
            this.harga = 750000;
            }
        if (kotaTujuan.equalsIgnoreCase("balikpapan") || kotaTujuan.equalsIgnoreCase("makassar")){
            this.harga = 800000;
            }
        }
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
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
    
    public int getTotal(){
    total = getHarga()*getJumlahPenumpang();                   //SEMENTARA
    return total;
    }
    
    public void getData (){
        System.out.println("===================================");
        System.out.println("====  Preview Tiket LION AIR  =====");
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


























