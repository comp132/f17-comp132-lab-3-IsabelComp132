package lab03.shapes;

import java.awt.Color;
import java.awt.Graphics;


/**
 * A RoundedRectangle is an object representing a rounded rectangle. A RoundedRectangle has a center point
 * (x,y), a height, a width, and a color. It can be moved, translated, scaled and drawn.
 * 
 * @author (Isabel, Anna-Sophie)
 * @date (9/20/17)
 */
public class RoundedRectangle implements Drawable, Scaleable {

    private int x;
    private int y;
    private int arcHeight;
    private int arcWidth;
    private int height;
    private int width;
    private Color theColor;
    private boolean isVisible;

    /**
     * Construct a new RoundedRectangle centered at initX, initY with an arc height of initArcHeight, an arc width of initArcWidth, 
     * a height of initHeight, a width of initWidth, and color indicated by initColor. The new RoundedRectangle is visible by
     * default.
     * 
     * @param initX the x coordinate of the center of the rounded rectangle.
     * @param initY the y coordinate of the center of the rounded rectangle.
     * @param initArcHeight the arc high of the rounded rectangle.
     * @param initArcWidth the arc width of the rounded rectangle.
     * @param initHeight the height of the rounded rectangle.
     * @param initWidth the width of the rounded rectangle.
     * @param initColor the color of the rounded rectangle.
     */
    public RoundedRectangle(int initX, int initY, int initArcHeight, int initArcWidth, int initHeight, int initWidth, Color initColor) {
        x = initX;
        y = initY;
        arcHeight = initArcHeight;
        arcWidth = initArcWidth;
        height = initHeight;
        width = initWidth;
        theColor = initColor;
        isVisible = true;
    }

    /**
     * Get the x coordinate of the center of this RoundedRectangle.
     * 
     * @return the x coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Get the y coordinate of the center of this RoundedRectangle.
     * 
     * @return the y coordinate
     */
    public int getY() {
        return y;
    }
    
    /**
     * Get the arc height of this RoundedRectangle.
     * 
     * @return the arc height
     */
    public int getArcHeight() {
        return arcHeight;
    }
    
    /**
     * Get the arc width of this RoundedRectangle.
     * 
     * @return the arc width
     */
    public int getArcWidth() {
        return arcWidth;
    }
    
    /**
     * Get the height of this RoundedRectangle.
     * 
     * @return the height
     */
    public int getHeight() {
        return height;
    }
    
    /**
     * Get the width of this RoundedRectangle.
     * 
     * @return the width
     */
    public int getWidth() {
        return width;
    }
    
    /**
     * Set the arc height of this RoundedRectangle. The RoundedRectangle's arc height is set to the absolute
     * value of the specified arc height to eliminate any negative height values.
     * 
     * @param newArcHeight the arc height of the new rounded rectangle.
     */
    public void setArcHeight(int newArcHeight) {
        arcHeight = Math.abs(newArcHeight);
    }
    
    /**
     * Set the arc width of this RoundedRectangle. The RoundedRectangle's arc width is set to the absolute
     * value of the specified arc width to eliminate any negative width values.
     * 
     * @param newArcWidth the arc width of the new rounded rectangle.
     */
    public void setArcWidth(int newArcWidth) {
        arcWidth = Math.abs(newArcWidth);
    }
    
    /**
     * Set the height of this RoundedRectangle. The RoundedRectangle's height is set to the absolute
     * value of the specified height to eliminate any negative height values.
     * 
     * @param newHeight the height of the new rounded rectangle.
     */
    public void setHeight(int newHeight) {
        height = Math.abs(newHeight);
    }

    /**
     * Set the width of this RoundedRectangle. The RoundedRectangle's width is set to the absolute
     * value of the specified width to eliminate any negative width values.
     * 
     * @param newwidth the width of the new rounded rectangle.
     */
    public void setWidth(int newWidth) {
        width = Math.abs(newWidth);
    }

    /**
     * Move the RoundedRectangle to a new location. This method changes the center point
     * of the rounded rectangle using the values provided by the parameters.
     * 
     * @param newX the new x coordinate
     * @param newY the new y coordinate
     */
    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

    /**
     * Move the RoundedRectangle relative to its current location. The center of the
     * rounded rectangle is moved by adding the parameters to the RoundedRectangle's current
     * location.
     * 
     * @param deltaX the change in the x coordinate. Positive values move the
     *            RoundedRectangle to the right, negative values move it to the left.
     * @param deltaY the change in the y coordinate. Positive values move the
     *            RoundedRectangle down, negative values move it up.
     */
    public void translate(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
    
 // === Implementation of the Scaleable interface ===
    /**
     * Scale this RoundedRectangle by the specified factor. For example a factor of 2.0
     * will make the height and width twice as big and a factor of 0.5 will make them half
     * as large. If the factor is negative the height and width are not changed.
     * 
     * @param factor the factor by which this RoundedRectangle is to be scaled.
     */
    public void scale(double factor) {
        if (factor > 0) {
        		arcHeight = (int) (Math.round(arcHeight * factor));
        		arcWidth = (int) (Math.round(arcWidth * factor));
        		height = (int) (Math.round(height * factor));
            width = (int) (Math.round(width * factor));
        }
    }
    
    // === Implementation of the Drawable interface ===

    /**
     * Draw this DrawableRoundedRectangle onto the specified Graphics object.
     * 
     * @param g the Graphics object on which to draw this DrawableRoundedRectangle.
     */
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRoundRect(x, y, width, height, arcWidth, arcHeight);
    }

    /**
     * Get the Color of this RoundedRectangle.
     * 
     * @return the color.
     */
    public Color getColor() {
        return theColor;
    }

    /**
     * Change the color of this RoundedRectangle to the newColor.
     * 
     * @param newColor the new color.
     */
    public void setColor(Color newColor) {
        theColor = newColor;
    }

    /**
     * Set whether or not this RoundedRectangle will be visible. If it is visible its draw
     * method will be invoked when the DrawingTablet is repainted. If it is not
     * visible its draw method will not be invoked.
     * 
     * @param visible true to make this RoundedRectangle visible, false to make it
     *            invisible.
     */
    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    /**
     * Find out if this RoundedRectangle is visible or not.
     * 
     * @return true if the RoundedRectangle is visible, false if it is not.
     */
    public boolean isVisible() {
        return isVisible;
    }
    
}
