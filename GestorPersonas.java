import java.util.HashMap;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

public class GestorPersonas {
    private HashMap<String, Persona> personas;

    public GestorPersonas() {
        this.personas = new HashMap<>();
    }

    public void agregarPersona(String nombre, int edad) {
        this.personas.put(nombre, new Persona(nombre, edad));
    }

    public String mostrarPersona(String nombre) {
        if (this.personas.containsKey(nombre)) {
            return this.personas.get(nombre).toString();
        } else {
            return "La persona con el nombre " + nombre + " no existe en el mapa.";
        }
    }

    public boolean existePersona(String nombre) {
        return this.personas.containsKey(nombre);
    }
}
