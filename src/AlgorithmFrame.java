import javax.swing.*;

public class AlgorithmFrame extends JFrame {



    public AlgorithmFrame(int width, int height){

        setLayout(null);
        setVisible(true);
        setSize(width,height);

        ValueBars valueBars = new ValueBars();
        valueBars.setBounds(0,0,width,height);
        valueBars.setVisible(true);
        add(valueBars);


    }

}
