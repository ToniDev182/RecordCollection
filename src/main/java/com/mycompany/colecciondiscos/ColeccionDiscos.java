/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colecciondiscos;

/**
 *
 * @author Antonio Atienza Cano
 */
public class ColeccionDiscos {
    public static void main(String[] args) {
        // Creamos una instancia de la clase DiscosColection llamada coleccionDiscos
        DiscosColection coleccionDiscos = new DiscosColection(); 

        // Agregamos tres discos a nuestra colección utilizando el método agregarDisco
        coleccionDiscos.agregarDisco(new Disco("M Clan", "Delta", 2016));
        coleccionDiscos.agregarDisco(new Disco("Revolver", "Babilonia", 2015));
        coleccionDiscos.agregarDisco(new Disco("Coti", "Malditas Canciones", 2009));

        // Ordenamos la colección de discos por el año de lanzamiento utilizando el método ordenarPorAno
        coleccionDiscos.ordenarPorAno();

        // Mostramos la colección ordenada utilizando el método mostrarColeccion
        coleccionDiscos.mostrarColeccion();
    }
}