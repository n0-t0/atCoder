import scala.annotation.tailrec

object B {
    def main(args: Array[String]): Unit = {
        val sc = new java.util.Scanner(System.in)
        val n = sc.nextInt()
        val list = List.fill(n-1)(sc.nextInt()).toSeq
        val k = rec(list.reverse, 0)
        println(k+1)
    }
    def rec(ls: Seq[Int], acc: Int): Int = {
        @tailrec
        val head = ls.head
        val rev = ls.reverse.take(head-1)
        if(head == 1) {
            return acc
        }
        else {
            rec(rev.reverse, acc+1)
        }
    }
}