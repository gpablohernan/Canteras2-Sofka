import java.util.Scanner;

public class NaveNoTripulada extends NaveEspacial {

    private double orbita; // en km

    public NaveNoTripulada() {
    }

    public NaveNoTripulada(double orbita) {
        this.orbita = orbita;
    }

    public NaveNoTripulada(String nombre, double peso, double altura, double empuje, double orbita) {
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
        return "NaveNoTripulada{" +

                "nombre='" + nombre + '\'' +
                ", peso=" + peso + " toneladas" +
                ", altura=" + altura + " metros" +
                ", empuje=" + empuje + " toneladas" +
                ", orbita=" + orbita + " kilómetros" +
                '}';
    }

    @Override
    public String asignarTareaNave() {
        int opcion;
        String tarea = "";
        do {
            System.out.println("Indique la tarea que realizará la nave:");
            System.out.println("1 --- Abastecer a la EEI");
            System.out.println("2 --- Limpiar la EEI");
            System.out.println("3 --- Regular la elevación de la EEI");
            opcion=scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion){
            case 1:
                tarea = "Abastecer a la EEI";
                break;
            case 2:
                tarea = "Limpiar la EEI";
                break;
            case 3:
                tarea = "Regular la elevación de la EEI";
                break;
        }
        return tarea;
    }

    @Override
    public String asignarTareaTripulacion() {
        int opcion;
        String cuerpoCeleste = "";
        do {
            System.out.println("Indique el cuerpo celeste a estudiar:");
            System.out.println("1 --- Sol");
            System.out.println("2 --- Luna");
            System.out.println("3 --- Mercurio");
            System.out.println("4 --- Venus");
            System.out.println("5 --- Tierra");
            System.out.println("6 --- Marte");
            System.out.println("7 --- Ceres");
            System.out.println("8 --- Júpiter");
            System.out.println("9 --- Saturno");
            System.out.println("10 --- Neptuno");
            System.out.println("11 --- Urano");
            System.out.println("12 --- Plutón");
            System.out.println("13 --- Haumea");
            System.out.println("14 --- Makemake");
            System.out.println("15 --- Eris");
            System.out.println("16 --- Sedna");
            System.out.println("17 --- Phattie");

            opcion=scanner.nextInt();
        } while (opcion < 1 || opcion > 17);
        switch (opcion){
            case 1:
                cuerpoCeleste = "Sol";
                break;
            case 2:
                cuerpoCeleste = "Luna";
                break;
            case 3:
                cuerpoCeleste = "Mercurio";
                break;
            case 4:
                cuerpoCeleste = "Venus";
                break;
            case 5:
                cuerpoCeleste = "Tierra";
                break;
            case 6:
                cuerpoCeleste = "Marte";
                break;
            case 7:
                cuerpoCeleste = "Ceres";
                break;
            case 8:
                cuerpoCeleste = "Júpiter";
                break;
            case 9:
                cuerpoCeleste = "Saturno";
                break;
            case 10:
                cuerpoCeleste = "Neptuno";
                break;
            case 11:
                cuerpoCeleste = "Urano";
                break;
            case 12:
                cuerpoCeleste = "Plutón";
                break;
            case 13:
                cuerpoCeleste = "Haumea";
                break;
            case 14:
                cuerpoCeleste = "Makemake";
                break;
            case 15:
                cuerpoCeleste = "Eris";
                break;
            case 16:
                cuerpoCeleste = "Sedna";
                break;
            case 17:
                cuerpoCeleste = "Phattie";
                break;
        }
        return cuerpoCeleste;
    }

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void crearNaveNoTripulada(){
        crearNaveEspacial();
        System.out.println("Ingrese la orbita (en kilómetros):");
        orbita = scanner.nextDouble();
    }

}
