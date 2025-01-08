/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package com.mycompany.inventario;


import java.util.Random;

/**
 *
 * @author Thaynan
 */
public class Inventario{

    public static void main(String[] args) {
        
        int id = 32;
        int tamanho = 100000;
        int[] vetor = new int[tamanho];
        
        Random random = new Random();
        
        for(int i = 0; i < tamanho; i++) {
        vetor[i] = random.nextInt(30000);
    }
             
        Estrategia estrategia = new Estrategia (new BinarySearchStrategy());
        //Estrategia estrategia = new Estrategia (new LinearSearchStrategy());
        
        int posicao = estrategia.buscar(id, vetor);
        
        for(int i = 0; i < vetor.length - 1; i++ ) {
            System.out.println(vetor[i] + ", " );
        }
        
        if (estrategia.buscar(id, vetor) != -1) {
            System.out.println("Encontrado na posicao: " + posicao);
        }
        else {
            System.out.println("Nao encontrado!");
        }
      
    }
}

