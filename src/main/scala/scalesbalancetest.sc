//"return '6,2' when given the input '[5, 9], [1, 2, 6, 7]'" in {
//  ScaleBalancer.balance("[5,9],[1,2,6,7]") mustEqual "6,2"
//}

val input = "[5,9],[1,2,6,7]"

val fListRegex = "[0-9]+".r

val fList = fListRegex.findAllMatchIn(input).toList.splitAt(2)


val x = fList._2
val y = fList._1


println(y)
println(x)







