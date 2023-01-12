import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int numActual;
        int numAnterior = -536;
        Vector<Integer> numeros = new Vector<>();

        while (true){
            System.out.println("Ingrese un número: (para terminar ingrese el mismo número dos veces seguidas)");
            numActual = scanner.nextInt();
            numeros.add(numActual);
            if (numActual == numAnterior){
                break;
            } else {
                numAnterior = numActual;
            }
        }
        System.out.println("Los números ingresados fueron:");
        for (Integer numero: numeros) {
            System.out.println(numero);
        }
    }
}