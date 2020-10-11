import javax.swing.*;
import java.awt.*;

public class AlgorithmFrame extends JFrame {

    int size;


    public AlgorithmFrame(int[] array, int[] sortAlgorithm){

        size = array.length * 10 + 15;

        setLayout(null);
        setVisible(true);
        setBackground(Color.BLACK);
        setSize(size, size);
        addKeyListener(new KeyHandler(sortAlgorithm, array));

        ValueBars valueBars = new ValueBars(array);
        valueBars.setBounds(0,0,size, size);
        valueBars.setVisible(true);
        valueBars.setBackground(Color.BLACK);
        add(valueBars);


    }

}
