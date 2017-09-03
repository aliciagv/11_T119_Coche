/*
 * Crear la clase Coche
 * a) Guardar como información el modelo, su color, si la pintura es metalizada, la matrícula, el
 * tipo de coche (utilitario, familiar, deportivo), el año de fabricación y la modalidad del
 * seguro (terceros o todo riesgo).
 * b) Crear un método que permita imprimir sus datos
 */
package com.cice.principal;

import com.cice.clases.Coche;
import com.cice.constant.ModalidadSeguro;
import com.cice.constant.TiposCoche;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //public Coche(String modelo, String color, boolean metalizado, String matricula, TiposCoche tipoCoche, int fabricacion, ModalidadSeguro modalidadSeguro) {
        Scanner sc = new Scanner(System.in);
        Coche coche=null;
        String modelo;
        String color;
        boolean metalizado;
        String matricula;
        TiposCoche tipoCoche=null;
        int fabricacion=1900;
        ModalidadSeguro modalidadSeguro=null;
        System.out.println("COCHE");
        System.out.println("================");
        ArrayList<Coche> coches = new ArrayList<Coche>();
        int opcion=0;
        do {
            System.out.print("Introduce modelo: ");
            modelo=sc.next();
            System.out.print("Introduce un color: ");
            color= sc.next();
            System.out.print("¿Lo quiere metalizado? Si/No");
            metalizado=sc.next().equalsIgnoreCase("SI")?true:false;
            System.out.print("Introduce matrícula: ");
            matricula=sc.next();
            boolean opcioncorrecta=false;
            do {
                System.out.println("Introduce un tipo de coche");
               
                System.out.println("1." + TiposCoche.DEPORTIVO);
                System.out.println("2." + TiposCoche.FAMILIAR);
                System.out.println("3." + TiposCoche.UTILITARIO);
                if (sc.hasNextInt()){
                    opcion= sc.nextInt();
                    switch (opcion) {
                        case 1:
                            tipoCoche=TiposCoche.DEPORTIVO;
                            opcioncorrecta=true;
                            break;
                        case 2:
                             tipoCoche=TiposCoche.FAMILIAR;
                            opcioncorrecta=true;
                            break;
                        case 3:
                             tipoCoche=TiposCoche.UTILITARIO;
                            opcioncorrecta=true;
                            break;
                        default:
                            System.out.println("ERROR:El valor introducido es erróneo");
                    }
                } else {
                    sc.next();
                    System.out.println("ERROR: La opción introducida debe ser un número del 1 al 3");
                }
                
            } while (!opcioncorrecta);
            System.out.println("Introduce el año de fabricación");
            fabricacion=sc.nextInt();
            
            opcioncorrecta=false;
             do {
                System.out.println("Introduce la modalidad de seguro");
               
                System.out.println("1." + ModalidadSeguro.TERCEROS);
                System.out.println("2." + ModalidadSeguro.TODORIESGO);
                
                if (sc.hasNextInt()){
                    opcion= sc.nextInt();
                    switch (opcion) {
                        case 1:
                            modalidadSeguro=ModalidadSeguro.TERCEROS;
                            opcioncorrecta=true;
                            break;
                        case 2:
                             modalidadSeguro=ModalidadSeguro.TODORIESGO;;
                            opcioncorrecta=true;
                            break;
                        
                        default:
                            System.out.println("ERROR:El valor introducido es erróneo");
                    }
                } else {
                    sc.next();
                    System.out.println("ERROR: La opción introducida debe ser un númerico");
                }
                
            } while (!opcioncorrecta);
             
             
            coche = new Coche(modelo,color,metalizado,matricula,tipoCoche,fabricacion,modalidadSeguro);
                coches.add(coche);
            System.out.println("¿Quiere introducir otro coche? Si/ No");
            if (sc.next().equalsIgnoreCase("SI")){
                opcion=1;
            } else {opcion=0;}
        } while (opcion != 0);
        
        for(Coche c: coches){
            c.pintarInfoCoche();
        }
    }


}
