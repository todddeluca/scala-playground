package com.todddeluca.batching

object Batcher {

  /**
   * Functionally batch a list into groups of size n.
   * @param n
   * @param seq
   * @tparam T
   * @return
   */
  def batch[T](n: Int, seq: List[T]): List[List[T]] = batch(n, List(), seq)

  def batch[T](n: Int, acc: List[T], seq: List[T]): List[List[T]] = seq match {
    case Nil => List(acc)
    case x :: xs =>
      if (acc.size < n)
        batch(n, x :: acc, xs)
      else
        acc :: batch(n, List(x), xs)
  }
}