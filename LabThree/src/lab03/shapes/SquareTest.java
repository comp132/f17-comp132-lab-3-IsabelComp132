package lab03.shapes;

import static org.junit.Assert.*;

import java.awt.Color;
import org.junit.Before;
import org.junit.Test;

public class SquareTest {

	private Square s1;
    
    @Before
    public void setUp() throws Exception {
        s1 = new Square(10,20,5,Color.red);
    }

    @Test
    public void testConstructor() {
        assertEquals("wrong x", 10, s1.getX());
        assertEquals("wrong y", 20, s1.getY());
        assertEquals("wrong side length", 5, s1.getLength());
        assertEquals("wrong color", Color.red, s1.getColor());
        assertTrue("should be visible", s1.isVisible());
    }
    
    @Test
    public void testSetColor() {
        s1.setColor(Color.blue);
        assertEquals("wrong color", Color.blue, s1.getColor());     
    }
    
    @Test
    public void testSetVisible() {
        s1.setVisible(false);
        assertFalse("should be invisible", s1.isVisible());
        
        s1.setVisible(true);
        assertTrue("should be visible", s1.isVisible());
    }
    
    @Test 
    public void testSetLength() {
        s1.setLength(10);
        assertEquals("wrong length", 10, s1.getLength());
        
        s1.setLength(-20);
        assertEquals("wrong length", 20, s1.getLength());
    }
    
    @Test
    public void testMove() {
        s1.move(20,30);
        assertEquals("wrong x", 20, s1.getX());
        assertEquals("wrong y", 30, s1.getY());
    }
    
    @Test
    public void testTranslate() {
        s1.translate(5,10);
        assertEquals("wrong x", 15, s1.getX());
        assertEquals("wrong y", 30, s1.getY());
    }
    
    @Test
    public void testScale() {
        s1.scale(2.0);
        assertEquals("wrong length", 10, s1.getLength());
        
        s1.scale(0.5);
        assertEquals("wrong length", 5, s1.getLength());
        
        s1.scale(-2.0);
        assertEquals("wrong length", 5, s1.getLength());
    }

}
