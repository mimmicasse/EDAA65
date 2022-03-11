import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class DrawThreeSquares {
	public static void main(String[] args) {

		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare"); // ritfönstert

		//w = null;

		Square sq = new Square(250, 250, 100); // kvadrat 1
		sq.draw(w); // ritar kv 1

		Square sq2 = new Square(250, 250, 100); // kv 2
		sq2.move(40, -20); // flyttar
		sq2.draw(w); // ritar

		Square sq3 = new Square(250, 250, 100); // kv3
		sq3.move(30, 30); // flyttar
		sq3.draw(w); // ritar

	}
}
