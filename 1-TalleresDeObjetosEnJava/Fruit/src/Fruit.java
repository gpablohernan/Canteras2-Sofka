import java.util.ArrayList;

/**
 * Representa una fruta y sus atributos y métodos
 * @author Pablo Hernán Gatti
 */

public class Fruit {

    /**
     * nombre de la fruta
     */
    public String name;
    /**
     * peso promedio de la fruta
     */
    private float averageWeight;
    /**
     *  lista de colores de las frutas
     */
    ArrayList<String> colors;

    /**
     * Crea una instancia de la clase Fruit sin parámetros
     */
    public Fruit() {
    }
    /**
     * Crea una instancia de la clase Fruit con parámetros
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Agrega colores a la lista colors
     * @param colors lista de colores
     */

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Recoge la lista de colores
     * @return retorna la lista de colores
     */

    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Setea el promedio de peso de la fruta
     * @param averageWeight
     */

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Obtiene el peso promedio de la fruta
     * @return l peso promedio de la fruta
     */
    public float getAverageWeight() {
        return averageWeight;
    }
}