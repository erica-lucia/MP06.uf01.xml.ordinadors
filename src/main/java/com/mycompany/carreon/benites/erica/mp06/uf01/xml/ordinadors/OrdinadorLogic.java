/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreon.benites.erica.mp06.uf01.xml.ordinadors;

/**
 *
 * @author Usuario
 */
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.List;

public class OrdinadorLogic {

    // 1. Serialitzar un Ordinador a XML
    public void serializeOrdinador(Ordinador ordinador, String filename) {
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)))) {
            encoder.writeObject(ordinador);
            System.out.println("Ordinador serialitzat a XML: " + filename);
        } catch (IOException e) {
            System.err.println("Error en serialitzar Ordinador: " + e.getMessage());
        }
    }

    // 2. Deserialitzar un Ordinador des d'XML
    public Ordinador deserializeOrdinador(String filename) {
        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)))) {
            return (Ordinador) decoder.readObject();
        } catch (IOException e) {
            System.err.println("Error en deserialitzar Ordinador: " + e.getMessage());
            return null;
        }
    }

    // 3. Serialitzar una llista d'Ordinadors a XML
    public void serializeOrdinadors(List<Ordinador> ordinadors, String filename) {
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)))) {
            encoder.writeObject(ordinadors);
            System.out.println("Llista d'Ordinadors serialitzada a XML: " + filename);
        } catch (IOException e) {
            System.err.println("Error en serialitzar llista d'Ordinadors: " + e.getMessage());
        }
    }

    // 4. Deserialitzar una llista d'Ordinadors des d'XML
    public List<Ordinador> deserializeOrdinadors(String filename) {
        try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(filename)))) {
            return (List<Ordinador>) decoder.readObject();
        } catch (IOException e) {
            System.err.println("Error en deserialitzar llista d'Ordinadors: " + e.getMessage());
            return null;
        }
    }
}

