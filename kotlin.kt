import kotlin.math.PI

fun main() {
    var opcion: Int
    do {
        // Mostrar el menú
        println("Seleccione una opción para calcular el área:")
        println("1. Cuadrado")
        println("2. Círculo")
        println("3. Triángulo")
        println("4. Salir")
        print("Opción: ")

        // Leer la opción del usuario
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                // Calcular el área de un cuadrado
                print("Ingrese el lado del cuadrado: ")
                val lado = readLine()?.toDoubleOrNull()
                if (lado != null && lado > 0) {
                    val area = lado * lado
                    println("El área del cuadrado es: $area")
                } else {
                    println("Por favor, ingrese un valor válido para el lado.")
                }
            }
            2 -> {
                // Calcular el área de un círculo
                print("Ingrese el radio del círculo: ")
                val radio = readLine()?.toDoubleOrNull()
                if (radio != null && radio > 0) {
                    val area = PI * radio * radio
                    println("El área del círculo es: $area")
                } else {
                    println("Por favor, ingrese un valor válido para el radio.")
                }
            }
            3 -> {
                // Calcular el área de un triángulo
                print("Ingrese la base del triángulo: ")
                val base = readLine()?.toDoubleOrNull()
                print("Ingrese la altura del triángulo: ")
                val altura = readLine()?.toDoubleOrNull()
                if (base != null && base > 0 && altura != null && altura > 0) {
                    val area = 0.5 * base * altura
                    println("El área del triángulo es: $area")
                } else {
                    println("Por favor, ingrese valores válidos para la base y altura.")
                }
            }
            4 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción inválida, por favor intente de nuevo.")
            }
        }

        // Espacio en blanco para una mejor visualización
        println()

    } while (opcion != 4)
}
