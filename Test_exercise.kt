package demo

import java.math.BigDecimal
import java.time.LocalDateTime

fun main(args : Array<String>){


    var myOrderAna = OrdersAnalyzer()

    //OrderLine(val productId: Int, val name: String, val quantity: Int, val unitPrice: BigDecimal)
    // {productId: 9872, name: 'Pencil', quantity: 3, unitPrice: 3.00}
    var orderLine1_1 = OrdersAnalyzer.OrderLine(9872,"Pencil",3,3.00.toBigDecimal())

    //    orderId: 554,
    //    creationDate: "2017-03-25T10:35:20", // Saturday
    // var myArr: ArrayList<OrdersAnalyzer.OrderLine> = arrayListOf<OrdersAnalyzer.OrderLine>(OrderLine1)
    var myArr = arrayListOf(orderLine1_1)
    var order_1 = OrdersAnalyzer.Order(554, LocalDateTime.parse("2017-03-25T10:35:20"), myArr )

//    {productId: 9872, name: 'Pencil', quantity: 2, unitPrice: 3.00},
//    {productId: 1746, name: 'Eraser', quantity: 1, unitPrice: 1.00}
    var orderLine2_1 = OrdersAnalyzer.OrderLine(9872,"Pencil",2,3.00.toBigDecimal())
    var orderLine2_2 = OrdersAnalyzer.OrderLine(1746,"Eraser",1,1.00.toBigDecimal())

//    orderId: 555,
//    creationDate: "2017-03-25T11:24:20", // Saturday
    // var myArr: ArrayList<OrdersAnalyzer.OrderLine> = arrayListOf<OrdersAnalyzer.OrderLine>(OrderLine1)
    var myArr2 = arrayListOf(orderLine2_1,orderLine2_2)
    var order_2 = OrdersAnalyzer.Order(555, LocalDateTime.parse("2017-03-25T11:24:20"), myArr2 )

//    orderId: 453,
//    creationDate: "2017-03-27T14:53:12", // Monday
//    orderLines: [
//    {productId: 5723, name: 'Pen', quantity: 4, unitPrice: 4.22},
//    {productId: 9872, name: 'Pencil', quantity: 3, unitPrice: 3.12},
//    {productId: 3433, name: 'Erasers Set', quantity: 1, unitPrice: 6.15}
    var orderLine3_1 = OrdersAnalyzer.OrderLine(5723,"Pen",4,4.22.toBigDecimal())
    var orderLine3_2 = OrdersAnalyzer.OrderLine(9872,"Pencil",3,3.12.toBigDecimal())
    var orderLine3_3 = OrdersAnalyzer.OrderLine(3433,"Erasers Set",1,6.15.toBigDecimal())
    var myArr3 = arrayListOf(orderLine3_1,orderLine3_2,orderLine3_3)
    var order_3 = OrdersAnalyzer.Order(453, LocalDateTime.parse("2017-03-27T14:53:12"), myArr3 )

//    orderId: 431,
//    creationDate: "2017-03-20T12:15:02", // Monday
//    orderLines: [
//    {productId: 5723, name: 'Pen', quantity: 7, unitPrice: 4.22},
//    {productId: 3433, name: 'Erasers Set', quantity: 2, unitPrice: 6.15}
    var orderLine4_1 = OrdersAnalyzer.OrderLine(5723,"Pen",7,4.22.toBigDecimal())
    var orderLine4_2 = OrdersAnalyzer.OrderLine(3433,"Erasers Set",2,6.15.toBigDecimal())
    var myArr4 = arrayListOf(orderLine4_1,orderLine4_2)
    var order_4 = OrdersAnalyzer.Order(431, LocalDateTime.parse("2017-03-20T12:15:02"), myArr4 )

//    orderId: 690,
//    creationDate: "2017-03-26T11:14:00", // Sunday
//    orderLines: [
//    {productId: 9872, name: 'Pencil', quantity: 4, unitPrice: 3.12},
//    {productId: 4098, name: 'Marker', quantity: 5, unitPrice: 4.50}
    var orderLine5_1 = OrdersAnalyzer.OrderLine(9872,"Pencil",4,3.12.toBigDecimal())
    var orderLine5_2 = OrdersAnalyzer.OrderLine(4098,"Marker",5,4.50.toBigDecimal())
    var myArr5 = arrayListOf(orderLine5_1,orderLine5_2)
    var order_5 = OrdersAnalyzer.Order(690, LocalDateTime.parse("2017-03-26T11:14:00"), myArr5 )


    var myOrderList = arrayListOf(order_1,order_2,order_3,order_4,order_5)

    for( x in myOrderAna.totalDailySales(myOrderList) ){
        if( x.value != 0){
            //println("\"DayOfWeek." + x.key.toString() + "\"" + " : " + x.value.toString())
            println("\"DayOfWeek.${x.key}\" : ${x.value}")
        }
    }
}

