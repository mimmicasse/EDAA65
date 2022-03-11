import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class PrintClicksSquare {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClicksSquare");		//ritfönster

		while (true) {
			w.waitForMouseClick();				//väntar på muskick
			w.clear();							//tar bort ev förgående (ej fösta gng)

			Square sq = new Square(w.getMouseX(), w.getMouseY(), 100); //skapar kv vid musklick

			sq.draw(w);							//ritar kv
		}
	}
}