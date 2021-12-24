package kata1_v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Mele13
 * 
 * Segunda versión de Kata1.
 * Calcula la edad de una persona a partir de su fecha de nacimiento.
 */
public class Kata1_v2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949, 9, 24);
        
        Person_v2 person = new Person_v2("Blas", date);
        System.out.println(person.getName() + "tiene " + person.getAge() 
                + " años");
    }    
}