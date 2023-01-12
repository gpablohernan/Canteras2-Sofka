public class Planeta {

    private int id;
    private String nombre;
    private double masa;
    private double densidad;
    private double diametro;
    private long distanciaAlSol;

    public Planeta() {
    }

    public Planeta(int id, String nombre, double masa, double densidad, double diametro, long distanciaAlSol) {
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(long masa) {
        this.masa = masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(long distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", densidad=" + densidad +
                ", diametro=" + diametro +
                ", distanciaAlSol=" + distanciaAlSol +
                '}';
    }
}
