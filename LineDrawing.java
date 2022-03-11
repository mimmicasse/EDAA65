import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.moveTo(0, 0);
		while (true) {
			w.waitForMouseClick(); // inväntar musklick från användaren
			int mouseX = w.getMouseX(); // linje ritas från musklickets punkt
			int mouseY = w.getMouseY();
			
			w.lineTo(mouseX, mouseY); 
		}
	}
}
