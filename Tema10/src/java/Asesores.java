
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Asesores {
 
    private List<User> asesores = new ArrayList<User>();

    public List<User> getAsesores() {
        return asesores;
    }

    public void setAsesores(List<User> asesores) {
        this.asesores = asesores;
    }

    public Asesores() {
        asesores.add(new User("asesor1","1234","admin"));
        asesores.add(new User("asesor2","1234","admin"));
        asesores.add(new User("asesor3","1234","admin"));
    }

    
    
}
