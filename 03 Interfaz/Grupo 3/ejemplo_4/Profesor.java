
package ejemplo_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ELI
 */
public class Profesor implements BuscarId{
     private int id;
     private String nombre;
     private String apellido;

    public Profesor() {
    }

    public Profesor(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

     @Override
    public String buscarNombre(int id) {
        if (this.id == id) {
            return this.nombre;
        }
        return null;
    }
  
    
    
     
}
