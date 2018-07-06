/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;
import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;
/**
 *
 * @author rperez
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaJDBC personaJDBC = new PersonaJDBC();
        //personaJDBC.insert("Juan", "De la Sierra");
        //personaJDBC.update(1, "Mijis", "Locote");
        //personaJDBC.delete(1);
        
        List<Persona> personas = personaJDBC.select();
        for (Persona persona : personas) {
            System.out.println("" + persona.toString());
            System.out.println("--------------------------------------");
        }
        
    }
    
}
