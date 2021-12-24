package kata1_v3;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Mele13
 * 
 * Tercera versión de Kata1.
 * Calcula la edad de una persona a partir de su fecha de nacimiento.
 */
public class Kata1_v3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1949, Month.SEPTEMBER, 24);
        Person_v3 person = new Person_v3("Blas", date);
                
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");        
    }    
}