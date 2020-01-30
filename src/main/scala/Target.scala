import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Target extends App {
  val r = 35
  val stroke = 3
  val target = (Image.circle(r * 2).fillColor(Color.red) on
    Image.circle(r * 4).fillColor(Color.white) on
    Image.circle(r * 6).fillColor(Color.red)).strokeWidth(stroke)

  val stand = (Image.rectangle(r / 2, 2 * r) above
    Image.rectangle(2 * r, r / 2))
    .fillColor(Color.brown)
    .strokeWidth(stroke)

  val land = Image.rectangle(8 * r, 2 * r)
    .noStroke
    .fillColor(Color.green)

  target above stand above land draw()
}
