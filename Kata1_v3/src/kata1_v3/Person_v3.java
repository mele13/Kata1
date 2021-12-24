package kata1_v3;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Mele13
 * 
 * Primera versión de Kata1. 
 * Calcula la edad de una persona a partir de su fecha de nacimiento.
 */
public class Person_v3 {
    private final String name;
    private final LocalDate birthdate;
    
    /**
     * Constructor que recibe dos parámetros: una string con el nombre de una 
     * persona, y un date con su fecha de nacimiento.
     * 
     * @param name representa el nombre de una persona
     * @param birthdate representa la fecha de nacimiento de una persona
     */
    public Person_v3(String name, LocalDate birthdate) {
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
    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    /**
     * Método que devuelve un entero con la edad de una persona
     * 
     * @return edad de una persona
     */
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(birthdate, today).getYears();
    }   
}