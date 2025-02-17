/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IDAT
 */
public class pruebabanco {
    public static void main(String[] args) {
        cliente cliente1 = new cliente("Juan","Solar","70721885","987654321",521);
        cliente cliente2 = new cliente("Juana","Solares","70758285","987654321",9621);
        cliente cliente3 = new cliente("Juanita","Solarito","70581885","987654321",52631);
         
        banco banco = new banco(cliente1,cliente2,cliente3);
        
        cliente1.deposito(500);
        cliente1.deposito(100);
        cliente1.deposito(2000);
 
        
        banco.imprimirclientes();
        banco.imprimirsaldoclientes();
        
    }
    
}
