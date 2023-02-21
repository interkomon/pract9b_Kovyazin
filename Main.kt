import Products.*

fun main(){
    println("Вы в магазине <<ХозТовары>> ")
    var
        payment = ""
    var merchandiser = Merchandiser("Виктор Петрович")
    var onecl = Сlient("Томас")
    var twocl = Сlient("Мария")
    var trcl = Сlient("Татьяна")
    var onetov = Tovar("Мыло", 100.0)
    var twotov = Tovar("Шампунь", 300.0)
    var trutov = Tovar("Зубная щетка", 180.0)
    merchandiser.AddProduct(onetov)
    merchandiser.AddProduct(twotov)
    merchandiser.AddProduct(trutov)
    var tovarone = NewProduct( "${onetov.name}","Для мытья рук и не только",5,100.0)
    println(tovarone.GetInfo())
    onecl.Col(onetov, 456)
    var tovartwo = NewProduct("${twotov.name}","Для волос и тела ", 10, 300.0 )
    println(tovartwo.GetInfo())
    twocl.Col(twotov, 876)
    var tovarthree = NewProduct("${trutov.name}", "Для чистки зубов", 7, 180.0 )
    println(tovarthree.GetInfo())
    trcl.Col(trutov, 765)
    while(
        payment!= "Да" &&

        payment!= "Нет") {
        println("${onecl.name} оплатил заказ?")

        payment = readLine()!!.toString()
        if (
        payment == "Да") merchandiser.Payment()
        else if (
        payment == "Нет") merchandiser.NotPayment(onecl)
        else println("Ошибка, проверьте правильно ли написали")
    }

        payment = ""
    while(
        payment!= "Да" &&
        payment!= "Нет") {
        println("${twocl.name} оплатил заказ?")

        payment = readLine()!!.toString()
        if (
        payment == "Да") merchandiser.Payment()
        else if (
        payment == "Нет") merchandiser.NotPayment(twocl)
        else println("Ошибка, проверьте правильно ли написали")
    }

        payment = ""
    while(
        payment!= "Да" &&
        payment!= "Нет") {
        println("${trcl.name} оплатил заказ(Да или Нет)?")

        payment = readLine()!!.toString()
        if (
        payment == "Да") merchandiser.Payment()
        else if (
        payment == "Нет") merchandiser.NotPayment(trcl)
        else println("Ошибка, проверьте правильно ли написали")
    }
}