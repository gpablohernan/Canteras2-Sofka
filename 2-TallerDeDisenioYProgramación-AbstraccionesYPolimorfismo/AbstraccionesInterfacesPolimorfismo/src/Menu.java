import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void menuPrincipal() {


        ArrayList<NaveEspacial> navesEspaciales = new ArrayList<>();

        VehiculoLanzadera lanzaderaDefault1 = new VehiculoLanzadera("Saturno V", 2900, 100, 3500, 118, 32000);
        navesEspaciales.add(lanzaderaDefault1);
        VehiculoLanzadera lanzaderaDefault2 = new VehiculoLanzadera("Energia", 2400, 60, 3060, 100, 18000);
        navesEspaciales.add(lanzaderaDefault2);
        VehiculoLanzadera lanzaderaDefault3 = new VehiculoLanzadera("Katrina III", 2600, 80, 3200, 110, 30000);
        navesEspaciales.add(lanzaderaDefault3);

        NaveNoTripulada noTripuladaDefault1 = new NaveNoTripulada("Urano VII", 0.23, 43, 0.2, 475);
        navesEspaciales.add(noTripuladaDefault1);
        NaveNoTripulada noTripuladaDefault2 = new NaveNoTripulada("Sinergia", 0.56, 86, 0.7, 423);
        navesEspaciales.add(noTripuladaDefault2);
        NaveNoTripulada noTripuladaDefault3 = new NaveNoTripulada("Ventos", 0.32, 40, 0.4, 407);
        navesEspaciales.add(noTripuladaDefault3);

        NaveTripulada tripuladaDefault1 = new NaveTripulada("Marte II", 77, 85, 0.21, 465);
        navesEspaciales.add(tripuladaDefault1);
        NaveTripulada tripuladaDefault2 = new NaveTripulada("Magnos", 485, 120, 0.24, 452);
        navesEspaciales.add(tripuladaDefault2);
        NaveTripulada tripuladaDefault3 = new NaveTripulada("Filos", 720, 73, 0.39, 420);
        navesEspaciales.add(tripuladaDefault3);

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("----------------- MENÚ PRINCIPAL -----------------");
            System.out.println("Ingrese qué tipo de nave espacial que desea crear:\n" +
                    "1 -- Vehículo lanzadera \n" +
                    "2 -- Nave no tripulada \n" +
                    "3 -- Nave tripulada \n" +
                    "4 -- No cargar más naves \n");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    VehiculoLanzadera vehiculoLanzadera = new VehiculoLanzadera();
                    vehiculoLanzadera.crearVehiculoLanzadera();
                    navesEspaciales.add(vehiculoLanzadera);
                    System.out.println("Vehículo lanzadera creado con éxito");
                    break;
                case 2:
                    NaveNoTripulada naveNoTripulada = new NaveNoTripulada();
                    naveNoTripulada.crearNaveNoTripulada();
                    navesEspaciales.add(naveNoTripulada);
                    System.out.println("Nave no tripulada creada con éxito");
                    break;
                case 3:
                    NaveTripulada naveTripulada = new NaveTripulada();
                    naveTripulada.crearNaveTripulada();
                    navesEspaciales.add(naveTripulada);
                    System.out.println("Nave tripulada creada con éxito");
                    break;

                case 4:
                    menuSecundario(navesEspaciales);
                    break;

                default:
                    System.out.println("Ingrese una opción correcta");
                    break;

            }
        } while (opcion != 4);

    }

    public static void menuSecundario(ArrayList<NaveEspacial> navesEspaciales){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("---------------------- MENÚ SECUNDARIO ----------------------");
            System.out.println("Ingrese la opción que desea visualizar:");
            System.out.println("1 ----- Mostrar todas las naves espaciales");
            System.out.println("2 ----- Mostrar todos los vehículos lanzadera");
            System.out.println("3 ----- Mostrar todas las naves no tripuladas");
            System.out.println("4 ----- Mostrar todas las naves tripuladas");
            System.out.println("5 ----- Ir al menú especializado");
            opcion = scanner.nextInt();


            for (NaveEspacial naves : navesEspaciales) {
                switch (opcion) {
                    case 1:
                        System.out.println(naves);
                        break;
                    case 2:
                        if (naves.getClass().getName().equalsIgnoreCase("VehiculoLanzadera")) {
                            System.out.println(naves);
                        }
                        break;
                    case 3:
                        if (naves.getClass().getName().equalsIgnoreCase("NaveNoTripulada")) {
                            System.out.println(naves);
                        }
                        break;
                    case 4:
                        if (naves.getClass().getName().equalsIgnoreCase("NaveTripulada")) {
                            System.out.println(naves);
                        }
                        break;
                    case 5:
                        menuEspecializado(navesEspaciales);
                        break;
                    default:
                        System.out.println("Ingrese una opción correcta");
                        break;

                }

            }

        } while (opcion != 5);

    }

    public static void menuEspecializado(ArrayList<NaveEspacial> navesEspaciales){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        do {
            System.out.println("------------ MENÚ ESPECIALIZADO ------------");
            System.out.println("Ingrese la opción que desea realizar:");
            System.out.println("------- VEHÍCULO LANZADERA -------");
            System.out.println("1 ----- Indexar carga útil");
            System.out.println("2 ----- cargarCombustible");
            System.out.println("--------------------------------------");
            System.out.println("------- NAVE NO TRIPULADA -------");
            System.out.println("3 ----- Asignar tarea");
            System.out.println("4 ----- Estudiar cuerpo celeste");
            System.out.println("--------------------------------------");
            System.out.println("----- NAVE TRIPULADA -----");
            System.out.println("5 ----- Ingresar tripulación");
            System.out.println("6 ----- Ingresar tareas de tripulación");
            System.out.println("--------------------------------------");
            System.out.println("7 ----- Volver al menú anterior");
            System.out.println("8 ----- Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    VehiculoLanzadera lanzadera1 = new VehiculoLanzadera();
                    String nombreLanzadera1 = lanzadera1.elegirNaveEspacial(navesEspaciales, "VehiculoLanzadera");
                    if (!nombreLanzadera1.equals("no encontrado")) {
                        String carga = lanzadera1.asignarTareaNave();
                        System.out.println("El vehículo lanzadera " + nombreLanzadera1 + " ha sido indexado con la carga: " + carga);
                    }
                    break;
                case 2:
                    VehiculoLanzadera lanzadera2 = new VehiculoLanzadera();
                    String nombreLanzadera2 = lanzadera2.elegirNaveEspacial(navesEspaciales, "VehiculoLanzadera");
                    if (!nombreLanzadera2.equals("no encontrado")) {
                        String combustible = lanzadera2.asignarTareaTripulacion();
                        System.out.println("El vehículo lanzadera " + nombreLanzadera2 + " ha sido cargado con el combustible: " + combustible);
                    }
                    break;
                case 3:
                    NaveNoTripulada noTripulada = new NaveNoTripulada();
                    String nombreNoTripulada1 = noTripulada.elegirNaveEspacial(navesEspaciales, "NaveNoTripulada");
                    if (!nombreNoTripulada1.equals("no encontrado")) {
                        String tarea = noTripulada.asignarTareaNave();
                        System.out.println("La nave no tripulada " + nombreNoTripulada1 + " ha sido asignada con la tarea: " + tarea);
                    }
                    break;
                case 4:
                    NaveNoTripulada noTripulada1 = new NaveNoTripulada();
                    String nombreNoTripulada2 = noTripulada1.elegirNaveEspacial(navesEspaciales, "NaveNoTripulada");
                    if (!nombreNoTripulada2.equals("no encontrado")) {
                        String cuerpoCeleste = noTripulada1.asignarTareaTripulacion();
                        System.out.println("La nave no tripulada " + nombreNoTripulada2 + " ha sido enviada a estudiar el cuerpo celeste: " + cuerpoCeleste);
                    }
                    break;
                case 5:
                    NaveTripulada tripulada1 = new NaveTripulada();
                    String nombreTripulada1 = tripulada1.elegirNaveEspacial(navesEspaciales, "NaveTripulada");
                    if (!nombreTripulada1.equals("no encontrado")) {
                        String tripulacion = tripulada1.asignarTareaNave();
                        System.out.println("La nave tripulada " + nombreTripulada1 + " ha sido asignada con " + tripulacion + " personas a bordo");
                    }
                    break;
                case 6:
                    NaveTripulada tripulada2 = new NaveTripulada();
                    String nombreTripulada2 = tripulada2.elegirNaveEspacial(navesEspaciales, "NaveTripulada");
                    if (!nombreTripulada2.equals("no encontrado")) {
                        String tareasTripulacion = tripulada2.asignarTareaTripulacion();
                        System.out.println("La tripulación de la nave " + nombreTripulada2 + " ha sido asignada con la tarea de " + tareasTripulacion);
                    }
                    break;
                case 7:
                    menuSecundario(navesEspaciales);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Ingrese una opción correcta");
                    break;

            }

        } while (opcion != 8);

    }

}