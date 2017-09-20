package lab03.shapes;

import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.Before;
import org.junit.Test;

public class DrawableObjectListTest {
	DrawableObjectList doList;
	
	@Before
	public void setUp() throws Exception {
		doList = new DrawableObjectList();
    }
	
	@Test
	public void testContructor() {
		assertEquals("The size of the ArrayList is not correct", 0, doList.getSize());
	}
	
	@Test
	public void testAddDrawable() {
		Circle circ1 = new Circle(0, 0, 2, Color.white);
		doList.addDrawable(circ1);
		assertEquals("The size of the ArrayList is not cerrect", 1, doList.getSize());
	}
	
	@Test
	public void testRemoveDrawable() {
		Circle circ1 = new Circle(0, 0, 2, Color.white);
		doList.addDrawable(circ1);
		doList.removeDrawable(circ1);
		assertEquals("The size of the ArrayList is not cerrect", 0, doList.getSize());
	}
	
	@Test
	public void testScaleAll() {
		Circle circ1 = new Circle(0, 0, 1, Color.white);
		doList.addDrawable(circ1);
		doList.scaleAll(2.0);
		assertEquals("The size of the object is not correct", 2, circ1.getRadius());
	}
}
