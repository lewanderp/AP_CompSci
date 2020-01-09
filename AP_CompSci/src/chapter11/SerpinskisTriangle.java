package chapter11;

import java.awt.Color;
import resources.Canvas;

public class SerpinskisTriangle {
    public static Canvas c = new Canvas("Serpinski's Triangle");
    public static void main (String [] args) throws InterruptedException {
        c.setSize(1500, 750);
        c.setVisible(true);
        drawBackground();
        for(int i = 0; i < 8; i++){
            drawBackground();
            c.setInkColor(Color.cyan);
            serpinskisTriangle(i, 200, 600, 750, 50);
            c.setInkColor(Color.white);
            c.setFontSize(20);
            c.drawString(""+(i+1), 10, 20);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new InterruptedException("Sleep Failes :(");
            }
        }
    }
    public static void drawBackground(){
        c.setInkColor(Color.black);
        c.drawFilledRectangle(0, 0, 1500, 750);
    }
    public static void serpinskisTriangle(int i, int x1, int y1, int x2, int y2){
        c.setInkColor(Color.cyan);
        int x3 = x2+(x2-x1);
        int y3 = y1;
        c.drawLine(x1, y1, x2, y2);
        c.drawLine(x2, y2, x3, y3);
        c.drawLine(x3, y3, x1, y1);
        if(i <= 0){
            return;
        }
        int xmid1 = (x1+x2)/2;
        int xmid2 = (x3+x2)/2;
        int ymid = (y1+y2)/2;
        serpinskisTriangle(i-1, x1, y1, xmid1, ymid);
        serpinskisTriangle(i-1, xmid1, ymid, x2, y2);
        serpinskisTriangle(i-1, x2, y1, xmid2, ymid);
    }
}