/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carreon.benites.erica.mp06.uf01.xml.ordinadors;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FITXER_INDIVIDUAL = "Fitxers/ordinador.xml";
    private static final String FITXER_LLISTA = "Fitxers/ordinadors.xml";

    public static void main(String[] args) {
        // Crear objectes Ordinador
        Ordinador ordinador1 = new Ordinador("12345ABC", "Dell", "XPS 13", 16, 512, "Intel i7");
        Ordinador ordinador2 = new Ordinador("67890DEF", "HP", "Pavilion", 8, 256, "AMD Ryzen 5");

        // Crear una llista d'Ordinadors
        List<Ordinador> ordinadors = new ArrayList<>();
        ordinadors.add(ordinador1);
        ordinadors.add(ordinador2);

        // Instanciar la lògica
        OrdinadorLogic logic = new OrdinadorLogic();

        // 1. Serialitzar i gravar un Ordinador a XML
        logic.serializeOrdinador(ordinador1, FITXER_INDIVIDUAL);

        // 2. Serialitzar i gravar una llista d'Ordinadors a XML
        logic.serializeOrdinadors(ordinadors, FITXER_LLISTA);

        // 3. Llegir i deserialitzar un Ordinador des d'XML
        Ordinador deserializedOrdinador = logic.deserializeOrdinador(FITXER_INDIVIDUAL);
        System.out.println("\nOrdinador deserialitzat des de fitxer XML:");
        System.out.println(deserializedOrdinador);

        // 4. Llegir i deserialitzar una llista d'Ordinadors des d'XML
        List<Ordinador> deserializedOrdinadors = logic.deserializeOrdinadors(FITXER_LLISTA);
        System.out.println("\nLlista d'Ordinadors deserialitzada des de fitxer XML:");
        for (Ordinador ordinador : deserializedOrdinadors) {
            System.out.println(ordinador);
        }
    }
}
