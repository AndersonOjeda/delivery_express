package colecciones;

import java.util.*;
import java.util.function.Predicate;

public class Utilidades {
    // Método genérico
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
