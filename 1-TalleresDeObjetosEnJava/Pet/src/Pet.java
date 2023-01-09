/**
 * Representa una mascota y sus atributos y métodos
 * @author Pablo Hernán Gatti
 */

public class Pet {
    /**
     * Nombre de la mascota
     */
    public String name;
    /**
     * Raza de la mascota
     */
    public String breed;
    /**
     * Color de la mascota
     */
    public String color;
    /**
     * Peso de la mascota
     */
    protected float weight;
    /**
     * Dueño de la mascota
     */
    private String Owner;
    /**
     * Crea una instancia de la Pet sin parámetros
     */
    public Pet() {
    }
    /**
     * Crea una instancia de la clase Pet Con parámetros
     */
    public Pet(String name, String breed, String color, float weight, String owner) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        Owner = owner;
    }

    /**
     * Devuelve el nombre del dueño de la mascota
     * @return el nombre del dueño de la mascota
     */
    public String getOwner() {
        return Owner;
    }

    /**
     * Setea el nombre del dueño de la mascota
     * @param owner nombre del dueño de la mascota
     */
    public void setOwner(String owner) {
        Owner = owner;
    }
}
