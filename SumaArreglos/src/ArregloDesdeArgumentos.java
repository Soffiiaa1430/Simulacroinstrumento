import java.util.HashMap;
import javax.swing.JOptionPane;

public class ArregloDesdeArgumentos {
    public static void main(String[] args) {

        int tamaño1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo 1"));
        int[] arreglo1 = new int[tamaño1];

        for (int i = 0; i < tamaño1; i++) {
            arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor " + (i + 1) + " del arreglo 1"));
        }

        int tamaño2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo 2"));
        int[] arreglo2 = new int[tamaño2];

        for (int i = 0; i < tamaño2; i++) {
            arreglo2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor " + (i + 1) + " del arreglo 2"));
        }

        HashMap<Integer, Integer> arreglo3 = new HashMap<>();

        for (int i = 0; i < Math.min(tamaño1, tamaño2); i++) {
            arreglo3.put(i, arreglo1[i] + arreglo2[i]);
        }

        mostrarArreglo(arreglo1, "1");
        mostrarArreglo(arreglo2, "2");
        mostrarHashMap(arreglo3, "3");
    }

    public static void mostrarArreglo(int[] arreglo, String nombreArreglo) {
        System.out.println("Contenido del arreglo " + nombreArreglo + ":");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(nombreArreglo + "[" + i + "]: " + arreglo[i]);
        }
    }

    public static void mostrarHashMap(HashMap<Integer, Integer> hashMap, String nombreHashMap) {
        System.out.println("Contenido del HashMap " + nombreHashMap + ":");
        for (Integer key : hashMap.keySet()) {
            System.out.println(nombreHashMap + "[" + key + "]: " + hashMap.get(key));
        }
    }
}
