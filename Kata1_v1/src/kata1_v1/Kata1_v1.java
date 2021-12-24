package kata1_v1;

import java.util.Date;

/**
 * @author Mele13
 * 
 * Primera versión de Kata1.
 * Calcula la edad de una persona a partir de su fecha de nacimiento.
 */
public class Kata1_v1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Person_v1 person = new Person_v1("Blas", new Date(49, 8, 24));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }    
}