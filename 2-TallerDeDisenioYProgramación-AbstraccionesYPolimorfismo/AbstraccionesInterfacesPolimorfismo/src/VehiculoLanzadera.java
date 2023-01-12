import java.util.Scanner;

public class VehiculoLanzadera extends NaveEspacial {

    private double carga; // en toneladas
    private double potencia; // en caballos

    public VehiculoLanzadera() {
    }

    public VehiculoLanzadera(double carga, double potencia) {
        this.carga = carga;
        this.potencia = potencia;
    }

    public VehiculoLanzadera(String nombre, double peso, double altura, double empuje, double carga, double potencia) {
        super(nombre, peso, altura, empuje);
        this.carga = carga;
        this.potencia = potencia;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "VehiculoLanzadera{" +

                "nombre='" + nombre + '\'' +
                ", peso=" + peso + " toneladas" +
                ", altura=" + altura + " metros" +
                ", empuje=" + empuje + " toneladas" +
                ", carga=" + carga + " kilómetros" +
                ", potencia=" + potencia + " caballos" +
                '}';
    }

    @Override
    public String asignarTareaNave() {
        int opcion;
        String cargaUtil = "";
        do {
            System.out.println("Indique la carga que llevará la nave:");
            System.out.println("1 --- Satélite Artificial");
            System.out.println("2 --- Sonda");
            System.out.println("3 --- Nave Tripulada");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion) {
            case 1:
                cargaUtil = "Satélite Artificial";
                break;
            case 2:
                cargaUtil = "Sonda";
                break;
            case 3:
                cargaUtil = "Nave Tripulada";
                break;
        }
        return cargaUtil;
    }

    @Override
    public String asignarTareaTripulacion() {
        int opcion;
        String combustible = "";
        do {
            System.out.println("Indique el combustible que cargará la nave:");
            System.out.println("1 --- Químico sólido");
            System.out.println("2 --- Propelente líquido");
            System.out.println("3 --- Químico sólido y Propelente líquido");
            opcion = scanner.nextInt();
        } while (opcion < 1 || opcion > 3);
        switch (opcion) {
            case 1:
                combustible = "Químico sólido";
                break;
            case 2:
                combustible = "Propelente líquido";
                break;
            case 3:
                combustible = "Químico sólido y Propelente líquido";
                break;
        }
        return combustible;
    }

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public void crearVehiculoLanzadera() {
        crearNaveEspacial();
        System.out.println("Ingrese la carga (en toneladas):");
        carga = scanner.nextDouble();
        System.out.println("Ingrese la potencia (en caballos):");
        potencia = scanner.nextDouble();
    }
}
