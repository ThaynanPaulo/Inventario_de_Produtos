/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventario;

/**
 * @author Thaynan
 */

public class Estrategia {
    private SearchStrategy estrategia;
    
    public Estrategia(SearchStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public SearchStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(SearchStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    public int buscar (int id, int[] vetor) {
        return estrategia.busca(id, vetor);
    }
      
}
