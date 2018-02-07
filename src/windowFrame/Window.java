package windowFrame;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;

public class Window {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("ChartMapping v Enoch");
		frame.setSize(800, 400);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
	}

}
