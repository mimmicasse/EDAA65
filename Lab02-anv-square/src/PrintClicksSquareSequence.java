import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class PrintClicksSquareSequence {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClicksSquare");		//ritfönster

		while (true) {
			w.waitForMouseClick();		
			w.clear();

			int oldX = w.getMouseX();
			int oldY = w.getMouseY();
			w.waitForMouseClick();
			int newX = w.getMouseX();
			int newY = w.getMouseY();

			int difference = (oldX - newX) / 10;
			int differenceY = (oldY - newY) / 10;		//tar emot musklick, beräknar ny koordinat, sparar värde

			Square sq = new Square(w.getMouseX(), w.getMouseY(), 100);		//skapar kv

			for (int i = 0; i < 10; i++) {
				Square sq2 = new Square(w.getMouseX(), w.getMouseY(), 100);	//skapar kv2

				sq2.move(difference * i, differenceY * i);		//flyttar
				sq2.draw(w);									//ritar

			}
			sq.draw(w);											//ritar

		}

	}
}