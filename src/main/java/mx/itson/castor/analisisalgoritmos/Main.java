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
        
        
        int[] array = {24,12,10,50,4};
        
        int[] arrayOrdenado = Ordenamientos.selectionSort(array);
        
        System.out.println("Array desordenado");
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("Array ordenado");
        for(int i:arrayOrdenado){
            System.out.print(i+" ");
        }
    }
}
