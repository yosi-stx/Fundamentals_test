package demo

import java.math.BigDecimal
import java.time.DayOfWeek
import java.time.LocalDateTime


class OrdersAnalyzer {
    data class Order(val orderId: Int, val creationDate: LocalDateTime, val orderLines: List<OrderLine>)

    data class OrderLine(val productId: Int, val name: String, val quantity: Int, val unitPrice: BigDecimal)

    fun totalDailySales(orders: List<Order>): Map<DayOfWeek, Int> {
        var retMap: HashMap<DayOfWeek, Int>
        retMap = HashMap<DayOfWeek, Int>()

        for( day in DayOfWeek.values()){
            retMap[day] = 0
        }

        for (order in orders) {
            for (product in order.orderLines){
                // "!!" says that I am sure the variable is not null.
                 retMap[order.creationDate.dayOfWeek] = retMap[order.creationDate.dayOfWeek]!! + product.quantity
            }
        }

        return retMap
    }

}