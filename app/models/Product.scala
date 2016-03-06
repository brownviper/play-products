package models

case class Product(ean: Long, name:String, description: String)

object Product {
  var products = Set(
    Product(1L, "Paperclips Large", "Large Plain Pack of 1000"),
    Product(2L, "Giant Paperclips", "Giant Plain 51mm 100 pack"),
    Product(3L, "Paperclip Giant Plain", "Giant Plain Pack of 10000"),
    Product(4L, "No Tear Paper Clip", "No Tear Extra Large Pack of 1000"),
    Product(5L, "Zebra Paperclips", "Zebra Length 28mm Assorted 150 Pack")
  )

  def findAll = products.toList.sortBy(_.ean)
}
