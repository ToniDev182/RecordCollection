/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciondiscos;

/**
 *
 * @author Antonio Atienza Cano
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DiscosColection {
    // ArrayList para almacenar los objetos de tipo Disco.
    private ArrayList<Disco> discos;

    // Constructor de la clase, se llama al crear una nueva instancia de DiscosColection.
    public DiscosColection() {
        // Inicializa el ArrayList para almacenar los discos.
        this.discos = new ArrayList<>();
    }

    // Método para agregar un nuevo disco a la colección.
    public void agregarDisco(Disco disco) {
        // Agrega el disco proporcionado al ArrayList.
        discos.add(disco);
    }

    // Método para ordenar la colección de discos por el año de lanzamiento.
    public void ordenarPorAno() {
        // Utiliza la función de ordenación de Java para ordenar los discos según el año.
        // Se utiliza un Comparator para especificar cómo comparar los años.
        Collections.sort(discos, Comparator.comparingInt(Disco::getAno));
    }

    // Método para mostrar la información de todos los discos en la colección.
    public void mostrarColeccion() {
        // Itera a través de cada disco en la colección y muestra su información.
        for (Disco disco : discos) {
            // Utiliza el método toString de la clase Disco para obtener una representación en cadena del disco.
            System.out.println(disco.toString());
        }
    }
}