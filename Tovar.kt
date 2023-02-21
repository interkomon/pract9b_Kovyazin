package Products

open class Tovar(var name: String, var price: Double) {

    open fun GetInfo(){
        println("$name стоит $price ")
    }

}