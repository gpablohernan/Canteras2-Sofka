import java.util.Date;

/**
 * Representa una persona y sus atributos y métodos
 * @author Pablo Hernán Gatti
 */

public class Person {

    /**
     * Nombre de la persona
     */
    public String name;
    /**
     * Primer apellido de la persona
     */
    public String lastName1;
    /**
     * Segundo apellido de la persona
     */
    public String LastName2;
    /**
     * Fecha de nacimiento de la persona
     */
    public Date dateBirth;
    /**
     * Altura de la persona
     */
    public float height;

    /**
     * Crea una instancia de la clase Person sin parámetros
     */
    public Person() {
    }
    /**
     * Crea una instancia de la clase Person con parámetros
     */
    public Person(String name, String lastName1, String getLastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.LastName2 = getLastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Setea el nombre de la persona
     * @param name nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el nombre de la persona
     * @return el nombre de la persona
     */
    public String getName() {
        return name;
    }
}