package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;
import org.junit.Before;
import org.junit.Test;

public class RoundedRectangleTest {

	private RoundedRectangle rr1;
    
    @Before
    public void setUp() throws Exception {
        rr1 = new RoundedRectangle(10,20,1,1,3,7,Color.red);
    }

    @Test
    public void testConstructor() {
        assertEquals("wrong x", 10, rr1.getX());
        assertEquals("wrong y", 20, rr1.getY());
        assertEquals("wrong arc height", 1, rr1.getArcHeight());
        assertEquals("wrong arc width", 1, rr1.getArcWidth());
        assertEquals("wrong height", 3, rr1.getHeight());
        assertEquals("wrong width", 7, rr1.getWidth());
        assertEquals("wrong color", Color.red, rr1.getColor());
        assertTrue("should be visible", rr1.isVisible());
    }
    
    @Test
    public void testSetColor() {
        rr1.setColor(Color.blue);
        assertEquals("wrong color", Color.blue, rr1.getColor());     
    }
    
    @Test
    public void testSetVisible() {
        rr1.setVisible(false);
        assertFalse("should be invisible", rr1.isVisible());
        
        rr1.setVisible(true);
        assertTrue("should be visible", rr1.isVisible());
    }
    
    @Test 
    public void testSetArcHeight() {
        rr1.setArcHeight(2);
        assertEquals("wrong arc height", 2, rr1.getArcHeight());
        
        rr1.setArcHeight(-2);
        assertEquals("wrong arc height", 2, rr1.getArcHeight());
    }
    
    @Test 
    public void testSetArcWidth() {
        rr1.setArcWidth(2);
        assertEquals("wrong arc width", 2, rr1.getArcWidth());
        
        rr1.setArcWidth(-2);
        assertEquals("wrong arc width", 2, rr1.getArcWidth());
    }
    
    @Test 
    public void testSetHeight() {
        rr1.setHeight(10);
        assertEquals("wrong height", 10, rr1.getHeight());
        
        rr1.setHeight(-20);
        assertEquals("wrong height", 20, rr1.getHeight());
    }
    
    @Test 
    public void testSetWidth() {
        rr1.setWidth(10);
        assertEquals("wrong width", 10, rr1.getWidth());
        
        rr1.setWidth(-20);
        assertEquals("wrong width", 20, rr1.getWidth());
    }
    
    @Test
    public void testMove() {
        rr1.move(20,30);
        assertEquals("wrong x", 20, rr1.getX());
        assertEquals("wrong y", 30, rr1.getY());
    }
    
    @Test
    public void testTranslate() {
        rr1.translate(5,10);
        assertEquals("wrong x", 15, rr1.getX());
        assertEquals("wrong y", 30, rr1.getY());
    }
    
    @Test
    public void testScale() {
        rr1.scale(2.0);
        assertEquals("wrong arc height", 2, rr1.getArcHeight());
        assertEquals("wrong arc width", 2, rr1.getArcWidth());
        assertEquals("wrong height", 6, rr1.getHeight());
        assertEquals("wrong width", 14, rr1.getWidth());
        
        rr1.scale(0.5);
        assertEquals("wrong arc height", 1, rr1.getArcHeight());
        assertEquals("wrong arc width", 1, rr1.getArcWidth());
        assertEquals("wrong height", 3, rr1.getHeight());
        assertEquals("wrong width", 7, rr1.getWidth());
        
        rr1.scale(-2.0);
        assertEquals("wrong arc height", 1, rr1.getArcHeight());
        assertEquals("wrong arc width", 1, rr1.getArcWidth());
        assertEquals("wrong height", 3, rr1.getHeight());
        assertEquals("wrong width", 7, rr1.getWidth());
    }

}

