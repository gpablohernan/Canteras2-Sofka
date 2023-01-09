/**
 * Representa una PC y sus atributos y métodos
 * @author Pablo Hernán Gatti
 */

public class PC {
    /**
     * Procesador de la PC
     */
    public String processor;
    /**
     * Cantidad de memoria RAM de la PC
     */
    public int ramMemory;
    /**
     * Si es PC de escritorio o laptop
     */
    protected boolean isLaptop;
    /**
     * Tamaño del almacenamiento
     */
    public double storage;

    /**
     * Crea una instancia de la clase PC sin parámetros
     */
    public PC() {
    }
    /**
     * Crea una instancia de la clase PC Con parámetros
     */
    public PC(String processor, int ramMemory, boolean isLaptop, double storage) {
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.isLaptop = isLaptop;
        this.storage = storage;
    }

    /**
     * Retorna si la PC es de escritorio o laptop
     * @return si es laptop o no
     */
    public boolean isLaptop() {
        return isLaptop;
    }

    /**
     * Setea el valor del atributo laptop
     * @param laptop
     */
    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }
}
