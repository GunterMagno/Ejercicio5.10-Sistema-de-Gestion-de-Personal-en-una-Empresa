
fun main() {
    val persona = Persona("Julia", 24)
    println(persona.toString())
    println(persona.celebrarCumple())

    val empleado = Empleado("Pablo", 30, 30000.0)
    println(empleado.toString())
    println(empleado.trabajar())

    val gerente = Gerente("Ana", 40, 50000.0, 8000.0, exentoImpuestos = true)
    println(gerente.toString())
    println(gerente.administrar())
}
