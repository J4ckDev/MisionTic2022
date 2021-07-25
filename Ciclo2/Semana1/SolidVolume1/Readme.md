# Volúmen de un Sólido 1

Para el sólido que se presenta a continuación

![Solido del problema](https://i.pinimg.com/originals/18/df/4a/18df4ae5cadfc8fdc4be264a97cf8226.png)

1. Establezca el modelo matemático (función matemática) que permita calcular el volumen del sólido anteriormente mostrado.
2. Escriba una función en Java que implemente la función anteriormente modelada, en la cual se invoque la constante matemática de la clase Math.
3. Para los valores _r1 = 3_, _h = 9/2_ y _r2 = 4_, calcule (a mano o con calculadora) el volúmen del sólido y compárelo con el resultado obtenido a partir de la evaluación de la función anteriormente implementada. ¿Qué pasa si se invoca la función con los mismos valores, pero _h_ se calcula como la expresión _h = 9//2_?

## Solución

El código se probó ingresando los siguientes valores:

- Radio esfera = 3
- Radio cono = 4
- Altura cono = 4.5

### 1. R/

```java
public static float sphereVolumeWithoutMathPI(float radius) {
    return (float) ((4 * 3.1416 * Math.pow(radius, 3)) / 3);
}

public static float coneVolumeWithoutMathPI(float radius, float height) {
    return (float) ((3.1416 * Math.pow(radius, 2) * height) / 3);
}

public static void main(String[] args) {
    float totalVolume = sphereVolumeWithoutMathPI(3) + coneVolumeWithoutMathPI(4, (float) 4.5);
    System.out.println(totalVolume);
}

/// Salida en consola

run:
188.496
```

### 2. R/

```java
public static float sphereVolume(float radius) {
    return (float) ((4 * Math.PI * Math.pow(radius, 3)) / 3);
}

public static float coneVolume(float radius, float height) {
    return (float) ((Math.PI * Math.pow(radius, 2) * height) / 3);
}

public static void main(String[] args) {
    float totalVolume = sphereVolume(3) + coneVolume(4, (float) 4.5);
    System.out.println(totalVolume);
}

/// Salida en consola

run:
188.49556
```

### 3. R/

Como en Java no existe la division entera, se crea la función `coneVolumeWithIntHeight` que recibe la altura del cono como un entero. En el main el valor es un float pero se le hace el casting a _4.5_, así se simula esa división entera de _9//2_.

```java
public static float coneVolumeWithIntHeight(float radius, int height) {
    return (float) ((3.1416 * Math.pow(radius, 2) * height) / 3);
}

public static void main(String[] args) {
    float totalVolume = sphereVolume(3) + coneVolumeWithIntHeight(4, (int) 4.5);
    System.out.println(totalVolume);
}

/// Salida en consola

run:
180.11813
```
Como se pudo observar, el volumen tiene un error de 8 unidades al pasarle una altura entera.
