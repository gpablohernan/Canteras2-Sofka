public class Coche extends Vehiculo{

    private int nroPuertas;

    public Coche() {
    }

    public Coche(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    public Coche(int nroPasajeros, boolean contieneTripulacion, int nroRuedas, String fechaMatriculacion, String medioDesplazamiento, int nroPuertas) {
        super(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento);
        this.nroPuertas = nroPuertas;
    }

    public int isNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nroPasajeros=" + nroPasajeros +
                ", contieneTripulacion=" + contieneTripulacion +
                ", nroRuedas=" + nroRuedas +
                ", fechaMatriculacion='" + fechaMatriculacion + '\'' +
                ", medioDesplazamiento='" + medioDesplazamiento + '\'' +
                ", nroPuertas=" + nroPuertas +
                '}';
    }
}
