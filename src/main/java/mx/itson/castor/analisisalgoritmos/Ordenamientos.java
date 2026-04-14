/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.castor.analisisalgoritmos;
import java.util.Arrays;

/**
 *
 * @author alelo
 */
public class Ordenamientos {

        
    public static int[] bubbleSort(int[] araay){ //La funcion recibe un araay al que ordenar, y retorna el mismo araay ordenado
        
        int n = araay.length; // n representa la cantidad de elementos dentro del araay
        
        for (int i = 0; i < n - 1; i++) { //O(N) Se itera desde el indice 0, hasta el indice n-1, y cada iteracion se suma 1 al indice
            
            for (int j = 0; j < n - i - 1; j++) { // O(N * N)Itera desde el indice 0, hasta el indice n - 1 - i, esto para no comparar el ultimo alemento en cada iteracion
                
                //Se compara el elemento con el del siguiente indice
                if (araay[j] > araay[j + 1]) { //N * N Si este elemento es mayor, se intercambian de posicion
                    int temp = araay[j];// N * N // Se almacena el valor en j en una variable auxiliar
                    araay[j] = araay[j + 1];// N * N // Se ponel el valor de j + 1 a j
                    araay[j + 1] = temp;// N * N // Se pone el valor de j a j + 1
                }
            }
        }   
        
        return araay; // 1
        
        //Complejidad = O(N * N) o N cuadrada
    }
    
    public static int[] selectionSort(int[] array){
        
        int n = array.length; // O(1) n representa la cantidad de elementos en el array
        
        for (int i = 0; i < n - 1; i++){ // O(N) Se itera sobre el array, desde el indice cero hasta el ultimo elemento
            int indiceMinimo = i; // O(1) Se asume que el elemento actual es el menor
            for (int j = i + 1; j < n; j++){ // O(N) Loop que itera sobre la parte no ordenada del array
                if (array[j] < array[indiceMinimo]){ // O(1) Evalua si el elemento actual es menor al elemento que ya se tiene como menor
                    indiceMinimo = j; //O(1) En caso de que si, ahora el elemento actual ahora representa el siguiente numero menor del arreglo
                }
            }
            
            int aux = array[indiceMinimo];  //O(1) Variable auxiliar que almacena el numero que se determino como el siguiente menor
            array[indiceMinimo] = array[i]; //O(1) Se intercambian de posicion el siguiente numero menor y el elemento contra el que se evaluaba
            array[i] = aux; //O(1)
        }
        
        
        return array; //O(1) Retorna el mismo array pero ordenado
        
        
        //Complejidad del método completo: O(n^2)
    }
    
    
    public static int[] insertionSort(int[] arr){ // 2 + 4n + 3n2 = O(n2)
        
        int n = arr.length; //Se toma la longitud del arreglo O(1)
        
        for (int i = 1; i < n; i++){ //Se recorre el arreglo desde la segunda posicion O(n)
            
            int key = arr[i]; //key representa el valor que se va a comparar y se ba a insertar en sus posicion correcta O(n)
            
            int j = i - 1; //j es el index anterior a key O(n)
            
            while (j >= 0 && arr[j] > key){ //Todos los elementos mayores que key se mueven una posicion a la derecha O(n2)
                    
                    arr[j + 1] = arr[j]; //Todo dentro del while loop tiene complejidad n2
                    j = j - 1; // O(n2)
                }
            arr[j + 1] = key; //Se inserta key en la posicion correcta O(n)
        }
        
        
        return arr; // O(1)
    }
    
public static void quickSort(int[] arr, int inicio, int fin){ 

    if (inicio < fin){  
        //Verifica si hay más de un elemento en el arreglo O(1)

        int pivoteIndice = particion(arr, inicio, fin);  
        //Llama a partición (recorre el arreglo) O(n)

        System.out.println("El índice del pivote es: " + pivoteIndice + ". El arreglo actualmente es: " + Arrays.toString(arr));  
        //Sub arreglo Izquierdo
        
        System.out.println("Izquierda");  
        //Impresión simple  O(1)

        quickSort(arr, inicio, pivoteIndice - 1);  
        //Llamada recursiva lado izquierdo O(log n) 

        //Sub arreglo Derecho
        System.out.println("Derecha");  
        //Impresión simple  O(1)

        quickSort(arr, pivoteIndice + 1, fin);  
        //Llamada recursiva lado derecho O(log n) 
    }     
}

public static int particion(int[] arr, int inicio, int fin){  
    //Método que reorganiza el arreglo alrededor del pivote O(n)
    int pivote = arr[fin];  
    //Toma el último elemento como pivote O(1)
    int i = inicio - 1;  
    //Índice del menor elemento O(1)
    for (int j = inicio; j < fin; j++){  
        //Recorre el arreglo  O(n)
        if (arr[j] < pivote){  
            //Compara elemento con pivote O(1)
            i++;  
            //Incrementa índice O(1)
            int temp = arr[i];  
            //Guarda valor temporal O(1)
            arr[i] = arr[j];  
            //Intercambio O(1)
            arr[j] = temp;  
            //Intercambio O(1)
        }
    }
    int temp = arr[i + 1];  
    //Retorna índice del pivote O(1)Guarda valor temporal O(1)
    arr[i + 1] = arr[fin];  
    //Coloca pivote en su posición final O(1)
    arr[fin] = temp;  
    //Completa intercambio O(1)
    return i + 1;  
    //Retorna índice del pivote O(1)
    }



    public static void mergeSort(int[] arr, int izquierda, int derecha) {
        
        // O(n log n)
        
        // O(1) comparación simple
        if (izquierda < derecha) {

            // O(1) cálculo del punto medio
            int medio = izquierda + (derecha - izquierda) / 2;

            // Divide la mitad izquierda O(n/2)
            mergeSort(arr, izquierda, medio);

            // Divide la mitad derecha O(n/2)
            mergeSort(arr, medio + 1, derecha);

            // Combina las mitades ordenadas O(n)
            merge(arr, izquierda, medio, derecha);
        }
    }

    public static void merge(int[] arr, int izquierda, int medio, int derecha) {
        // O(1)
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;
        // O(n) espacio auxiliar
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copiar datos al arreglo izquierdo O(n1)
        for (int i = 0; i < n1; i++) {
            L[i] = arr[izquierda + i];
        }
        // Copiar datos al arreglo derecho O(n2)
        for (int j = 0; j < n2; j++) {
            R[j] = arr[medio + 1 + j];
        }
        // O(1)
        int i = 0, j = 0;
        int k = izquierda;
        // Mezcla ordenada O(n1 + n2) = O(n)
        while (i < n1 && j < n2) {
            // O(1) comparación
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copiar sobrantes de L O(n)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copiar sobrantes de R O(n)
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}


