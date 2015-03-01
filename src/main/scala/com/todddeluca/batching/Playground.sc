

object Playground {
  import com.todddeluca.batching._

  val foo = "hi"
  val l1 = 1 to 10
  val b1 = Batcher.batch(3, l1.toList)

}