/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventario;
import java.util.Arrays;

/**
 *
 * @author Thaynan
 */
public class BinarySearchStrategy implements SearchStrategy {

    public int busca(int id, int[] vetor) {
        /*
        int trocar = 0;
        for(int i = 0; i < vetor.length; i++ ) {
            for(int j = 0; j < i; j++ ) {
                if( vetor[i] < vetor[j]) {
                    trocar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = trocar;                
                }
            }
        }
        */
    Arrays.sort(vetor);
    
    int inicio = 0;
    int fim = vetor.length - 1;
    int meio = 0;
    
    while ( inicio < fim) {
        meio = (inicio + fim)/2;
        
        if(vetor[meio] == id) {
            return meio;
        }
        if(vetor[meio] <  id)
            inicio = meio + 1;
        else {
            fim = meio - 1;
        }
    }
    return -1;
    }    
}
