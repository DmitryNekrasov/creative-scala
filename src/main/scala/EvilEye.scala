import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object EvilEye extends App {
  val r = 21
  val stroke = 5
  Image.circle(r * 2).fillColor(Color.black) on
    Image.circle(4 * r).fillColor(Color.cornflowerBlue) on
    Image.circle(6 * r).fillColor(Color.white) on
    Image.circle(10 * r).fillColor(Color.darkBlue) strokeWidth stroke draw()
}
