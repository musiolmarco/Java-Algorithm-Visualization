package com.marcomsl.algorithmvisualization;

import javax.swing.*;
import java.awt.*;

public class ValueBars extends JPanel {

    private int[] array;
    private int size;
    private BarColor barColor;


    public ValueBars(int[] array, int size, BarColor barColor){

        this.array = array;
        this.size = size;
        this.barColor = barColor;

    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if(barColor == null){
            g.setColor(Color.BLACK);
            g.fillRect(0,0,size,size);
        }


        int x = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] / 2<= 255 && array[i] / 2 >= 0){

                if(barColor == BarColor.GREEN){
                    g.setColor(new Color(0,array[i] / 2,0));
                }else if(barColor == BarColor.RED){
                    g.setColor(new Color(array[i] / 2,0,0));
                }else if(barColor == BarColor.BLUE){
                    g.setColor(new Color(0,0,array[i] / 2));
                }else{
                    g.setColor(Color.WHITE);
                }

            }else{
                g.setColor(Color.WHITE);
            }

            g.fillRect(x , size - 60 - array[i], 10, array[i] + 30);

            x += 10;
        }

        g.setColor(Color.WHITE);



        repaint();
    }

}
