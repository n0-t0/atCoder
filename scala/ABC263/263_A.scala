object A {
    def main(args: Array[String]): Unit = {
        val sc = new java.util.Scanner(System.in)
        val list: List[String] = List.fill(5)(sc.next())
        val two = list.zipWithIndex.groupBy({case (str, i)=> str}).take(2).toList
        // println(two)
        val head = two(0)._2.size
        val tail = two(1)._2.size
        // println(head)
        // println(tail)
        if ((head == 3 && tail == 2)
            || (tail == 2 && head == 3)) {
            println("Yes")
        }
        else {
            println("No")
        }
    }
}