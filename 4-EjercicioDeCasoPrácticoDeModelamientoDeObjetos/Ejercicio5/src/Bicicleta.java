public class Bicicleta  extends Vehiculo{

    private int nroVelocidades;

    public Bicicleta() {
    }

    public Bicicleta(int nroVelocidades) {
        this.nroVelocidades = nroVelocidades;
    }

    public Bicicleta(int nroPasajeros, boolean contieneTripulacion, int nroRuedas, String fechaMatriculacion, String medioDesplazamiento, int nroVelocidades) {
        super(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento);
        this.nroVelocidades = nroVelocidades;
    }

    public int getNroVelocidades() {
        return nroVelocidades;
    }

    public void setNroVelocidades(int nroVelocidades) {
        this.nroVelocidades = nroVelocidades;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "nroPasajeros=" + nroPasajeros +
                ", contieneTripulacion=" + contieneTripulacion +
                ", nroRuedas=" + nroRuedas +
                ", fechaMatriculacion='" + fechaMatriculacion + '\'' +
                ", medioDesplazamiento='" + medioDesplazamiento + '\'' +
                ", nroVelocidades=" + nroVelocidades +
                '}';
    }
}
