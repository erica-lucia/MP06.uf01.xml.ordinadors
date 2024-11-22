/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreon.benites.erica.mp06.uf01.xml.ordinadors;

/**
 *
 * @author Usuario
 */
import java.io.Serializable;
//import java.util.ArrayList;

public class Ordinador implements Serializable {
    private transient String numSerie; // Exclòs de la serialització
    private String marca;
    private String model;
    private int memoria;
    private int discDur;
    private String processador;

    // Constructor per defecte
    public Ordinador() {}

    // Constructor amb paràmetres
    public Ordinador(String numSerie, String marca, String model, int memoria, int discDur, String processador) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.model = model;
        this.memoria = memoria;
        this.discDur = discDur;
        this.processador = processador;
    }

    // Getters i setters
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDiscDur() {
        return discDur;
    }

    public void setDiscDur(int discDur) {
        this.discDur = discDur;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Ordinador [marca=" + marca + ", model=" + model + ", memoria=" + memoria + "GB, discDur=" + discDur
                + "GB, processador=" + processador + "]";
    }
}
