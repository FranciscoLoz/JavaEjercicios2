import java.util.HashSet;
import java.util.Objects;

class Estudiante {
    String nombre;
    int id;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return id == that.id && nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + id;
    }
}

public class GestorEstudiantes {
    private HashSet<Estudiante> estudiantes;

    public GestorEstudiantes() {
        this.estudiantes = new HashSet<>();
    }

    public void agregarEstudiante(String nombre, int id) {
        this.estudiantes.add(new Estudiante(nombre, id));
    }

    public HashSet<Estudiante> mostrarEstudiantes() {
        return this.estudiantes;
    }

    public boolean existeEstudiante(String nombre, int id) {
        return this.estudiantes.contains(new Estudiante(nombre, id));
    }
}
