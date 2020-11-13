import java.awt.event.WindowAdapter;






import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Game extends JFrame {
	
	
	
		
	JFrame frame;
	
	
	
	
	
		Game() {
			
			
		super("Moving Cube");
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		
				
		
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				
				int result = JOptionPane.showConfirmDialog(frame, "Do you want exit ?", 
						"Exit Confirmation : ", JOptionPane.YES_NO_OPTION);
				
				if (result == JOptionPane.YES_OPTION) {
					
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
					
					else if (result == JOptionPane.NO_OPTION) {
						
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
						
					}
					
				}
			
			
		});
				
			}
		
	




		public static void main(String[] args) {
			
			Game game = new Game();
			game.setVisible(true);
			
			second s = new second();
			game.add(s);
		}
		
		}
		

		
		



		


