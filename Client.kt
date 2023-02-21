package Products

open class Сlient(var name:String){
    open fun Col(tovar: Tovar, num:Int){
        try {
            var col = 0
            var newprice = 0.0
            while (col <= 0) {
                println("Введите количество товара, которое хотите купить ${tovar.name}")
                col = readLine()!!.toInt()
                if (col <= 0) println("Меньше 1 нельзя купить")
            }
            newprice = col * tovar.price
            println("Заказ номер $num оформлен. Заказ на имя $name. Общая сумма  составит $newprice")
        }
        catch (e:Exception)
        {
            println("Ошибка. Провеьте, все ли введено верно")
        }
    }
}