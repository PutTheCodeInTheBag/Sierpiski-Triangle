
package sierpiskitriangle;
import javax.swing.JFrame;

public class window {
    JFrame frame;
    MyPanel myP = new MyPanel();
    
    public window() {
        frame = new JFrame();
        
        frame.add(myP);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.pack();
    }
}
