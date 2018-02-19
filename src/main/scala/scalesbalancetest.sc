//"return '6,2' when given the input '[5, 9], [1, 2, 6, 7]'" in {
//  ScaleBalancer.balance("[5,9],[1,2,6,7]") mustEqual "6,2"
//}

val input = "[5, 9], [1, 2, 6, 7]"

val fList = input.split("]\\, \\[").head.replaceAll("\\[", "").replace(",", "").replace(" ", "").map(c => c.toString.toInt).toList

val sList = input.split("]\\, \\[").tail.head
  .replaceAll("\\]", "").replace(",", "").replace(" ", "").map(c => c.toString.toInt).toList

val x = fList(0)

val y = fList(1)

val checkList1 : List[Int] = sList.map(_ + x)
val checkListX = (x :: checkList1).toSet

val checkList2 : List[Int] = sList.map(_ + y)

val checkListY = (y :: checkList2).toSet

val m = checkListX.filter(checkListY).head
val value1 = m - x
val value2 = m - y
s"$value1, $value2"






