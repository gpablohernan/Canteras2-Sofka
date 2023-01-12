import java.util.ArrayList;
import java.util.Scanner;

public abstract class NaveEspacial {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected double peso; // en toneladas
    protected double altura; // en metros
    protected double empuje; // en toneladas

    public NaveEspacial() {
    }

    public NaveEspacial(String nombre, double peso, double altura, double empuje) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.empuje = empuje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getEmpuje() {
        return empuje;
    }

    public void setEmpuje(double empuje) {
        this.empuje = empuje;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso + " toneladas" +
                ", altura=" + altura + " metros" +
                ", empuje=" + empuje + " toneladas" +
                '}';
    }

    public void crearNaveEspacial() {
        System.out.println("Ingrese nombre de la nave:");
        nombre = scanner.next();
        System.out.println("Ingrese el peso (en toneladas):");
        peso = scanner.nextDouble();
        System.out.println("Ingrese la altura (en metros):");
        altura = scanner.nextDouble();
        System.out.println("Ingrese el empuje (en toneladas):");
        empuje = scanner.nextDouble();

    }

    public String elegirNaveEspacial(ArrayList<NaveEspacial> navesEspaciales, String tipoNave) {
        String nombre;
        NaveEspacial busqueda;
        for (NaveEspacial naves : navesEspaciales) {
            if (naves.getClass().getName().equalsIgnoreCase(tipoNave)) {
                System.out.println(naves);
            }
        }
        System.out.println("Ingrese el nombre de la nave:");
        nombre = scanner.next();

        busqueda = navesEspaciales.stream().filter(naveEspacial -> naveEspacial.getNombre().equalsIgnoreCase(nombre)).findFirst().orElse(null);

        if (busqueda == null) {
            System.out.println("La nave no fue encontrada");
            return "no encontrado";

        } else return busqueda.getNombre();
    }

    public abstract String asignarTareaNave();
    public abstract String asignarTareaTripulacion();
}
