import javax.swing.*;
import java.awt.*;

public class AlgorithmFrame extends JFrame {



    public AlgorithmFrame(int width, int height){

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(width,height);

        ValueBars valueBars = new ValueBars();
        valueBars.setBounds(0,0,width,height);
        valueBars.setVisible(true);
        add(valueBars);


    }

}
