import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class AnimatedSquare {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClicksSquare");

		while (true) {
			w.waitForMouseClick();		//inväntar musklick från anv
			w.clear();					//tar bort ev föregående(inget första gången)
										// tar emot musklick nr1 och nr2 och sparar värde i int
			int oldX = w.getMouseX();	
			int oldY = w.getMouseY();
			w.waitForMouseClick();
			int newX = w.getMouseX();
			int newY = w.getMouseY();

			int differenceY = (newY - oldY) / 10;	//beräknar ny position, div 10 pga 10 kv
			int differenceX = (newX - oldX) / 10;

			Square sq = new Square(w.getMouseX(), w.getMouseY(), 100);		//ritar kv

			for (int i = 0; i < 10; i++) {
				w.moveTo(oldX, oldY);
				Square sq2 = new Square(oldX, oldY, 100);			//ritar nästa kv

				sq2.move(differenceX * i, differenceY * i); 		//flyttar, ditar, fördröjer, tar bort
				sq2.draw(w);
				SimpleWindow.delay(100);
				sq2.erase(w);

			}
			sq.draw(w);

		}

	}
}