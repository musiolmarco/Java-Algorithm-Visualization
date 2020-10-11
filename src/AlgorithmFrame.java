import javax.swing.*;
import java.awt.*;

public class AlgorithmFrame extends JFrame {



    public AlgorithmFrame(int[] array){

        setLayout(null);
        setVisible(true);
        setBackground(Color.BLACK);
        setSize(array.length * 10 + 10,array.length * 10 + 10);

        ValueBars valueBars = new ValueBars(array);
        valueBars.setBounds(0,0,array.length * 10 + 10,array.length * 10 + 10);
        valueBars.setVisible(true);
        valueBars.setBackground(Color.BLACK);
        add(valueBars);


    }

}
