/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ordenar_apellidos {

    public static void main(String[] args) {
        // Crear una lista de apellidos aleatorios
        List<String> apellidos = new ArrayList<>();
        apellidos.add("Smith");
        apellidos.add("Johnson");
        apellidos.add("Brown");
        apellidos.add("Jones");
        apellidos.add("Davis");
        apellidos.add("Wilson");
        apellidos.add("Miller");

        // Barajar la lista de apellidos para hacerla aleatoria
        Collections.shuffle(apellidos);

        System.out.println("Apellidos desordenados:");
        System.out.println(apellidos);

        // Llamar a la función para ordenar los apellidos usando el método de inserción
        ordenarApellidos(apellidos);

        System.out.println("Apellidos ordenados:");
        System.out.println(apellidos);
    }

    public static void ordenarApellidos(List<String> listaApellidos) {
        int n = listaApellidos.size();
        for (int i = 1; i < n; i++) {
            String apellidoActual = listaApellidos.get(i);
            int j = i - 1;
            while (j >= 0 && apellidoActual.compareTo(listaApellidos.get(j)) < 0) {
                listaApellidos.set(j + 1, listaApellidos.get(j));
                j--;
            }
            listaApellidos.set(j + 1, apellidoActual);
        }
    }
}
