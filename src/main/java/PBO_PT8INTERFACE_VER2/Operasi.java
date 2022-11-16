package PBO_PT8INTERFACE_VER2;


public class Operasi implements Store {
    //deklarasi 
    private String nmBarang;
    private int pilihan =0;
    private double hj, banyak, diskon, total, subtotal; 
    
    //constructor 
    Operasi (){
	
	}
    
    public Operasi(int pilihan, double banyak) {
        this.pilihan = pilihan;
        this.banyak = banyak;
        if(pilihan == 1){
            this.nmBarang = "COCA - COLA";
            this.hj = 10000;
        }else if(pilihan == 2){
            this.nmBarang = "FANTA";
            this.hj = 30000;
        }else if(pilihan == 3){
            this.nmBarang = "MIZONE";
            this.hj = 40000;
        }else if(pilihan == 4){
            this.nmBarang = "ISO PLUS";
            this.hj = 50000;
        } 
        //this.diskon = diskon;
        //this.total = total;
        //this.subtotal = subtotal;
    }
    
    //GETTER
    public String getNmBarang() {
        return nmBarang;
    }

    public int getPilihan() {
        return pilihan;
    }

    public double getHj() {
        return hj;
    }

    public double getBanyak() {
        return banyak;
    }

    public double getDiskon() {
        return diskon;
    }

    public double getTotal() {
        return total;
    }

    public double getSubtotal() {
        return subtotal;
    }
    
    //METHOD

    @Override
    public double subtotal() {
        return hj*banyak;
    }

    @Override
    public double diskon() {
        return subtotal() * 0.1;
    }

    @Override
    public double total() {
        return subtotal() - diskon();
    }
    
    
    


    
    
    
}
