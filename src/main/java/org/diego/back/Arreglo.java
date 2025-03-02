package org.diego.back;

import org.diego.estudiante.Estudiante;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Arreglo {
    private ArrayList<Estudiante> estudiantes;

    public Arreglo() {
        estudiantes = new ArrayList<>();
    }

    public void addEstudiante(String nombre, double nota) {
        estudiantes.add(new Estudiante(nombre, nota));
    }

    public String getEstudiantes() {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < estudiantes.size(); i++) {
            lista.append(i).append(". ").append(estudiantes.get(i)).append("\n");
        }
        return lista.toString();
    }

    public void eliminarEstudiante(int index) {
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.remove(index);
        }
    }

    public double calcularPromedio() {
        if (estudiantes.isEmpty()) return 0;
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getNota();
        }
        return suma / estudiantes.size();
    }

    public Estudiante getNotaMasAlta() {
        return estudiantes.stream().max(Comparator.comparingDouble(Estudiante::getNota)).orElse(null);
    }

    public Estudiante getNotaMasBaja() {
        return estudiantes.stream().min(Comparator.comparingDouble(Estudiante::getNota)).orElse(null);
    }

    public void ordenarPorNota() {
        estudiantes.sort((e1, e2) -> Double.compare(e2.getNota(), e1.getNota()));
    }

    public Estudiante buscarEstudiante(String nombre) {
        Optional<Estudiante> encontrado = estudiantes.stream()
                .filter(e -> e.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
        return encontrado.orElse(null);
    }
}
