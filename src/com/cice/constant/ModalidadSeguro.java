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
public enum ModalidadSeguro {
    TERCEROS("Terceros"),
    TODORIESGO("Todo Riesgo");
    
    private String modalidadseguro;

    private ModalidadSeguro(String modalidadseguro) {
        this.modalidadseguro = modalidadseguro;
    }

    public String getModalidadseguro() {
        return modalidadseguro;
    }


}
