import java.util.HashSet;

public class GestorColores {
    private HashSet<String> colores;

    public GestorColores() {
        this.colores = new HashSet<>();
    }

    public void agregarColor(String color) {
        this.colores.add(color);
    }

    public HashSet<String> mostrarColores() {
        return this.colores;
    }

    public boolean existeColor(String color) {
        return this.colores.contains(color);
    }
}