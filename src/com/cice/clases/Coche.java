/*
 * modelo, su color, si la pintura es metalizada, la matrícula, el
 * tipo de coche (utilitario, familiar, deportivo), el año de fabricación y la modalidad del
 * seguro (terceros o todo riesgo).
 */
package com.cice.clases;

import com.cice.constant.ModalidadSeguro;
import com.cice.constant.TiposCoche;

/**
 *
 * @author Alicia
 */
public class Coche {
    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    
    private TiposCoche tipoCoche;
    private int fabricacion;
    private ModalidadSeguro modalidadSeguro;

    public Coche(String modelo, String color, boolean metalizado, String matricula, TiposCoche tipoCoche, int fabricacion, ModalidadSeguro modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.fabricacion = fabricacion;
        this.modalidadSeguro = modalidadSeguro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMetalizado() {
        return metalizado;
    }

    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TiposCoche getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(TiposCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public ModalidadSeguro getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(ModalidadSeguro modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }

    
    public void pintarInfoCoche(){
        System.out.println("INFORMACION COCHE");
        System.out.println("==================");
        System.out.println("MODELO: "+ this.getModelo());
        String metalizado=this.isMetalizado()? " METALIZADO":" NO METALIZADO";
        System.out.println("COLOR: "+ this.getColor() + metalizado );
        System.out.println("El año de fabricación es: "+ this.getFabricacion());
        System.out.println("TIPO DE COCHE: "+this.tipoCoche.getTipoCoche());
        System.out.println("TIPO DE SEGURO: "+ this.modalidadSeguro.getModalidadseguro());
    }
    
}
