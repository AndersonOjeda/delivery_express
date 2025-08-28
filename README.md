# Delivery Express

## Integrantes
- Anderson Ojeda.

---

## ¿Cómo ejecutar el proyecto?

1. Abre una terminal en la carpeta principal del proyecto.
2. Compila los archivos fuente de Java (requiere Java 8+):

   ```sh
   javac -d out src/main/java/app/Main.java
   ```

3. Ejecuta la clase principal:

   ```sh
   java -cp out app.Main
   ```

---

## Breve explicación de cada parte

### app/Main.java
- Punto de entrada. Ejecuta las 4 partes del taller mediante `Ejercicios.parteA()`, `parteB()`, `parteC()`, y `parteD()`.

### colecciones/Ejercicios.java
- Contiene la lógica principal dividida en 4 partes:
  - **Parte A - Listas**: Uso de `ArrayList` y `LinkedList` para manejar pedidos y pedidos urgentes.
  - **Parte B - Conjuntos (`HashSet`)**: Elimina pedidos duplicados automáticamente.
  - **Parte C - Mapas (`HashMap`)**: Indexa pedidos por cliente y calcula el total gastado por cada uno.
  - **Parte D - Genéricos**: Utiliza métodos genéricos para filtrar listas de pedidos usando condiciones flexibles.

### colecciones/Utilidades.java
- Contiene métodos utilitarios genéricos, como `filtrar` para listas con cualquier condición.

### modelo/Pedido.java
- Clase POJO que representa un pedido. Implementa constructores, getters/setters, `toString`, `equals` y `hashCode`. Incluye el atributo de urgencia.

---

## Evidencia de ejecución

La evidencia de la ejecución del programa esta en `docs/Evidencia_consola.txt`. 
|imagen|
<img width="1422" height="446" alt="image" src="https://github.com/user-attachments/assets/793676c1-0bfa-4644-8bad-bee798005160" />

