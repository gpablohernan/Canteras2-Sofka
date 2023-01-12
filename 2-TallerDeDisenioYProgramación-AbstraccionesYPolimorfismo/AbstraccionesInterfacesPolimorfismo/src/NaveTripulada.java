import java.util.Scanner;

public class NaveTripulada extends NaveEspacial {

    private double orbita; // en km

    public NaveTripulada() {
    }

    public NaveTripulada(double orbita) {
        this.orbita = orbita;
    }

    public NaveTripulada(String nombre, double peso, double altura, double empuje, double orbita) {
        super(nombre, peso, altura, empuje);
        this.orbita = orbita;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }

    @Override
    public String toString() {
        return "NaveTripulada{" +

                "nombre='" + nombre + '\'' +
                ", peso=" + peso + " toneladas" +
                ", altura=" + altura + " metros" +
                ", empuje=" + empuje + " toneladas" +
                ", orbita=" + orbita + " kilómetros" +
                '}';
    }

    @Override
    public String asignarTareaNave() {
        String tripulacion;

        System.out.println("Indique la cantidad de tripulación de la nave:");
        tripulacion=scanner.next();
        return tripulacion;
    }

    @Override
    public String asignarTareaTripulacion() {
        int opcion;
        String tareaTripulacion = "";
        do {
            System.out.println("Indique la tarea de la tripulación:");
            System.out.println("1 --- Reparación");
            System.out.println("2 --- Mantenimiento");
            System.out.println("3 --- Investigación");

            opcion=scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion){
            case 1:
                tareaTripulacion = "Reparación";
                break;
            case 2:
                tareaTripulacion = "Mantenimiento";
                break;
            case 3:
                tareaTripulacion = "Investigación";
                break;

        }
        return tareaTripulacion;
    }

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void crearNaveTripulada(){
        crearNaveEspacial();
        System.out.println("Ingrese la orbita (en kilómetros):");
        orbita = scanner.nextDouble();
    }
}
