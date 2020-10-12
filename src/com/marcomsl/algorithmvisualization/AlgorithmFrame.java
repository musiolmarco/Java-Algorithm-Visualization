package com.marcomsl.algorithmvisualization;

import javax.swing.*;
import java.awt.*;

public class AlgorithmFrame extends JFrame {

    int size;


    public AlgorithmFrame(int[] array){

        size = array.length * 10 + 10;

        setLayout(null);
        setVisible(true);
        setResizable(false);
        setTitle("Sorting Algorithm Visualization - Marco Musiol");
        setIconImage(new ImageIcon("assets/icon.png").getImage());
        setBackground(Color.DARK_GRAY);
        setSize(size, size);

        ValueBars valueBars = new ValueBars(array, size);
        valueBars.setBounds(0,0,size, size);
        valueBars.setVisible(true);
        valueBars.setBackground(Color.DARK_GRAY);
        add(valueBars);


    }

}
