fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    list.forEach { if (it % 2 == 0) toRemove.add(it) }
    toRemove.forEach{ list.remove(it) }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val toRemoveMap = mutableListOf<Map.Entry<String, Int>>()
    map.entries.forEach { if (it.value % 2 == 0) toRemoveMap.add(it) }
    toRemoveMap.forEach{map.remove(it.key)}
    println(map) // Output: {a=1, c=3}
} 