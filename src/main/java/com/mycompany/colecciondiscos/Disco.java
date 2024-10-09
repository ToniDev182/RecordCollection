/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciondiscos;

/**
 *
 * @author Antonio Atienza Cano
 */

public class Disco {
    private String cantanteGrupo;
    private String disco;
    private int ano;

    // Constructor parametrizado
    public Disco(String cantanteGrupo, String disco, int ano) {
        this.cantanteGrupo = cantanteGrupo;
        this.disco = disco;
        setAno(ano); // Llamamos al setter para validar el año
    }

    // Constructor de copia
    public Disco(Disco otroDisco) {
        this.cantanteGrupo = otroDisco.cantanteGrupo;
        this.disco = otroDisco.disco;
        this.ano = otroDisco.ano;
    }

    // Getters y setters
    public String getCantanteGrupo() {
        return cantanteGrupo;
    }

    public void setCantanteGrupo(String cantanteGrupo) {
        this.cantanteGrupo = cantanteGrupo;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public int getAno() {
        return ano;
    }
 // Entiendo que el unico atributo que hay que verificar es el año ya que el resto puede contener cualquier caracter. 
    public void setAno(int ano) {
        if (verificarFecha(ano)) {
            this.ano = ano;
        } else {
            System.out.println("Error: Año no válido. Debe estar en el rango de 1900 a 2024.");
        }
    }

   @Override
public String toString() {
    // Retorna una cadena que incluye el cantante/grupo, el disco y el año del disco.
    // Utiliza el operador + para concatenar las partes de la cadena.
    return "Cantante/grupo = " + cantanteGrupo + ". Disco = " + disco + ". Año = " + ano;
}

 // metodo para validar un año entre 1900 y 2024
    private boolean verificarFecha(int year) {
        // Verifica que el año esté en el rango de 1900 a 2024
        return String.valueOf(year).matches("^(19[0-9]{2}|20[0-1][0-9]|202[0-4])$");
    }
}

