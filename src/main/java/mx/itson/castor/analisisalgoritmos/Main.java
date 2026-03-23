/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.castor.analisisalgoritmos;

/**
 *
 * @author alelo
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        int[] array = {5,3,7,6,8,4,9,6};

        System.out.println("Array desordenado");
        for(int i:array){
            System.out.print(i+" ");
        }
        
        int inicio = 0;
        int fin = array.length - 1;
        
        Ordenamientos.quickSort(array, inicio, fin);

        System.out.println("\n");
        System.out.println("Array ordenado");
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
