package kata1_v1;

import java.util.Date;

/**
 * @author Mele13
 * 
 * Primera versión de Kata1. 
 * Calcula la edad de una persona a partir de su fecha de nacimiento.
 */
public class Person_v1 {
    private final String name;
    private final Date birthdate;
    
    /**
     * Constructor que recibe dos parámetros: una string con el nombre de una 
     * persona, y un date con su fecha de nacimiento.
     * 
     * @param name representa el nombre de una persona
     * @param birthdate representa la fecha de nacimiento de una persona
     */
    public Person_v1(String name, Date birthdate) {
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
    public Date getBirthdate() {
        return birthdate;
    }
    
    /**
     * Método que devuelve un entero con la edad calculada de una persona.
     * El cálculo se hace a través de la diferencia entre la fecha actual y la
     * de nacimiento. La edad se devuelve en milisegundos.
     * 
     * >1 año = 365 días || 1 día = 24 horas || 1 hora = 60 minutos 
     * >1 minuto = 60 segundos || 1 segundo = 1000 milisegundos
     * >1 año = 365*24*60*60*1000 = 31.536.000.000 milisegundos
     * 
     * @return edad de una persona
     */
    public int getAge() {
        return (int) ((new Date().getTime() - birthdate.getTime()) / 31536000000L);
    }
}