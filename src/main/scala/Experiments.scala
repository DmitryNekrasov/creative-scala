import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object Experiments extends App {
  val n = 64
  val diameter = 15
  val circles = for {
    i <- 0 until n
    circle = Image.circle(diameter).noStroke.fillColor(Color.hsl((i * 360 / n).degrees, 0.8, 0.6))
  } yield circle

  val resultImage = circles.reduceLeft((accum, img) => accum beside img)

  resultImage.draw()

  println(circles)
}
