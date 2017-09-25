package lab03.shapes;

import java.awt.*;

public class OurAnimation {
	//Our animation represents "raining money". It depicts a red table with a green box on top of it. A yellow coin descends into the box.
	
	public static void main(String[] args) {
		/*
		 * Create a DrawableObject list and use it to create a DrawingTablet.
		 */
		DrawableObjectList objList = new DrawableObjectList();
		DrawingTablet tablet = new DrawingTablet("Our Animation", 200, 200, objList);
	    
		//Create a RoundedRectangle at the bottom of the screen and a Square on top of it.
		RoundedRectangle table = new RoundedRectangle(85, 175, 5, 5, 150, 50, Color.red);
		Square box = new Square(90, 155, 20, Color.green);
		objList.addDrawable(table);
		objList.addDrawable(box);
		
		/*
		 * Each time a change is made to the DrawableObjectList or to one of
		 * the DrawableObjects that it contains you need to invoke repaint()
		 * on the DrawingTablet. This causes the DrawingTablet to repaint
		 * the screen reflecting the changes.
		 */
		tablet.repaint();
		
		/*
		 * Sleep is a static method in the AnimationTimer class that causes
		 * the program to pause for a specific number of milliseconds when
		 * it is invoked. This line sleeps for 3 seconds.
		 */
		AnimationTimer.sleep(3000);
		
		//Create a Circle at the top of the screen.
		Circle coin = new Circle(140, 8, 8, Color.yellow);
		objList.addDrawable(coin);
		
		/*
		 * Repaint and make the coin descend with each repaint until the coin is completely inside the box.
		 * The coin descends 1 unit each repaint.
		 */
		Square box2 = new Square(90, 155, 20, Color.green);
		objList.addDrawable(box2);
		while (coin.getY() < 165) {
			coin.move(100, coin.getY() + 1);
			tablet.repaint();
			AnimationTimer.sleep(50);
			
		}
	}

}
