import java.util.HashMap;
import java.util.Map;

public class GestorEmpleados {
    private Map<String, Empleado> empleados;

    public GestorEmpleados() {
        this.empleados = new HashMap<>();
    }

    public void agregarEmpleado(String nombre, double salario) {
        Empleado empleado = new Empleado(nombre, salario);
        empleados.put(nombre, empleado);
    }

    public Empleado obtenerEmpleado(String nombre) {
        return empleados.get(nombre);
    }

    public boolean existeEmpleado(String nombre) {
        return empleados.containsKey(nombre);
    }

    public static class Empleado {
        private String nombre;
        private double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }

        @Override
        public String toString() {
            return "Empleado{" +
                    "nombre='" + nombre + '\'' +
                    ", salario=" + salario +
                    '}';
        }
    }
}
