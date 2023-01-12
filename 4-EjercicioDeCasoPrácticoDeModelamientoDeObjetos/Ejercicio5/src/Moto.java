public class Moto extends Vehiculo{

    private int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(int nroPasajeros, boolean contieneTripulacion, int nroRuedas, String fechaMatriculacion, String medioDesplazamiento, int cilindrada) {
        super(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nroPasajeros=" + nroPasajeros +
                ", contieneTripulacion=" + contieneTripulacion +
                ", nroRuedas=" + nroRuedas +
                ", fechaMatriculacion='" + fechaMatriculacion + '\'' +
                ", medioDesplazamiento='" + medioDesplazamiento + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
