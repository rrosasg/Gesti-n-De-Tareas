import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al gestor de tareas");

        ArrayList<Task> listaDeTareas = new ArrayList<>();

        cambiarEstadoTarea(listaDeTareas, 0, true);
    }

    public static void cambiarEstadoTarea(ArrayList<Task> lista, int indice, boolean nuevoEstado) {
        if (indice >= 0 && indice < lista.size()) {
            lista.get(indice).completed = nuevoEstado;
            System.out.println("Estado de la tarea '" + lista.get(indice).title + "' actualizado a: " + nuevoEstado);
        }
    }

    public static void eliminarTarea(ArrayList<Task> lista, int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println("Tarea eliminada correctamente.");
        }
    }
}