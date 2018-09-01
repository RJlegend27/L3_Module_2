package threads;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(450,700);
		Robot yellow = new Robot(500,750);
		Robot black = new Robot(550,700);
		Robot green = new Robot(600,750);
		Robot red = new Robot(650,700);
		blue.penDown();
		yellow.penDown();
		black.penDown();
		green.penDown();
		red.penDown();
		
		blue.setPenColor(Color.BLUE);
		yellow.setPenColor(Color.yellow);
		black.setPenColor(Color.black);
		green.setPenColor(Color.green);
		red.setPenColor(Color.red);
		
		
		
		for(int i = 0;i<=360;i++ ) {
			blue.setSpeed(10);
			yellow.setSpeed(10);
			black.setSpeed(10);
			green.setSpeed(10);
			red.setSpeed(10);
			blue.turn(1);
			blue.move(1);
			yellow.turn(1);
			yellow.move(1);
			black.turn(1);
			black.move(1);
			green.turn(1);
			green.move(1);
			red.turn(1);
			red.move(1);
			
			
			
		}
		blue.penUp();
		yellow.penUp();
		black.penUp();
		green.penUp();
		red.penUp();
		
		blue.moveTo(450,100);
		yellow.moveTo(500, 100);
		black.moveTo(550,100);
		green.moveTo(600, 100);
		red.moveTo(650,100);
		
		
		new Thread(()->blue.move(400)).start();
		new Thread(()->yellow.move(400)).start();
		new Thread(()->black.move(400)).start();
		new Thread(()->green.move(400)).start();
		new Thread(()->red.move(400)).start();
		
	}
}
