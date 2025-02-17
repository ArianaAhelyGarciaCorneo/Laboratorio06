/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idat.laboratorio06.encapsulamiento;

/**
 *
 * @author IDAT
 */
public class PruebaPersona {
    public static void main(String[] args) {
        persona persona = new persona ("Ariana");
        //persona.name = "Nombre modificado";
        System.out.println(persona);
        persona.setName("Ahely");
        System.out.println(persona);

        
        
    }
}
