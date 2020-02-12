package resources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;

/**
 * Class Canvas - a class to allow for simple graphical drawing on a canvas.
 *
 * @author Bruce Quig
 * @author Michael Kolling (mik)
 * @author Dave Musicant - made some local changes
 * @author Amy Csizmar Dalal - more minor local changes to allow for subclassing
 *         and Swing elements
 * @author Jeff Ondich - added setFontSize and getInkColor
 * @author David Liben-Nowell - renamed fillX() and height/width parameters;
 *         renamed wait() to pause()
 * @author Brian Due - triangle method 2011
 */

@SuppressWarnings("unused")
public class Canvas {
    private JFrame frame;
    protected CanvasPane canvas;
    private Graphics2D graphic;
    private Color backgroundColor;
    private Color inkColor;
    private Image canvasImage;
    private Point clickedPoint; // IAT
    private Point currentMousePoint;

    /**
     * Create a Canvas with default height, width and background color (300, 300,
     * white).
     * 
     * @param title title to appear in Canvas Frame
     */
    public Canvas(String title) {
        this(title, 300, 300, Color.white);
    }

    /**
     * Create a Canvas with default title, height, width and background color
     * ("Canvas", 300, 300, white).
     */
    public Canvas() {
        this("Canvas", 300, 300, Color.white);
    }

    /**
     * Create a Canvas with default background Color (white).
     * 
     * @param title  title to appear in Canvas Frame
     * @param width  the desired width for the canvas
     * @param height the desired height for the canvas
     */
    public Canvas(String title, int width, int height) {
        this(title, width, height, Color.white);
    }

    /**
     * Create a Canvas.
     * 
     * @param title   title to appear in Canvas Frame
     * @param width   the desired width for the canvas
     * @param height  the desired height for the canvas
     * @param bgColor the desired background color of the canvas
     */
    public Canvas(String title, int width, int height, Color bgColor) {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.addMouseListener(new ShapeListener()); // IAT
        canvas.addMouseMotionListener(new MotionListener());
        canvas.addKeyListener(new MyKeyListener());
        canvas.setFocusable(true);
        backgroundColor = bgColor;
        inkColor = Color.black;
        frame.pack();

        // Added by acd: this is a hack that will allow other components,
        // like buttons, to be added to the canvas and be visible.
        // basically, it's saying "when you repaint, don't fill the entire
        // canvas with the background color", i.e. leave the buttons and
        // stuff alone!
        canvas.setOpaque(false);
        // end of hack

        // Closes the window "neatly" when exiting the program.
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });

        if (graphic == null) {
            // first time: instantiate the offscreen image and fill it with
            // the background color
            Dimension size = canvas.getSize();
            canvasImage = canvas.createImage(size.width, size.height);
            graphic = (Graphics2D) canvasImage.getGraphics();
            graphic.setColor(backgroundColor);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(inkColor);
        }
    }

    /**
     * Sets the "pen" (outline) color for the Canvas.
     * 
     * @param newColor The color to which to set the pen/drawing tool.
     */
    public void setInkColor(Color newColor) {
        inkColor = newColor;
        graphic.setColor(inkColor);
    }

    /**
     * Returns the current pen color.
     */
    public Color getInkColor() {
        return inkColor;
    }

    /**
     * Set the canvas visibility and brings canvas to the front of screen when made
     * visible. This method can also be used to bring an already visible canvas to
     * the front of other windows.
     * 
     * @param visible true if the canvas should appear on the screen, false
     *                otherwise
     */
    public void setVisible(boolean visible) {
        /*
         * if (visible) frame.show(); else frame.hide();
         */
        // EDITED BY ACD: show() and hide() are deprecated in
        // Java 1.5; replace with setVisible(boolean)
        frame.setVisible(visible);
    }

    /**
     * Provide information on visibility of the Canvas.
     * 
     * @return true if canvas is visible, false otherwise
     */
    public boolean isVisible() {
        return frame.isVisible();
    }

    /**
     * Draw a given shape onto the canvas.
     * 
     * @param shape the shape object to be drawn on the canvas
     */
    private void draw(Shape shape) {
        graphic.draw(shape);
        canvas.repaint();
    }

    /**
     * Fill the internal dimensions of a given shape with the current foreground
     * color of the canvas.
     * 
     * @param shape the shape object to be filled
     */
    private void fill(Shape shape) {
        graphic.fill(shape);
        canvas.repaint();
    }

    /**
     * Erase the whole canvas.
     */
    public void erase() {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Erase a given shape's interior on the screen.
     * 
     * @param shape the shape object to be erased
     */
    private void erase(Shape shape) {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.fill(shape); // erase by filling background color
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Erases a given shape's outline on the screen.
     * 
     * @param shape the shape object to be erased
     */
    private void eraseOutline(Shape shape) {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.draw(shape); // erase by drawing background color
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Draws an image onto the canvas.
     * 
     * @param image the Image object to be displayed
     * @param x     x coordinate for Image placement
     * @param y     y coordinate for Image placement
     * @return true if the image was completely and correctly loaded, false
     *         otherwise
     */
    private boolean drawImage(Image image, int x, int y) {
        boolean result = graphic.drawImage(image, x, y, null);
        canvas.repaint();
        return result;
    }

    /**
     * Draws a String on the Canvas.
     * 
     * @param text the String to be displayed
     * @param x    x coordinate for text placement
     * @param y    y coordinate for text placement
     */
    public void drawString(String text, int x, int y) {
        graphic.drawString(text, x, y);
        canvas.repaint();
    }

    /**
     * Erases a String on the Canvas.
     * 
     * @param text the String to be displayed
     * @param x    x coordinate for text placement
     * @param y    y coordinate for text placement
     */
    public void eraseString(String text, int x, int y) {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.drawString(text, x, y);
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Draws an Intager on the Canvas
     * 
     * @param int the intager to be displayed
     * @param x   x coordinate
     * @param y   y coordinate
     */
    public void drawInt(int num, int x, int y) {
        setInkColor(Color.black);
        String toPrint = "" + num + "";
        graphic.drawString(toPrint, x, y);
        canvas.repaint();
    }

    /**
     * Erases an Intager on the Canvas.
     * 
     * @param int the intager to be erased
     * @param x   x coordinate
     * @param y   y coordinate
     */
    public void eraseInt(int num, int x, int y) {
        String toPrint = "" + num + "";
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.drawString(toPrint, x, y);
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Draws a "Point" object on the Canvas.
     * 
     * @param p1 is a Point from mouse click Convert to its x and y coordinates and
     *           draw
     */
    public void drawPoint(Point p1) {
        graphic.drawLine((int) p1.getX(), (int) p1.getY(), (int) p1.getX(), (int) p1.getY());
        canvas.repaint();
    }

    /**
     * Draws a line on the Canvas.
     * 
     * @param x1 x coordinate of start of line
     * @param y1 y coordinate of start of line
     * @param x2 x coordinate of end of line
     * @param y2 y coordinate of end of line
     */
    public void drawLine(int x1, int y1, int x2, int y2) {
        graphic.drawLine(x1, y1, x2, y2);
        canvas.repaint();
    }

    /**
     * * Draws a line on the Canvas, parameters two "points".
     * 
     * @param p1 Point 1 clicked
     * @param p2 Point 2 clicked Convert each "point" object to its x, y coordinates
     */

    public void drawLine(Point p1, Point p2) {
        graphic.drawLine((int) p1.getX(), (int) p1.getY(), (int) p2.getX(), (int) p2.getY());
        canvas.repaint();
    }

    /**
     * Draws a rectangle on the Canvas.
     * 
     * @param x      x coordinate of top left corner
     * @param y      y coordinate of top left corner
     * @param width  width
     * @param height height
     */
    public void drawRectangle(int x, int y, int width, int height) {
        graphic.draw(new Rectangle(x, y, width, height));
        canvas.repaint();
    }

    /**
     * Draws a filled rectangle on the Canvas.
     * 
     * @param x      x coordinate of top left corner
     * @param y      y coordinate of top left corner
     * @param width  width
     * @param height height
     */
    public void drawFilledRectangle(int x, int y, int width, int height) {
        graphic.fill(new Rectangle(x, y, width, height));
        canvas.repaint();
    }

    /**
     * Draws a triangle on the Canvas. @parameters, three coordinate points
     * 
     * @param x1, y1 point2: x2, y2 point3: x3, y3
     *
     */
    public void drawTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        graphic.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        graphic.drawLine((int) x2, (int) y2, (int) x3, (int) y3);
        graphic.drawLine((int) x1, (int) y1, (int) x3, (int) y3);
        canvas.repaint();
    }

    /**
     * Draws a polygon on the Canvas.
     * 
     * @param xs   array of x coordinates of polygon points
     * @param ys   array of y coordinates of polygon points
     * @param size the number of points (vertices) in the polygon
     */
    public void drawPolygon(int[] xs, int[] ys, int size) {
        graphic.draw(new Polygon(xs, ys, size));
        canvas.repaint();
    }

    /**
     * Draws a filled polygon on the Canvas.
     * 
     * @param xs   array of x coordinates of polygon points
     * @param ys   array of y coordinates of polygon points
     * @param size the number of points (vertices) in the polygon
     */
    public void drawFilledPolygon(int[] xs, int[] ys, int size) {
        graphic.fill(new Polygon(xs, ys, size));
        canvas.repaint();
    }

    /**
     * Erases a rectangle on the Canvas.
     * 
     * @param x      x coordinate of top left corner
     * @param y      y coordinate of top left corner
     * @param width  width
     * @param height height
     */
    public void eraseRectangle(int x, int y, int width, int height) {
        eraseOutline(new Rectangle(x, y, width, height));
    }

    /**
     * Draws an oval on the Canvas.
     * 
     * @param x      x coordinate of top left corner
     * @param y      y coordinate of top left corner
     * @param width  width
     * @param height height
     */
    public void drawOval(int x, int y, int width, int height) {
        graphic.draw(new Ellipse2D.Double(x, y, width, height));
        canvas.repaint();
    }

    /**
     * Draws a filled oval on the Canvas.
     * 
     * @param x      x coordinate of top left corner
     * @param y      y coordinate of top left corner
     * @param width  width
     * @param height height
     */
    public void drawFilledOval(int x, int y, int width, int height) {
        graphic.fill(new Ellipse2D.Double(x, y, width, height));
        canvas.repaint();
    }

    /**
     * Erases an oval on the Canvas.
     * 
     * @param x      x coordinate of top left corner
     * @param y      y coordinate of top left corner
     * @param width  width
     * @param height height
     */
    public void eraseOval(int x, int y, int width, int height) {
        eraseOutline(new Ellipse2D.Double(x, y, width, height));
    }

    /**
     * Sets the foreground color of the Canvas.
     * 
     * @param newColor the new color for the foreground of the Canvas
     */
    private void setForegroundColor(Color newColor) {
        graphic.setColor(newColor);
    }

    /**
     * Returns the current color of the foreground.
     * 
     * @return the color of the foreground of the Canvas
     */
    private Color getForegroundColor() {
        return graphic.getColor();
    }

    /**
     * Sets the background color of the Canvas.
     * 
     * @param newColor the new color for the background of the Canvas
     */
    private void setBackgroundColor(Color newColor) {
        backgroundColor = newColor;
        graphic.setBackground(newColor);
    }

    /**
     * Fills in the Canvas (background) with the specified color.
     * 
     * @param newColor the new color for the background of the Canvas
     */
    public void fillBackground(Color newColor) {
        Dimension size = canvas.getSize();
        backgroundColor = newColor;
        graphic.setColor(backgroundColor);
        graphic.fillRect(0, 0, size.width, size.height);
        graphic.setColor(inkColor);
    }

    /**
     * Returns the current color of the background
     * 
     * @return the color of the background of the Canvas
     */
    private Color getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * changes the current Font used on the Canvas
     * 
     * @param newFont new font to be used for String output
     */
    public void setFont(Font newFont) {
        graphic.setFont(newFont);
    }

    /**
     * Returns the current font of the canvas.
     * 
     * @return the font currently in use
     **/
    public Font getFont() {
        return graphic.getFont();
    }

    /**
     * Sets the point size of the current font to the specified value. The style and
     * font family remain the same.
     *
     * @param newSize the new point size
     */
    public void setFontSize(int newSize) {
        Font f = graphic.getFont().deriveFont((float) newSize);
        setFont(f);
    }

    /**
     * Sets the size of the canvas.
     * 
     * @param width  new width
     * @param height new height
     */
    public void setSize(int width, int height) {
        canvas.setPreferredSize(new Dimension(width, height));
        Image oldImage = canvasImage;
        canvasImage = canvas.createImage(width, height);

        graphic = (Graphics2D) canvasImage.getGraphics();
        graphic.setColor(backgroundColor);
        graphic.fillRect(0, 0, width, height);
        graphic.setColor(inkColor);
        graphic.drawImage(oldImage, 0, 0, null);
        frame.pack();
    }

    /**
     * Returns the size of the canvas.
     * 
     * @return The current dimension of the canvas
     */
    private Dimension getSize() {
        return canvas.getSize();
    }

    /**
     * Pauses for a specified number of milliseconds before finishing. This provides
     * an easy way to specify a small delay which can be used when producing
     * animations.
     * 
     * @param milliseconds the delay amount
     */
    public void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            // ignoring exception at the moment
        }
    }

    public Point waitForClick() {
        Point ret = null;
        do {
            ret = clickedPoint;
            pause(1);
        } while (ret == null);
        clickedPoint = null;
        return ret;
    }

    // basically a wait for click, but instead whenever mouse moves

    public Point hoverPoint() {
        Point ret = null;
        do {
            ret = currentMousePoint;
            pause(1);
        } while (ret == null);
        currentMousePoint = null;
        return ret;
    }

    // returns the clicked point
    public Point getClickedPoint() {
        return clickedPoint;
    }

    // erases the point
    public void nullifyClickedPoint() {
        clickedPoint = null;
    }

    // gets the current hover point
    public Point getHoverPoint() {
        return currentMousePoint;
    }

    // erases the current hover point
    public void nullifyHoverPoint() {
        currentMousePoint = null;
    }

    // not super effective, but gets colors
    public Color getPixelColor(int x_, int y_) {
        Color tmp = null;
        try {
            Robot rb = new Robot();
            tmp = rb.getPixelColor(x_, y_);
            // System.out.println("Red=" + tmp.getRed() + " Blue=" + tmp.getBlue() + "
            // Green=" + tmp.getGreen());
        } catch (AWTException e1) {
            e1.printStackTrace();
        }
        return tmp;
    }

    public String currentKey = "a";

    // gets keys that were typed
    public String getKey() {

        currentKey = "";
        String tmp = currentKey;
        return tmp;
    }

    private boolean upIsPressed;
    private boolean downIsPressed;
    private boolean leftIsPressed;
    private boolean rightIsPressed;

    public boolean getUp() {
        return upIsPressed;
    }

    public boolean getDown() {
        return downIsPressed;
    }

    public boolean getLeft() {
        return leftIsPressed;
    }

    public boolean getRight() {
        return rightIsPressed;
    }

    // subclass for listening to the keyboard
    private class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                currentKey = "left";
                leftIsPressed = true;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                currentKey = "right";
                rightIsPressed = true;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                currentKey = "up";
                upIsPressed = true;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                currentKey = "down";
                downIsPressed = true;
            }
        }

        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                leftIsPressed = false;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                rightIsPressed = false;
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                upIsPressed = false;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                downIsPressed = false;
            }
        }
    }

    // subclass for moving the mouse event.
    private class MotionListener implements MouseMotionListener {
        // based on the shape listener class below.
        public void mouseDragged(MouseEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
            currentMousePoint = e.getPoint();
            canvas.repaint();
        }

        protected class CanvasPane extends JPanel {
            public void paint(Graphics g) {
                g.drawImage(canvasImage, 0, 0, null);
                super.paint(g);
            }
        }
    }

    // sub class for the mouse buttons
    private class ShapeListener implements MouseListener {
        // based on Lewis, Loftus, Cocking, pages 431-434

        public void mousePressed(MouseEvent event) {
            clickedPoint = event.getPoint();
            // System.out.println ("Mouse Pressed at point x = " + clickedPoint.getX()
            // + ", y = " + clickedPoint.getY() + ".");
            canvas.repaint();
        }

        public void mouseClicked(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseExited(MouseEvent event) {
        }
    }

    /************************************************************************
     * Nested class CanvasPane - the actual canvas component contained in the Canvas
     * frame. This is essentially a JPanel with added capability to refresh the
     * image drawn on it. MODIFIED by acd: changed visibility to protected (from
     * private) to allow subclassing (basically, so we can add mouse listeners to
     * the canvas), and added the call to super.paint() (an additional hack to allow
     * us to add components like buttons and menus to the canvas).
     */
    protected class CanvasPane extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(canvasImage, 0, 0, null);
            super.paint(g);
        }
    }
}
