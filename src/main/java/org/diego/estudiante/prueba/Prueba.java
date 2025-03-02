package org.diego.test;

import org.diego.back.Arreglo;
import org.diego.estudiante.Estudiante;

public class Prueba {
    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo();

        arreglo.addEstudiante("Diego", 95.5);
        arreglo.addEstudiante("María", 88.7);
        arreglo.addEstudiante("Luis", 76.3);
        arreglo.addEstudiante("Ana", 99.0);
        arreglo.addEstudiante("Pedro", 60.5);

        System.out.println("Lista de estudiantes:");
        System.out.println(arreglo.getEstudiantes());

        System.out.println("Promedio de la clase: " + arreglo.calcularPromedio());

        Estudiante max = arreglo.getNotaMasAlta();
        if (max != null)
            System.out.println("Nota más alta: " + max.getNota() + " - Estudiante: " + max.getNombre());

        Estudiante min = arreglo.getNotaMasBaja();
        if (min != null)
            System.out.println("Nota más baja: " + min.getNota() + " - Estudiante: " + min.getNombre());

        arreglo.ordenarPorNota();
        System.out.println("Lista ordenada por nota (mayor a menor):");
        System.out.println(arreglo.getEstudiantes());

        Estudiante buscado = arreglo.buscarEstudiante("María");
        if (buscado != null)
            System.out.println("Estudiante encontrado: " + buscado);
        else
            System.out.println("Estudiante no encontrado.");
    }
}
