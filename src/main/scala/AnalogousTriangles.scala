import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object AnalogousTriangles extends App {
  def triangle(spin: Int = 0): Image = {
    def h(x: Double): Double = x / 2 * scala.math.sqrt(3.0)

    val size = 150
    val stroke = 21
    val color = Color.darkSlateBlue.spin(-15.degrees)

    Image.triangle(size, h(size))
      .strokeWidth(stroke)
      .strokeColor(color.spin(spin.degrees))
      .fillColor(color.spin(spin.degrees).alpha(0.5.normalized))
  }

  val spin = 30
  triangle() above (triangle(-spin) beside triangle(spin)) draw()
}
