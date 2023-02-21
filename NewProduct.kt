package Products

open class NewProduct(name: String, var info:String, var guarantee:Int, price:Double) : Tovar(name, price){
    override fun GetInfo(){
        println("$name стоит $price \nИнформация о данном товаре: $info\nГарантия $guarantee мес")
    }
}