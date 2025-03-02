package org.diego;

import org.diego.back.Arreglo;

public class Main {
    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo();
        arreglo.addEstudiante("Diego", 95.5);
        arreglo.addEstudiante("María", 88.7);
        arreglo.addEstudiante("Carlos", 72.3);

        System.out.println("Lista de Estudiantes:");
        System.out.println(arreglo.getEstudiantes());

        System.out.println("Nota promedio: " + arreglo.calcularPromedio());
        System.out.println("Nota más alta: " + arreglo.getNotaMasAlta());
        System.out.println("Nota más baja: " + arreglo.getNotaMasBaja());

        arreglo.ordenarPorNota();
        System.out.println("\nEstudiantes ordenados por nota (Mayor a Menor):");
        System.out.println(arreglo.getEstudiantes());

        System.out.println("\nBuscar estudiante 'María':");
        System.out.println(arreglo.buscarEstudiante("María"));
    }
}