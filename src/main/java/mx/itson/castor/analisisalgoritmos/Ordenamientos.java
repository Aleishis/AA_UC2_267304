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
        
        int[] nuevoArray = bubbleSort(array);
        
        for(int i : nuevoArray){
            System.out.println(i);
        }
    }
    
    
    public static int[] bubbleSort(int[] array){ //La funcion recibe un array al que ordenar, y retorna el mismo array ordenado
        
        int n = array.length; // n representa la cantidad de elementos dentro del array
        
        for (int i = 0; i < n - 1; i++) { //O(N) Se itera desde el indice 0, hasta el indice n-1, y cada iteracion se suma 1 al indice
            
            for (int j = 0; j < n - i - 1; j++) { // O(N * N)Itera desde el indice 0, hasta el indice n - 1 - i, esto para no comparar el ultimo alemento en cada iteracion
                
                //Se compara el elemento con el del siguiente indice
                if (array[j] > array[j + 1]) { //N * N Si este elemento es mayor, se intercambian de posicion
                    int temp = array[j];// N * N // Se almacena el valor en j en una variable auxiliar
                    array[j] = array[j + 1];// N * N // Se ponel el valor de j + 1 a j
                    array[j + 1] = temp;// N * N // Se pone el valor de j a j + 1
                }
            }
        }   
        
        return array; // 1
        
        //Complejidad = O(N * N) o N cuadrada
    }
}
