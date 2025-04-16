package Array

fun main() {
    // immutable list
    val shList = listOf("Laptop", "SSD", "Laptop Cooler")

    // mutable list
    val shopList = mutableListOf("PC", "SSD", "Table")

    println(shList)
    println(shopList)

    println()
    // we cannot perform below action b'coz list is Immutable shList
    //shList.add("Or Bhot Kuch Ni")

    // Add at the end of the list
    shopList.add("Or Kuch Ni")
    println(shopList)

    println()

    // Add at 0th Index
    shopList.add(0, "Samosa")
    println(shopList)

    println()

    // remove element or element at index
    shopList.remove("Or Kuch Ni")
    shopList.removeAt(0)
    println(shopList)

    println()

    // Modifying Element at 0 Index
    // shopList[0] = "RGB Cabinet"
    shopList.set(0, "RGB Cabinet")
    // both above are equivalent to each other
    println(shopList)


    var ssd = shopList.contains("SSD")
    if (ssd) {
        println("Have SSD in List")
    } else {
        println("Doesn't have SSD in List")
    }

}