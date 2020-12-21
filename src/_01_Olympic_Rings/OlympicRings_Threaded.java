package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot r0 = new Robot(20, 300);
		Robot r1 = new Robot(200, 300);
		Robot r2 = new Robot(420,300);
		Robot r3 = new Robot(111, 500);
		Robot r4 = new Robot(301, 500);
		
		r0.setSpeed(10);
		r1.setSpeed(10);
		r2.setSpeed(10);
		r3.setSpeed(10);
		r4.setSpeed(10);

		r0.penDown();
		r1.penDown();
		r2.penDown();
		r3.penDown();
		r4.penDown();
		
		Thread one = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r0.turn(1);
				r0.move(2);
			}
		});
		Thread two = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r1.turn(1);
				r1.move(2);
			}
		});
		Thread three = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r2.turn(1);
				r2.move(2);
			}
		});
		Thread four = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r3.turn(1);
				r3.move(2);
			}
		});
		Thread five = new Thread(()->{
			for (int i = 0; i < 360; i++) {
				r4.turn(1);
				r4.move(2);
			}
		});	
		
		one.start();
		two.start();
		three.start();
		four.start();
		five.start();
	}
	
	
}

