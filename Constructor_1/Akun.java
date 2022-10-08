/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor_1;

/**
 *
 * @author Lenovo
 */
public class Akun {
    //username  password
    private String username, password ;
    
    //constructor non parameter 
    public Akun(){
        //user admin sudah ditentukan username dan passwordnya 
        username = "admin";
        password = "admin";
    } 
    
    // constructor berparameter 
    public Akun(String u, String p){
        username = u;
        password = p;
    } 
    
    //setter
    public void setPassword(String password) {
        this.password = password;
    }

    
    //getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}
