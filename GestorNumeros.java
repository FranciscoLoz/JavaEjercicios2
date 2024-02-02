import java.util.ArrayList;

public class GestorNumeros {
    private ArrayList<Integer> numeros;

    public GestorNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void agregarNumero(int numero) {
        this.numeros.add(numero);
    }

    public ArrayList<Integer> mostrarLista() {
        return this.numeros;
    }

    public int calcularSuma() {
        int suma = 0;
        for (int numero : this.numeros) {
            suma += numero;
        }
        return suma;
    }
}
