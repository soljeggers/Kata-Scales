class BalanceNotPossibleException extends Exception

object ScaleBalancer {

  def balance(input: String): String = {


    val fList = input.split("]\\,\\[").head.replaceAll("\\[", "").replace(",", "").replace(" ", "").map(c => c.toString.toInt).toList

    val sList = input.split("]\\,\\[").tail.head
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

    if (value1 == 0){
      s"$value2"
    } else if (value2 == 0) {
      s"$value1"
    } else {
      s"$value1,$value2"
    }

    s"$value1,$value2"


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