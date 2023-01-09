/**
 * Representa un Vehículo y sus atributos y métodos
 * @author Pablo Hernán Gatti
 */

public class Vehicle {

    /**
     * Marca del vehículo
     */
    public String brand;
    /**
     * Modelo del vehículo
     */
    public String model;
    /**
     * cantidad de puertas del vehículo
     */
    public int doors;
    /**
     * Nombre del dueño del vehículo
     */
    private String Owner;

    /**
     * Crea una instancia de la clase Vehicle sin parámetros
     */
    public Vehicle() {
    }
    /**
     * Crea una instancia de la clase Vehicle con parámetros
     */
    public Vehicle(String brand, String model, int doors, String owner) {
        this.brand = brand;
        this.model = model;
        this.doors = doors;
        Owner = owner;
    }

    /**
     * Devuelve el nombre del dueño del vehículo
     * @return el nombre del dueño del vehículo
     */
    public String getOwner() {
        return Owner;
    }

    /**
     * Setea el nombre del dueño del vehículo
     * @param owner el dueño del vehiculo
     */
    public void setOwner(String owner) {
        Owner = owner;
    }
}

