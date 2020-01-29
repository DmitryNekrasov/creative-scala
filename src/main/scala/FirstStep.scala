import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object FirstStep extends App {
  val circle50 = Image.circle(50).fillColor(Color.red)
  val circle150 = Image.circle(150).fillColor(Color.blue)
  circle50 beside circle50 beside circle50 on circle150 draw()
}
