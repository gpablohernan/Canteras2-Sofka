public class Lancha extends Vehiculo{

    private int caballosDeFuerza;

    public Lancha() {
    }

    public Lancha(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public Lancha(int nroPasajeros, boolean contieneTripulacion, int nroRuedas, String fechaMatriculacion, String medioDesplazamiento, int caballosDeFuerza) {
        super(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento);
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    @Override
    public String toString() {
        return "Lancha{" +
                "nroPasajeros=" + nroPasajeros +
                ", contieneTripulacion=" + contieneTripulacion +
                ", nroRuedas=" + nroRuedas +
                ", fechaMatriculacion='" + fechaMatriculacion + '\'' +
                ", medioDesplazamiento='" + medioDesplazamiento + '\'' +
                ", caballosDeFuerza=" + caballosDeFuerza +
                '}';
    }
}
