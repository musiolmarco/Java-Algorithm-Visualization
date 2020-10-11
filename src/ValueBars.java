import javax.swing.*;
import java.awt.*;

public class ValueBars extends JPanel {

    int array[];

    public ValueBars(int[] array){

        this.array = array;

    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        

        repaint();
    }

}
