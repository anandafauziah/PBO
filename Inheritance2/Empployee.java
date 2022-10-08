package Inheritance2;

public class Empployee extends Person {
    private String departemen, title;
    
     //construc
    public Empployee(String departemen, String title, String id, String name, String address) {
        super(id, name, address);
        this.departemen = "IT";
        this.title = title;
    }

    //getter
    public String getDepartemen() {
        return departemen;
    }

    public String getTitle() {
        return title;
    }
    
    public void getData (){
        System.out.println(super.getId() +" " + super.getName() + " " + super.getAddress() + " " + getDepartemen() + " " + getTitle());
    }
}
