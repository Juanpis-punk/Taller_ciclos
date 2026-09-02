# Ciclos - Programas en Java

## Integrantes
- Esteban Gonzalez
- Juan Pablo
- Emmanuel Ríos

## Descripción
Este proyecto contiene programas desarrollados en Java como parte del taller de ciclos, aplicando estructuras repetitivas (`for`, `while`, `do-while`) junto con validación de datos ingresados por el usuario mediante `try-catch`.

## Herramientas utilizadas
- **Lenguaje:** Java (JDK 26.0.2.1)
- **Editor:** Visual Studio Code
- **Extensiones de VS Code:**
  - Extension Pack for Java (Microsoft) — para compilar, ejecutar y depurar los programas
  - Code Runner — ejecución rápida de código (configurado para correr en terminal integrada)
- **Terminal:** PowerShell (integrada en VS Code)

## Estructura del proyecto
```
ciclos/
├── AdivinaNumero.java       # Juego de adivinar un número aleatorio entre n y m
├── tabla.java               # Tabla de multiplicar con ciclo infinito (clase Tabla)
├── Calculos.java            # Menú infinito con 4 calculadoras distintas
├── CiclosInfinitos.java     # Ejemplos comentados de distintas formas de hacer un ciclo infinito
├── Sprimo.java              # Cálculo del n-esimo número primo y suma con un número dado
├── PromedioNumeros.java     # Cálculo del promedio entre n números
└── README.md
```

## Descripción de los programas

### 1. AdivinaNumero.java
El usuario define un rango `[n, m]`. El programa genera un número aleatorio dentro de ese rango y el usuario debe adivinarlo. En cada intento se indica si el número es mayor o menor, y al final se muestra cuántos intentos fueron necesarios.

### 2. tabla.java
Solicita un número al usuario y muestra su tabla de multiplicar del 1 al 10. Está dentro de un ciclo infinito (`while(true)`): después de mostrar una tabla, vuelve a preguntar por otro número. El programa finaliza cuando el usuario ingresa `0`.

### 3. Calculos.java
Menú infinito (`do-while`) que se mantiene activo hasta que el usuario elige salir. Opciones disponibles:
1. Calcular el n-esimo número de la secuencia de Fibonacci.
2. Calcular el n-esimo número primo y sumarlo a un número dado por el usuario.
3. Calcular las raíces de una ecuación cuadrática (a partir de A, B y C).
4. Calcular el promedio entre n números.
5. Salir del programa.

Cada opción valida las entradas del usuario (números enteros, decimales y valores mayores que 0 según corresponda) usando `try-catch` para evitar cierres inesperados.

### 4. CiclosInfinitos.java
Archivo de referencia/estudio que muestra, a manera de ejemplo, 5 formas distintas de escribir un ciclo infinito en Java: `while(true)`, `for(;;)`, `do-while(true)`, una condición que siempre es verdadera, y una variable booleana de control. Los ejemplos están comentados intencionalmente para que el archivo no quede corriendo indefinidamente al ejecutarlo.

### 5. Sprimo.java
Pide un número cualquiera y una posición `p`, calcula el número primo que ocupa esa posición y lo suma al número ingresado.

### 6. PromedioNumeros.java
Pide la cantidad de números que se desea ingresar y calcula la suma y el promedio de todos ellos.

## Cómo compilar y ejecutar
Desde la terminal, ubicado en la carpeta del proyecto:

```bash
javac NombreDelArchivo.java
java NombreDelArchivo
```

Ejemplo:
```bash
javac Calculos.java
java Calculos
```

> **Nota:** el nombre del archivo `.java` debe coincidir exactamente (mayúsculas incluidas) con el nombre de la clase pública que contiene.

## Validaciones incluidas
- Manejo de excepciones (`try-catch`) para evitar que los programas se cierren si el usuario ingresa un dato no numérico.
- Limpieza del buffer de entrada (`sc.nextLine()`) tras un error de lectura.
- Validación de rangos y cantidades (ej. que el límite inferior sea menor que el superior, o que la cantidad de números a promediar sea mayor que 0).
- Ciclos infinitos con condición de salida controlada (ej. ingresar `0` para salir o elegir la opción "Salir" del menú).
