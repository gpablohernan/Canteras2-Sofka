import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        String opcionTripulacion;
        int opcionTipoVehiculo;
        int nroPasajeros;
        boolean contieneTripulacion;
        int nroRuedas;
        String fechaMatriculacion;
        String medioDesplazamiento;
        int puertasCoche;
        int cilindradaMoto;
        int velocidadesBicicleta;
        double alturaCamion;
        int caballosFuerzaLancha;

        for (int i = 1; i<11; i++)
        {
            Vehiculo vehiculo = new Vehiculo();
            System.out.println("Ingrese los datos del vehículo número " + i + ":");
            System.out.println("Número de pasajeros:");
            nroPasajeros = scanner.nextInt();
            vehiculo.setNroPasajeros(nroPasajeros);
            do {
                System.out.println("Contiene tripulación? (S/N)");
                opcionTripulacion = scanner.next().toUpperCase();
            } while (!opcionTripulacion.equals("S") && !opcionTripulacion.equals("N"));
            contieneTripulacion = opcionTripulacion.equals("S");
            vehiculo.setContieneTripulacion(contieneTripulacion);
            System.out.println("Número de ruedas:");
            nroRuedas = scanner.nextInt();
            vehiculo.setNroRuedas(nroRuedas);
            System.out.println("Fecha de matriculación: (dd/mm/aaaa)");
            fechaMatriculacion = scanner.next().toLowerCase();
            vehiculo.setfechaMatriculacion(fechaMatriculacion);
            do {
                System.out.println("Medio de desplazamiento: (aire, agua, tierra)");
                medioDesplazamiento = scanner.next().toLowerCase();

            } while (!medioDesplazamiento.equals("aire") && !medioDesplazamiento.equals("agua") && !medioDesplazamiento.equals("tierra"));
            vehiculo.setMedioDesplazamiento(medioDesplazamiento);

            do {
                System.out.println("Indique el tipo de vehículo:");
                System.out.println("1 -- Coche");
                System.out.println("2 -- Moto");
                System.out.println("3 -- Camión");
                System.out.println("4 -- Bicicleta");
                System.out.println("5 -- Lancha");
                opcionTipoVehiculo = scanner.nextInt();
            } while (opcionTipoVehiculo < 1 || opcionTipoVehiculo > 5);
            switch (opcionTipoVehiculo){
                case 1:
                    do {
                        System.out.println("Indique la cantidad de puertas del coche (3 o 5)");
                        puertasCoche = scanner.nextInt();
                    } while (puertasCoche !=3 && puertasCoche !=5);
                    Coche coche = new Coche(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento, puertasCoche);
                    vehiculos.add(coche);
                    break;
                case 2:
                    System.out.println("Indique la cilindrada de la moto:");
                    cilindradaMoto = scanner.nextInt();
                    Moto moto = new Moto(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento, cilindradaMoto);
                    vehiculos.add(moto);
                    break;
                case 3:
                    System.out.println("Indique la altura del camión:");
                    alturaCamion = scanner.nextDouble();
                    Camion camion = new Camion(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento, alturaCamion);
                    vehiculos.add(camion);
                    break;
                case 4:
                    System.out.println("Indique la cantidad de velocidades de la bicicleta:");
                    velocidadesBicicleta = scanner.nextInt();
                    Bicicleta bicicleta = new Bicicleta(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento, velocidadesBicicleta);
                    vehiculos.add(bicicleta);
                    break;
                case 5:
                    System.out.println("Indique la cantidad de caballos de fuerza de la lancha:");
                    caballosFuerzaLancha = scanner.nextInt();
                    Lancha lancha = new Lancha(nroPasajeros, contieneTripulacion, nroRuedas, fechaMatriculacion, medioDesplazamiento, caballosFuerzaLancha);
                    vehiculos.add(lancha);
                    break;
            }
        }
        for (Vehiculo vehiculo: vehiculos){
            System.out.println(vehiculo);
        }
    }
}