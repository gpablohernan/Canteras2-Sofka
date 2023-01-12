import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Planeta> sistemaPlanetario = new ArrayList<>();
        Planeta planeta1 = new Planeta();
        Planeta planeta2 = new Planeta();
        int opcion1, opcion2;

        Planeta mercurio = new Planeta(1, "Mercurio", 330104*Math.pow(10,18), 5.427, Math.PI*2*2439, 57909227L);
        Planeta venus = new Planeta(2, "Venus", 4867320*Math.pow(10,18), 5.243, Math.PI*2*6051, 108209475L);
        Planeta tierra = new Planeta(3, "Tierra", 5972190*Math.pow(10,18), 5.513, Math.PI*2*6371, 149598262L);
        Planeta marte = new Planeta(4, "Marte", 641693*Math.pow(10,18), 	3.934, Math.PI*2*3389, 	227943824L);
        Planeta jupiter = new Planeta(4, "Júpiter", 	1898130*Math.pow(10,21), 1.326, Math.PI*2*69911, 778340821L);
        Planeta saturno = new Planeta(6, "Saturno", 	568319*Math.pow(10,21), 0.687, Math.PI*2*58238, 1426666422L);
        Planeta urano = new Planeta(7, "Urano", 86810300*Math.pow(10,18), 1.270, Math.PI*2*25362, 2870658186L);
        Planeta neptuno = new Planeta(8, "Neptuno", 102412*Math.pow(10,21), 1.638, Math.PI*2*24622, 4498396441L);

        sistemaPlanetario.add(mercurio);
        sistemaPlanetario.add(venus);
        sistemaPlanetario.add(tierra);
        sistemaPlanetario.add(marte);
        sistemaPlanetario.add(jupiter);
        sistemaPlanetario.add(saturno);
        sistemaPlanetario.add(urano);
        sistemaPlanetario.add(neptuno);



        do {
            for (Planeta planeta: sistemaPlanetario) {
                System.out.println(planeta);
            }
            System.out.println("Ingrese el número de id del primer planeta para calcular la atracción gravitatoria:");
            opcion1 = scanner.nextInt();


        } while (opcion1 < 1 || opcion1 > 8);

        do {
            for (Planeta planeta: sistemaPlanetario) {
                System.out.println(planeta);
            }
            System.out.println("Ingrese el número de id del segundo planeta para calcular la atracción gravitatoria:");
            opcion2 = scanner.nextInt();

        } while (opcion2 < 1 || opcion2 > 8);

        for (Planeta planeta: sistemaPlanetario) {
            if (planeta.getId() == opcion1){
                planeta1 = planeta;
            }
            if (planeta.getId() == opcion2){
                planeta2 = planeta;
            }
        }

        calcularAtraccionGravitatoria(planeta1, planeta2);

    }

    public static void calcularAtraccionGravitatoria(Planeta planeta1, Planeta planeta2){
        final double G= 6.67*Math.pow(10, -11);
        double distancia = Math.abs(planeta1.getDistanciaAlSol()-planeta2.getDistanciaAlSol())*1000;
        double atraccionGravitatoria = (G * planeta1.getMasa() * planeta2.getMasa())/(Math.pow(distancia, 2));
        System.out.println("La atracción gravitatoria entre " + planeta1.getNombre() + " y " + planeta2.getNombre() + " es: " + atraccionGravitatoria);
    }
}