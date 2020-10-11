import javax.swing.*;

public class AlgorithmFrame extends JFrame {



    public AlgorithmFrame(int width, int height, int[] array){

        setLayout(null);
        setVisible(true);
        setSize(width,height);

        ValueBars valueBars = new ValueBars(array);
        valueBars.setBounds(0,0,width,height);
        valueBars.setVisible(true);
        add(valueBars);


    }

}
