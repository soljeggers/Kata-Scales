class BalanceNotPossibleException extends Exception

object ScaleBalancer extends App {


  def balance(input: String): String = {

    val fListRegex = "[0-9]+".r



    val fList = input.split("]\\,\\[").head.replaceAll("\\[", "").replace(",", "").replace(" ", "").map(c => c.toString.toInt).toList

    val sList = input.split("]\\,\\[").tail.head
      .replaceAll("\\]", "").replace(",", "").replace(" ", "").map(c => c.toString.toInt).toList

    val x = fList.head
    val y = fList(1)

    val checkList1: List[Int] = sList.map(_ + x)
    val checkListX = (x :: checkList1).toSet

    val checkList2: List[Int] = sList.map(_ + y)
    val checkListY = (y :: checkList2).toSet

    val m = checkListX.filter(checkListY)
    if (m.isEmpty) {
      throw new BalanceNotPossibleException
    }

    val a = m.head - x
    val b = m.head - y

    println(m)


    if (b == 0) {
      s"$a"
    } else if (a == 0) {
      s"$b"
    } else {
      s"$a,$b"
    }
  }
}

/*
* A function that will return a String of one or two numbers which
* represent the values needed to balance a pair of weights on a scale.
*
* input format: "[1,2], [4,5,6]"
*  - [1,2] represents weights to be balanced
*  - [4,5,6] represents the weights available to achieve this balance
* */