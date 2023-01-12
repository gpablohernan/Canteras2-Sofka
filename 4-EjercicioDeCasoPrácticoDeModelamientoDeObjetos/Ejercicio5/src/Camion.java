public class Camion extends Vehiculo{

    private double altura;

    public Camion() {
    }

    public Camion(double altura) {
        this.altura = altura;
    }

    public Camion(int nroPasajeros, boolean contieneTripulacion, int nroRuedas, String fechaMatriculacion, String medioDesplazamiento, double altura) {
        super(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "nroPasajeros=" + nroPasajeros +
                ", contieneTripulacion=" + contieneTripulacion +
                ", nroRuedas=" + nroRuedas +
                ", fechaMatriculacion='" + fechaMatriculacion + '\'' +
                ", medioDesplazamiento='" + medioDesplazamiento + '\'' +
                ", altura=" + altura +
                '}';
    }
}
