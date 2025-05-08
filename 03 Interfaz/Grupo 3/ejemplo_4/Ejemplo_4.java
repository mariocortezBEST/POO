
package ejemplo_4;

/**
 *
 * @author ELI
 */
public class Ejemplo_4 {

    public static void main(String[] args) {
        
        
        BuscarId Alumno = new Alumno(1, "Eliana", "Specogna");
        Alumno.buscarNombre(1);
        System.out.println("--- Alumno ---");
        System.out.println("ID: " + ((Alumno) Alumno).getId());
        System.out.println("Nombre: " + ((Alumno) Alumno).getNombre());
        System.out.println("Apellido: " + ((Alumno) Alumno).getApellido());

        BuscarId Profesor = new Profesor(8, "René", "Rosales");
        Profesor.buscarNombre(8);
        System.out.println("--- Profesor ---");
        System.out.println("ID: " + ((Profesor) Profesor).getId()); 
        System.out.println("Nombre: " + ((Profesor) Profesor).getNombre()); 
        System.out.println("Apellido: " + ((Profesor) Profesor).getApellido());

    }

       
    
        
}

  
         
         
        
       
    
    

