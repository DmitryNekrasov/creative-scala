import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object StreetsAhead extends App {
  val scale = 30

  val underTheDoor = Image.rectangle(scale, scale / 3).noStroke.fillColor(Color.red)
  val door = Image.rectangle(scale / 3, scale / 3 * 2).noStroke.fillColor(Color.black)
  val houseBlock = Image.rectangle(scale, scale).noStroke.fillColor(Color.red) under (underTheDoor above door)
  val roof = Image.triangle(scale, scale * scala.math.sqrt(3) / 2).noStroke.fillColor(Color.brown)
  val house = roof above houseBlock

  val treeTrunk = Image.rectangle(scale / 3, scale / 3 * 2).noStroke.fillColor(Color.brown)
  val leafs = Image.circle(scale * (scala.math.sqrt(3) / 2 + 1.0 / 3)).noStroke.fillColor(Color.green)
  val tree = leafs above treeTrunk

  val yellowPiece = Image.rectangle(scale / 3 * 2, scale / 10).noStroke.fillColor(Color.yellow)
  val blackPiece = Image.rectangle(scale / 3, scale / 10).noStroke.fillColor(Color.black)
  val road = (yellowPiece beside blackPiece beside yellowPiece beside blackPiece beside yellowPiece beside blackPiece) above
    Image.rectangle(3 * scale, scale / 5).noStroke.fillColor(Color.black)

  val image = house beside tree above road

  val street = (for {
    _ <- 0 until 15
  } yield image).reduceLeft((acc, img) => acc beside img)

  street.draw()
}
