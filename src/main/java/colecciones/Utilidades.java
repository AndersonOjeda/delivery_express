package colecciones;

import java.util.*;
import java.util.function.Predicate;

/**
 * Clase con métodos de utilidad usando genéricos.
 */
public class Utilidades {

    /**
     * Método genérico que filtra elementos de una lista según una condición.
     * @param lista Lista de elementos a filtrar.
     * @param condicion Condición para filtrar elementos.
     * @param <T> Tipo genérico de la lista.
     * @return Lista filtrada con elementos que cumplen la condición.
     */
    public static <T> List<T> filtrar(List<T> lista, Predicate<T> condicion) {
        List<T> resultado = new ArrayList<>();
        for (T elem : lista) {
            if (condicion.test(elem)) {
                resultado.add(elem);
            }
        }
        return resultado;
    }
}
