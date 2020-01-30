import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

import scala.annotation.tailrec

object SierpinskiTriangle extends App {
  def sierpinskiTriangle(n: Int, size: Int = 20): Image = sierpinskiTriangle(n, Image.triangle(size, size))

  @tailrec
  def sierpinskiTriangle(n: Int, triangle: Image): Image =
    n match {
      case 0 => triangle
      case _ => sierpinskiTriangle(n - 1, triangle above (triangle beside triangle))
    }

  val triangle = sierpinskiTriangle(8, 2)

  triangle.draw()
}
