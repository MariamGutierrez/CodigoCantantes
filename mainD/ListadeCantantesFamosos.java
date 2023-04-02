/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListadeCantantesFamosos {
    HashMap<Integer, HashMap<String, Integer>> discos = new HashMap<Integer, HashMap<String, Integer>>();
    HashMap<Integer, String> cantantes = new HashMap<Integer, String>();
    Scanner sc = new Scanner(System.in);

    public ListadeCantantesFamosos() {
    }

    public void ingresarCantante(int id, String name) {
        cantantes.put(id, name);
    }

public void ingresarDiscos(int idCantante, String nombreDisco, int ventas) {
    if (!discos.containsKey(idCantante)) {
        discos.put(idCantante, new HashMap<String, Integer>());
    }
    discos.get(idCantante).put(nombreDisco, ventas);
}

public void imprimir() {
    System.out.println("Cantantes:");
    for (int id : cantantes.keySet()) {
        String nombre = cantantes.get(id);
        System.out.println("\n"+"- ID: " + id + " - Nombre: " + nombre);
        System.out.println("Discos:");
        if (discos.containsKey(id)) {
            HashMap<String, Integer> discosCantante = discos.get(id);
            for (String nombreDisco : discosCantante.keySet()) {
                int ventas = discosCantante.get(nombreDisco);
                System.out.println("-- Nombre: " + nombreDisco + " - Ventas: " + ventas);
            }
        } else {
            System.out.println("-- El cantante no tiene discos registrados.");
        }
    }
}
public void discoMasVendido() {
    for (int cantanteId : discos.keySet()) {
        String cantanteNombre = cantantes.get(cantanteId);
        int maxVentas = 0;
        String discoMasVendido = "";
        for (Map.Entry<String, Integer> disco : discos.get(cantanteId).entrySet()) {
            if (disco.getValue() > maxVentas) {
                maxVentas = disco.getValue();
                discoMasVendido = disco.getKey();
            }
        }
        System.out.println("El disco más vendido de " + cantanteNombre + " es '" + discoMasVendido + "' con " + maxVentas + " ventas.");
    }
}
}
   

