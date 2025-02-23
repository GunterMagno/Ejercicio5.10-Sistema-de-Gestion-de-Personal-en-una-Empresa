
class Gerente(nombre: String, edad: Int, salarioBase: Double, val bonus: Double, val exentoImpuestos: Boolean = false) : Empleado(nombre, edad, salarioBase) {

    override val porcentajeImpuestos: Double
        get() = 33.99

    override fun calcularSalario(): Double {
        val salarioConImpuestos = salarioBase * (1 - porcentajeImpuestos / 100)
        return if (exentoImpuestos) salarioBase + bonus else salarioConImpuestos + bonus
    }

    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus€, Exento de impuestos: $exentoImpuestos"
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}
