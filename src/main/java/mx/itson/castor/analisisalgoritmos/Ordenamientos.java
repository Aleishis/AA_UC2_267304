/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.castor.analisisalgoritmos;

/**
 *
 * @author alelo
 */
public class Ordenamientos {

    public static void main(String[] args) {
        
        int[] array = {1,7,5,6,4,3,4,5,6};
        
        selectionSort(array);
        
        for(int i : array){
            System.out.println(i);
        }
    }
    
    
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
}
