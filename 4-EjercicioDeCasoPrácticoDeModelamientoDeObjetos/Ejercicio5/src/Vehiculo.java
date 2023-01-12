public class Vehiculo {

   protected int nroPasajeros;
   protected boolean contieneTripulacion;
   protected int nroRuedas;
   protected String fechaMatriculacion;
   protected String medioDesplazamiento;

    public Vehiculo() {
    }

    public Vehiculo(int nroPasajeros, boolean contieneTripulacion, int nroRuedas, String fechaMatriculacion, String medioDesplazamiento) {
        this.nroPasajeros = nroPasajeros;
        this.contieneTripulacion = contieneTripulacion;
        this.nroRuedas = nroRuedas;
        this.fechaMatriculacion = fechaMatriculacion;
        this.medioDesplazamiento = medioDesplazamiento;
    }

    public int getNroPasajeros() {
        return nroPasajeros;
    }

    public void setNroPasajeros(int nroPasajeros) {
        this.nroPasajeros = nroPasajeros;
    }

    public boolean isContieneTripulacion() {
        return contieneTripulacion;
    }

    public void setContieneTripulacion(boolean contieneTripulacion) {
        this.contieneTripulacion = contieneTripulacion;
    }

    public int getNroRuedas() {
        return nroRuedas;
    }

    public void setNroRuedas(int nroRuedas) {
        this.nroRuedas = nroRuedas;
    }

    public String getfechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setfechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getMedioDesplazamiento() {
        return medioDesplazamiento;
    }

    public void setMedioDesplazamiento(String medioDesplazamiento) {
        this.medioDesplazamiento = medioDesplazamiento;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "nroPasajeros=" + nroPasajeros +
                ", contieneTripulacion=" + contieneTripulacion +
                ", nroRuedas=" + nroRuedas +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", medioDesplazamiento=" + medioDesplazamiento +
                '}';
    }
}
