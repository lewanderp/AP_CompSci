package chapter11;

import java.awt.Color;
import resources.Canvas;

public class LineFractal{
    public static Canvas c = new Canvas("Line Fractal");
    //DO NOT RUN THIS WILL NOT END WELL FOR ANYONE THERE IS NO END CUE
    public static void main (String [] args) throws InterruptedException {
        c.setVisible(true);
        c.setSize(1000, 500);
        for (int i = 0; i<5; i++){
            drawBackground();
            c.setInkColor(Color.white);
            c.drawString("" + i, 10, 20);
            genFractal(250, 250, 750, 250, i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new InterruptedException("Sleep Failes :(");
            }
        }
    }
    public static void drawBackground() {
        c.setInkColor(Color.black);
        c.drawFilledRectangle(0, 0, 1000, 500);
    }
    public static void genFractal(double x1, double y1, double x2, double y2, double i) {
        c.setInkColor(Color.cyan);
        // int X1 = ((int) (x1));
        // int Y1 = ((int) (y1));
        // int X2 = ((int) (x2));
        // int Y2 = ((int) (y2));
        // int x3 = ((int) ((1/6.0)*(x2-x1)+x1)); 
        // int y3 = ((int) ((y1+y2)/2));
        // int x4 = ((int) (x2-(1/6.0)*(x2-x1)));
        // int y4 = ((int) ((y1+y2)/2));
        // int x5 = ((int) ((x1+x2)/2));
        // int y5 = ((int) (y1+(1/6.0)*(x2-x1)));
       // c.drawLine(X1, Y1, x3, y3);
        if (i <= 0){
            return;
        }
        genFractal((x1+x2)/2-.05*(x1+x2), (y1+y2)/2, (x1+x2)/2, y1-.1*(x1+x2), i-1);
        genFractal((x1+x2)/2+.05*(x1+x2), (y1+y2)/2, (x1+x2)/2, y1-.1*(x1+x2), i-1);
    }
}