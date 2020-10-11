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

        int x = 0;
        g.setColor(Color.WHITE);

        for(int i = 0; i < array.length; i++){
            g.fillRect(x + 1, 500 - array[i], 10, array[i]);

            x += 10;
        }

        g.setColor(Color.WHITE);

        JLabel jLabel = new JLabel("Press 'Enter' to sort");
        jLabel.setVisible(true);
        add(jLabel);

        repaint();
    }

}
