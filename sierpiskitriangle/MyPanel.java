
package sierpiskitriangle;
import java.awt.BasicStroke;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;
import java.awt.Graphics2D;
import java.awt.Dimension;


public class MyPanel extends JPanel {
    public MyPanel() {
        this.setVisible(true);
        this.setPreferredSize(new Dimension(600, 600));
    }
    
    public void paint(Graphics g) {
        Random rand = new Random();
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(5));
        
        // Pondo pontos principáis
        
        int[] p1 = {300, 0};        
        int[] p2 = {0, 595};        
        int[] p3 = {600, 595};
        
        g2D.drawLine(300, 0, 300, 2); // ponto 1
        g2D.drawLine(0, 595, 0, 597); // ponto 2
        g2D.drawLine(600, 595, 600, 597); // ponto 3
        
        // Processamento para criação do triangulo
        
        // Criando o primeiro ponto aleatório
        
        int[] p0;
        for(int i = 0; i < 2; i++) {
            int p00 = rand.nextInt();
            int p01 = rand.nextInt();
            
            if(p00 == p01){
                i--;
            }
            else {
                switch(p00) {
                    case 0: 
                }
            }
                    
        }
        
        // Criação aleatoria
        
        for(int i = 0; i < 1000; i++) {
            int[] beta;
            switch(rand.nextInt(3)) {
                case 0: beta = criarPonto(p1);
                break;
                case 1: beta = criarPonto(p2);
                break;
                case 2: beta = criarPonto(p3);
                break;
            }
            
        }
        
    }
    
    private static int[] criarPonto(int[] p) {
        int[] alpha = {0, 0};
        
        return alpha;
    }
    
    
}
