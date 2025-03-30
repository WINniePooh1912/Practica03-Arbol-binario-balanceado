# Practica 03 - Árbol Binario Balanceado - Estructuras de Datos y Algoritmia

## Descripción

Este proyecto implementa un **Árbol Binario Balanceado** en Java. Un árbol binario balanceado es una estructura de datos de tipo árbol donde las alturas de los subárboles izquierdo y derecho de cualquier nodo difieren como máximo en 1. Esto se logra mediante rotaciones, asegurando que el árbol permanezca balanceado durante las operaciones de inserción.

Este proyecto utiliza un **Árbol AVL**, que es un tipo de árbol binario balanceado, para agregar, equilibrar y recorrer los elementos. El programa permite visualizar tanto el árbol imbalanced (no balanceado) como el balanced (balanceado) utilizando distintos recorridos de árboles como Preorden, Postorden e Inorden.

## Estructuras Implementadas

- **Árbol Binario**:
  - **Inserción balanceada**: Agrega elementos al árbol de manera balanceada utilizando rotaciones (derecha e izquierda) para mantener la propiedad del AVL.
  - **Recorridos**: Implementa los tres recorridos más comunes de árboles binarios:
    - **Preorden**: Primero visita la raíz, luego el subárbol izquierdo y después el subárbol derecho.
    - **Postorden**: Primero visita los subárboles izquierdo y derecho, luego la raíz.
    - **Inorden**: Visita primero el subárbol izquierdo, luego la raíz y finalmente el subárbol derecho.

## Funcionalidades

- **Agregar Elementos**: Los elementos son agregados al árbol y automáticamente balanceados mediante rotaciones.
- **Mostrar Árbol**: Muestra el árbol de manera jerárquica y balanceada, con diferentes estilos de recorrido.
- **Recorridos**: Permite ver el árbol mediante los recorridos de Preorden, Postorden e Inorden tanto para el árbol balanceado como para el árbol imbalanced.
- **Mostrar Árbol Horizontal**: Visualiza la estructura del árbol de manera horizontal para una representación visual clara de su jerarquía.

## Estructura del Proyecto

El proyecto consta de las siguientes clases:

1. **Main.java**: Contiene la lógica principal del programa y la interacción con el usuario. Realiza la inserción de elementos en el árbol, y muestra los recorridos y las representaciones del árbol balanceado e imbalanced.
2. **Tree.java**: Implementa el árbol binario balanceado con métodos para agregar elementos, realizar los recorridos y balancear el árbol mediante rotaciones.
3. **Otros métodos y utilidades**: Dentro de `Tree.java`, se implementan métodos como la inserción recursiva, las rotaciones para balancear el árbol y las funciones de recorrido.

## Instrucciones de Uso

1. **Clonar o descargar el repositorio**:
   - Clona este repositorio en tu máquina local o descarga los archivos.

2. **Compilar el proyecto**:
   - Abre una terminal o un IDE (como IntelliJ IDEA o Eclipse).
   - Asegúrate de que los archivos estén en el mismo directorio o paquete.
   - Compila el proyecto ejecutando el siguiente comando:
     ```bash
     javac *.java
     ```

3. **Ejecutar el programa**:
   - Ejecuta el archivo `Main.java` para iniciar el programa:
     ```bash
     java Main
     ```

4. **Interactuar con el programa**:
   - El programa realiza la inserción de elementos en el árbol de manera automática y muestra los resultados de los diferentes recorridos y representaciones del árbol balanceado e imbalanced.
