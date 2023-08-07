fun main() {
    val Arreglo1 = arrayOf<String>("Arreglo1", "Arreglo2", "Arreglo3", "Arreglo4")
    val Lista1 = listOf("Lista1", "Lista2", "Lista3", "Lista4")

    println("Arreglo: ${Arreglo1[2]}")
    println("Lista: ${Lista1[2]}")

    println(Arreglo1.get(1))
    println(Lista1.indexOf("Lista2"))

    for (Arreglo1 in Lista1) {
        println(Arreglo1)
    }
    // Tambien podemos añadir elemento o remover con:
    val ListaMutable = mutableListOf("1", "2", "3", "4", "5", "6", "7", "8")

    ListaMutable.add("Prueba1")
    ListaMutable.remove("Prueba1")

}