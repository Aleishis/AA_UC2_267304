/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.castor.analisisalgoritmos;

import static mx.itson.castor.analisisalgoritmos.Ordenamientos.mergeSort;

/**
 *
 * @author alelo
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        int[] arr = {5,3,7,6,8,4,9,6};

        System.out.println("Array desordenado");
        for(int i:arr){
            System.out.print(i+" ");
        }
        
        // Llamada principal O(n log n)
        mergeSort(arr, 0, arr.length - 1);

        // Imprimir resultado -> O(n)
        System.out.println("\nArray ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
