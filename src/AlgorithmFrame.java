import javax.swing.*;
import java.awt.*;

public class AlgorithmFrame extends JFrame {



    public AlgorithmFrame(int width, int height, int[] array){

        setLayout(null);
        setVisible(true);
        setBackground(Color.BLACK);
        setSize(width,height);

        ValueBars valueBars = new ValueBars(array);
        valueBars.setBounds(0,0,width,height);
        valueBars.setVisible(true);
        valueBars.setBackground(Color.BLACK);
        add(valueBars);


    }

}
