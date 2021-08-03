# Problemas
1. Crear la clase persona que tenga como atributos nombre, edad y género (Hombre, Mujer), peso y altura. El constructor debe recibir todos los parámetros para su initialización.  
La clase debe tener los siguientes métodos:
    - `calcularIMC()`: Calculará y retornará el índice de masa corporal (IMC) de la persona.
    - `esMayorDeEdad()`: Retornará true si la persona es mayor de edad, false en caso contrario.
    - `toString()`: Devolverá toda la información del objeto en un String.
2. Crear la clase Contraseña que tenga como atributos Longitud (por defecto será 8) y Contraseña (String). El constructor debe recibir la longitud y generar una contraseña aleatoria con dicha longitud.  
La clase debe tener los siguientes métodos:
    - `esFuerte()`: Devuelve un booleano si es fuerte o no. Una contraseña se considera fuerte si tiene al menos una mayúscula, una minúscula, y más de cinco números.
    - `cambiarContraseña(String nuevaContraseña)`: Cambiará la contraseña actual por la indicada en los parámetros.
    - `toString()`: Devolverá toda la información del objeto en un String.
3. El objetivo será crear una clase **Triki** con el que se pueda jugar. Considere la siguiente matriz:

    ||||
    |:-:|:-:|:-:|
    |a|a|a|
    |a|a|a|
    |a|a|a|

    Cree la clase Triki que tenga como único atributo la matriz anteriormente contemplada.  
    El constructor no recibirá parámetros de entrada, y allí se inicializará la matriz con a's que indican que la casilla en cuestión está vacía.  
    La clase tendrá los siguientes métodos:
    - `marcarCasilla(String simbolo, int fila, int columna)`: Marcará el sı́mbolo indicado (lo ideal es que en el parámetro simbolo se pase un único caracter (X ó O). Dicho caracter se escribirá en la posición de la matriz (fila, columna).
    - `verificarGanador()`: Verificará si hay un ganador. Retornará el ganador (si lo hay) del juego, devolviendo el caracter que usó para ganar. Si no hay ganador aún se devolverá una "a" indicando que no hay un ganador.
    - `verificarCasilla(int fila, int columna)`:  Devolverá el caracter que hay en la casilla que está en la posición (fila, columna) de la matriz.

4. Considere el videojuego PacMan (1980). Se creará una simulación del personaje y el tablero. Para ello es necesario crear dos clases:
    - Clase PacMan: Tendrá la información del personaje.
    - Clase Tablero: Tendrá la información del tablero.

    Para la clase PacMan se deben definir como atributos el color (por defecto “Amarillo”), la puntuacion (por defecto 0) y las vidasRestantes (por defecto 3). El constructor debe recibir estos tres parámetros e inicializarlos.  
    Dicha clase tendrá los siguientes métodos:
    - `sumarPuntuacion()`: Cada vez que se llame este método, se sumará +1 a la puntuación.
    - `ObtenerPuntuación()`: Retornará la puntuación actual del personaje.
    - `restarVida()`: Cada vez que se llame este método, se restará -1 a las vidas.
    - `sigueVivo()`: Devolverá un booleano indicando si aún le quedan vidas para seguir jugando.

    Para la clase Tablero se requerirán dos atributos: el personaje (será un objeto de tipo PacMan) y el nivel. El constructor debe recibir el personaje (el cual debe haber sido creado anteriormente y pasarse como un parámetro en el constructor de la clase) e inicializar el nivel en 0.  
    Dicha clase tendrá el siguiente método:
    - `comprobarNivelActual()`: El funcionamiento es simple: cada 25 puntos del personaje equivalen a 1 nivel en el tablero. Este método obtendrá la puntuación del PacMan y fijará el nivel actual dependiendo de la cantidad de puntos que haya encontrado. (Por ejemplo, 57 puntos equivalen al nivel 2, 75 puntos al nivel 3, etc).
