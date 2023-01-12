import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        String opcion;
        String desplazamiento;

        for (int i = 1; i<11; i++)
        {
            Vehiculo vehiculo = new Vehiculo();
            System.out.println("Ingrese los datos del vehículo número " + i + ":");
            System.out.println("Número de pasajeros:");
            vehiculo.setNroPasajeros(scanner.nextInt());
            do {
                System.out.println("Contiene tripulación? (S/N)");
                opcion = scanner.next().toUpperCase();
            } while (!opcion.equals("S") && !opcion.equals("N"));
            if (opcion.equals("S")){
                vehiculo.setContieneTripulacion(true);
            } else {
                vehiculo.setContieneTripulacion(false);
            }
            System.out.println("Fecha de matriculación: (dd/mm/aaaa)");
            vehiculo.setfechaMatriculacion(scanner.next().toLowerCase());
            System.out.println("Número de ruedas:");
            vehiculo.setNroRuedas(scanner.nextInt());
            do {
                System.out.println("Medio de desplazamiento: (aire, agua, tierra)");
                desplazamiento = scanner.next().toLowerCase();

            } while (!desplazamiento.equals("aire") && !desplazamiento.equals("agua") && !desplazamiento.equals("tierra"));
            vehiculo.setMedioDesplazamiento(desplazamiento);
            vehiculos.add(vehiculo);
        }

        for (Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo);
        }
    }
}