/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author agustin
 */
public class TP7 {

    /**
    * @param args the command line arguments
     */
    public static void main(String[] args) {
       Directorio telefonica = new Directorio();
       telefonica.agregarCliente(12345, new Cliente(37052,"Agustin","Segovia","Venezuela","San Luis"));
       telefonica.agregarCliente(678, new Cliente (36923, "Jorge","ricardo", "lafinur","carlos"));
       System.out.println(telefonica.buscarCliente(12345).getApellido());
       System.out.println(telefonica.buscarCliente(678).getNombre());
       System.out.println(telefonica.buscarTelefonos("Segovia"));
       System.out.println(telefonica.buscarClientes("carlos"));
       telefonica.agregarCliente(1212,new Cliente(12965,"Alejandra", "Bertello", "Tilisarao", "Pringles"));
       System.out.println(telefonica.buscarClientes("Pringles"));
       telefonica.borrarClientes(37052);
       telefonica.borrarClientes(12965);
       System.out.println(telefonica.buscarCliente(1212));
       
       
       
    }
    
}
