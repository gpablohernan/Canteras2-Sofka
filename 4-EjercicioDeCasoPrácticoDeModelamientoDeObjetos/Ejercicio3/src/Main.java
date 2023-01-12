import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        double[] numerosReales = new double[10];
        int min = 1;
        int max = 100;
        int tipoOrdenamiento;

        for (int i = 0; i < numerosReales.length; i++) {
            numerosReales[i] = Math.random() * (max - min + 1) + min;
            System.out.println(numerosReales[i]);
        }

        do {
            System.out.println("Ingrese el tipo de ordenamiento que desea utilizar (1 o 2):");
            System.out.println("1 -- Algoritmo de la burbuja");
            System.out.println("2 -- Quick sort");
            tipoOrdenamiento = scanner.nextInt();
        } while (tipoOrdenamiento < 1 || tipoOrdenamiento > 2);

        if (tipoOrdenamiento == 1){
            ordenarConBurbuja(numerosReales);
            for (int i = 0; i < numerosReales.length; i++) {

                System.out.println("Ordenado con burbuja: " + numerosReales[i]);
            }
        } else {
            ordenarConQuickSort(numerosReales);
            for (int i = 0; i < numerosReales.length; i++) {

                System.out.println("Ordenado con Quick Sort: " + numerosReales[i]);
            }
        }
    }

    public static void ordenarConBurbuja(double[] arreglo){
        double aux;
        boolean intercambio = false;

        while (true)
        {
            intercambio = false;
            for (int i = 1; i < arreglo.length; i++)
            {
                if (arreglo[i] < arreglo[i - 1])
                {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i - 1];
                    arreglo[i - 1] = aux;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
    }

    public static void ordenarConQuickSort(double[] arreglo){
        arreglo = ordenarConQuickSort1(arreglo);
    }
    public static double[] ordenarConQuickSort1(double[] arreglo){
        return ordenarConQuickSort2(arreglo,0,arreglo.length-1);
    }
    public static double[] ordenarConQuickSort2(double[] arreglo,int izquierda, int derecha){
        if(izquierda>=derecha)
            return arreglo;
        int izq=izquierda, der=derecha;
        if(izquierda!=derecha){
            int pivote;
            double aux;
            pivote = izquierda;
            while(izquierda!=derecha){
                while(arreglo[derecha]>=arreglo[pivote] && izquierda<derecha)
                    derecha--;
                while(arreglo[izquierda]<arreglo[pivote] && izquierda<derecha)
                    izquierda++;
                if(derecha!=izquierda){
                    aux = arreglo[derecha];
                    arreglo[derecha]=arreglo[izquierda];
                    arreglo[izquierda]=aux;
                }
            }
            if(izquierda==derecha){
                ordenarConQuickSort2(arreglo,izq,izquierda-1);
                ordenarConQuickSort2(arreglo,izquierda+1,der);
            }
        }
        else
            return arreglo;
        return arreglo;
    }
}