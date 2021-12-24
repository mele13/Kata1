package kata1_v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Mele13
 * 
 * Primera versión de Kata1. 
 * Calcula la edad de una persona a partir de su fecha de nacimiento.
 */
public class Person_v2 {
    private final String name;
    private final Calendar birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    /**
     * Constructor que recibe dos parámetros: una string con el nombre de una 
     * persona, y un date con su fecha de nacimiento.
     * 
     * @param name representa el nombre de una persona
     * @param birthdate representa la fecha de nacimiento de una persona
     */
    public Person_v2(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    /**
     * Método que devuelve el nombre de una persona.
     * 
     * @return nombre de una persona
     */
    public String getName() {
        return name;
    }
    
    /**
     * Método que devuelve la fecha de nacimiento de una persona.
     * 
     * @return fecha de nacimiento de una persona
     */
    public Calendar getBirthdate() {
        return birthdate;
    }
    
    /**
     * Método que devuelve un entero con la edad calculada de una persona en 
     * milisegundos. 
     * 
     * @return edad de una persona
     */
    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() - 
                birthdate.getTimeInMillis()));
    }
    
    /**
     * Método que convierte milisegundos en años.
     * 
     * @return año en milisegundos
     */
    private long milliSecondsToYear(long milles) {
        return milles / MILLISECONDS_PER_YEAR;
    }
}