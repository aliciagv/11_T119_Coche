/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.constant;

/**
 *
 * @author Alicia
 */
public enum TiposCoche {
    UTILITARIO ("Utilitario"),
    FAMILIAR ("Familiar"),
    DEPORTIVO ("Deportivo");
    
    private String tipoCoche;

    private TiposCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }
    
    




    
}
