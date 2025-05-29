package OOPS.Inheritance

open class Shape(
    var name: String
) {
    val shapeNames = listOf<String>("Rectangle", "Triangle", "Circle", "Square")

    init {
        "${this.name} Created !"
    }

    fun isValid(): Boolean {
        return (
                if (this.name in shapeNames)
                    true
                else
                    false
                )
    }

    fun changeName(newName: String) {
        this.name = newName
    }
}