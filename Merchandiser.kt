package Products

open class Merchandiser(var name:String) {

    fun AddProduct(tovar: Tovar){
        println("Товаровед $name добавил  товар ${tovar.name}")
    }
    fun Payment()
    {
        println("Товаровед $name зарегистрировал продажу")
        println("Оплата прошла успешно")
    }
    fun NotPayment(сlient: Сlient){
        println("Неоплата товара у  ${сlient.name}, человек попадает в черный список")
    }
}