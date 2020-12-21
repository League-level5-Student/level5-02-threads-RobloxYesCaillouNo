package _02_Advanced_Robot_Race;

import java.awt.AWTException;
import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	
	// 1. make a main method
	public static void main(String[] args) throws AWTException {
		// 2. create an array of 5 robots.
		Robot[]p= new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < p.length; i++) {
			p[i]= new Robot();
			p[i].setSpeed(10);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
	for (int i = 0; i < p.length; i++) {
		p[i].setX(420*i);
		p[i].setY(850);
	}
		
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		boolean isAtTop = false;

		
		Thread moveables = new Thread(() -> {
			int rand = new Random().nextInt(50);
			while (p[0].getY() >= -50) {
				p[0].move(rand);
			}
		});
		Thread moveables1 = new Thread(() -> {
			int rand = new Random().nextInt(50);
			while (p[1].getY() >= -50) {
				p[1].move(rand);
			}
		});
		Thread moveables2 = new Thread(() -> {
			int rand = new Random().nextInt(50);
			while (p[2].getY() >= -50) {
				p[2].move(rand);
			}
		});
		Thread moveables3 = new Thread(() -> {
			int rand = new Random().nextInt(50);
			while (p[3].getY() >= -50) {
				p[3].move(rand);
			}
			
		});
		Thread moveables4 = new Thread(() -> {
			int rand = new Random().nextInt(50);
			while (p[4].getY() >= -50) {
				p[4].move(rand);
			}
		});

		moveables.start();
		moveables1.start();
		moveables2.start();
		moveables3.start();
		moveables4.start();

		while (isAtTop == false) {
			for (int i = 0; i < p.length; i++) {
				if (p[i].getY() <= 50) {
					isAtTop = true;
					p[i].setWindowColor(Color.GREEN);
				}
			}
		}
	

		// 7. declare that robot the winner and throw it a party!
		// 8. try different races with different amounts of robots.
	
		// 9. make the robots race around a circular track.
	}

}
