import se.lth.cs.pt.window.SimpleWindow;
import java.awt.Color;

public class SimpleWindowExample {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "Drawing Window");
		
	
		Color myColor = new Color(255,200,150);			//färgkod
		w.setLineColor(myColor);						//färg
		w.setLineWidth(10); 							//linjens tjocklek är 10px
		
		w.moveTo(50,50); 								//linjens punkt
		w.lineTo(50, 250);
		w.lineTo(250, 100);
		w.lineTo(50, 50);

		
		
		
	}
}