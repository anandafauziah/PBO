
package class_object1;


public class MainClass {


    public static void main(String[] args) {
        /*
        mengakses kelas Hewan, Ikan, Burung perlu membuat 
        object atau instance of class
        */
        
        //akses atribut dari hewan
        Hewan burung = new Hewan();
        Hewan ikan = new Hewan();
        
        //akses method buurng dan ikan
        Burung b = new Burung();
        Ikan i = new Ikan();
        
        //cara isi atribut
        burung.setTipe("kakatua");
        burung.setSuara("kuk.. kuk.. kuk..");
        burung.setUsia(1);
        
        ikan.setTipe("Lumba - Lumba");
        ikan.setSuara("blup.. blup.. blup..");
        ikan.setUsia(0);
        
        //cara ambil setter class hewan, ikan, burung
        System.out.println("aku " + burung.getTipe() + 
                " suaraku " + burung.getSuara() + " usiaku " + burung.getUsia()
                + ". ");
        b.terbang();
        
        System.out.println("aku " + ikan.getTipe() + 
                " suaraku " + ikan.getSuara() + " usiaku " + ikan.getUsia()
                + ". ");
        i.berenang();
    }
    
}
