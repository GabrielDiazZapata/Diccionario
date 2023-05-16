import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diccionario {
    private Map<Character, List<String>> palabrasPorInicial;

    public Diccionario() {
        palabrasPorInicial = new HashMap<>();
    }

    public void agregarPalabra(String palabra) {
        if (palabra.length() > 0) {
            char inicial = palabra.charAt(0);
            List<String> palabras = palabrasPorInicial.getOrDefault(inicial, new ArrayList<>());
            palabras.add(palabra);
            palabrasPorInicial.put(inicial, palabras);
            System.out.println("Palabra agregada correctamente al diccionario.");
        } else {
            System.out.println("La palabra no puede estar vacía.");
        }
    }

    public void mostrarPalabrasPorInicial(char inicial) {
        List<String> palabras = palabrasPorInicial.get(inicial);
        if (palabras != null) {
            System.out.println("Palabras con inicial '" + inicial + "':");
            for (String palabra : palabras) {
                System.out.println(palabra);
            }
        } else {
            System.out.println("No hay palabras con esa inicial en el diccionario.");
        }
    }
}
