package chapter11;

import java.awt.Color;
import resources.Canvas;

public class LineFractal{
    public static Canvas c = new Canvas("Line Fractal");
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
        c.drawLine(((int) (x1)), ((int) (y1)), ((int) ((x2+x1)/2-.1*(x2+x1)/2)), ((int) (y2)));
        c.drawLine(((int) (x2)), ((int) (y2)), ((int) ((x2+x1)/2+.1*(x2+x1)/2)), ((int) (y2)));
        c.drawLine(((int) (x2)), ((int) (y2)), ((int) ((x2+x1)/2+.1*(x2+x1)/2)), ((int) (y2)));
        if (i <= 0){
            return;
        }
        genFractal((x1+x2)/2-.05*(x1+x2), (y1+y2)/2, (x1+x2)/2, y1-.1*(x1+x2), i-1);
        genFractal((x1+x2)/2+.05*(x1+x2), (y1+y2)/2, (x1+x2)/2, y1-.1*(x1+x2), i-1);
    }
}