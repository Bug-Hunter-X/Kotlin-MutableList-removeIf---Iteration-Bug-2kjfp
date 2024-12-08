fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code intends to remove even numbers from a list. However, it modifies the list while iterating, which leads to unexpected behavior. The `removeIf` function removes the element *during* the iteration, so the index is shifted.

For example, if it removes 2, the index of 4 will shift to the previous location of 2 and may be skipped.