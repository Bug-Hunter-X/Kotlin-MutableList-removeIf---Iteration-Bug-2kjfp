fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    // Create a copy to avoid modification during iteration
    val evenNumbers = list.toMutableList().filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list) // Output: [1, 3, 5] 
    
    //Alternative solution using a different approach
    val list2 = mutableListOf(1,2,3,4,5)
    val newList = mutableListOf<Int>()
    for(i in list2){ 
        if(i%2 != 0) newList.add(i)
    }
    println(newList) //Output: [1,3,5]
} 