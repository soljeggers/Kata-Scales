//"return '6,2' when given the input '[5, 9], [1, 2, 6, 7]'" in {
//  ScaleBalancer.balance("[5,9],[1,2,6,7]") mustEqual "6,2"
//}

val input = "[3,4],[10]"

val fList = input.split("]\\, \\[").head.replaceAll("\\[", "").replace(",", "").replace(" ", "").map(c => c.toString.toInt).toList

val sList = input.split("]\\, \\[").tail.head
  .replaceAll("\\]", "").replace(",", "").replace(" ", "").map(c => c.toString.toInt).toList

val x = fList.head

val y = fList(1)

val checkList1 : List[Int] = sList.map(_ + x)
val checkListX = (x :: checkList1).toSet


val checkList2 : List[Int] = sList.map(_ + y)

val checkListY = (y :: checkList2).toSet

val m = checkListX.filter(checkListY).head

val a = m - x

val b = m - y

s"$a"






