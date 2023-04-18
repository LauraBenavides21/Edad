/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Edad {
    private int anio;
    
    public Edad(int anio){
        this.anio = anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void pedir_anio(){
        Scanner edad = new Scanner(System.in);
        System.out.println("Digite la edad");
        this.setAnio(edad.nextInt());
        while(this.anio < 0 || this.anio > 100){
            System.out.println("Digite una edad valida");
            this.setAnio(edad.nextInt());
        }
    }
    
    public void mensaje(){
        if(this.anio > 0 && this.anio < 14)
            System.out.println("La edad es "+ anio +" es un NINO");
        else if(this.anio > 13 && this.anio < 19)
            System.out.println("La edad es "+ anio +" es un ADOLESCENTE");
        else if(this.anio > 18 && this.anio < 61)
            System.out.println("La edad es "+ anio +" es un ADULTO");
        else if(this.anio > 61)
            System.out.println("La edad es "+ anio +" es un ADULTO MAYOR");
    }
    
    public static void main(String[] args){
        Edad edad = new Edad(0);
        edad.pedir_anio();
        edad.mensaje();
    }
}
