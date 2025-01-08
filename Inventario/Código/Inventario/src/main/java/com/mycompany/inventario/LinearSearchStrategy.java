/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventario;
/**
 *
 * @author Thaynan
 */
public class LinearSearchStrategy implements SearchStrategy {
    @Override
    public int busca(int id, int[] vetor) {
        for(int i = 0; i < vetor.length ; i++) {
            if(vetor[i] == id) {
                return i+1;             // vetor começa de 0 até n-1 então a posição será i+1
            }
        }
     return -1;   
    }
}
