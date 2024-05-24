/**
 * Блогер поставил условие: 10% от стоимости проданных товаров он забирает себе в качестве премии.
 * Нужно рассчитать в отчёте сумму гонорара и пересчитать чистую прибыль.*/

fun main() {

    val bloggerName = "Оксана"
    val costPerVideo = 35000
    val productCommerceName = "фитнес-браслет"
    val purchaseCommerceProductPrice = 700
    val sellingCommerceProductPrice = 2400
    val amountOfVideoView = 370000
    val followingLink = 3250
    val purchasedCommerceProduct = 153
    val bloggersFee = purchasedCommerceProduct * sellingCommerceProductPrice / 100 * 10

    val adCampaignReport = """
        Имя блогера: $bloggerName.
        Платёж за ролик: $costPerVideo рублей.
        Товар: $productCommerceName.
        Цена закупки товара: $purchaseCommerceProductPrice рублей.
        Цена продажи покупателю: $sellingCommerceProductPrice рублей.
        Просмотров видео: $amountOfVideoView.
        Переходов по ссылке: $followingLink.
        Покупок товара: $purchasedCommerceProduct.
        Премия блогера: $bloggersFee.
    """.trimIndent()

    println(adCampaignReport)
}