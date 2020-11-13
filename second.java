import java.awt.Color;


import java.awt.Graphics;






import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import javax.swing.Timer;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class second extends JPanel implements ActionListener, KeyListener {
			
			Timer t = new Timer(5,this);
			double x, y, velx = 0, vely = 0;
			
			boolean collision = false;
			
			
				second() {
				

				t.start();
				setSize(500,500);
				
				addKeyListener(this);
				setFocusable(true);
				setFocusTraversalKeysEnabled(false);
				setBorder(BorderFactory.createLineBorder(Color.red));
				
				
				
			}
			
			
			public void paintComponent(Graphics g) {
				
				
				super.paintComponent(g);
				Graphics2D g2 = (Graphics2D) g;
				g2.fill(new Rectangle2D.Double(x,y, 40, 40));
				
				
				
			}
			
			
			public void actionPerformed(ActionEvent e) {
				
				repaint();
				
				
				
				x+=velx;
				y+=vely;
				
			}
			
			


			public void up() {
				vely = - 1.5;
				velx = 0;
			}
			
			public void down() {
				vely = 1.5;
				velx = 0;
			}
			
			public void left() {
				velx = -1.5;
				vely = 0;
			}
			
			public void right() {
				velx = 1.5;
				vely = 0;
			}
			
			
			public void keyPressed(KeyEvent e) {
				
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_UP) {
					up();
				}
				if (code == KeyEvent.VK_DOWN) {
					down();
				}
				if (code == KeyEvent.VK_LEFT) {
					left();
				}
				if (code == KeyEvent.VK_RIGHT) {
					right();
				}
				
			}
			
			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {
				vely = 0;
				velx = 0;
				
			}
			
}