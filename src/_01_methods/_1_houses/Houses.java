package _01_methods._1_houses;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob  = new Robot();
	public void run() {
		// Check the recipe to find out what code to put here
		Random ran = new Random();
		
		rob.setX(5);
		rob.setY(400);
		
		for(int i = 0; i <10; i++) {
			//int tall = ran.nextInt(400);
			drawHouse("medium","red");
			
		}
	}
	void drawHouse(String height, String color) {
		int mouse = 0;
		if(height .equalsIgnoreCase("small")) {
			
			mouse = 60;
		}
		else if(height .equalsIgnoreCase("medium")) {
			mouse = 120;
		}
		else if(height .equalsIgnoreCase("large")) {
			mouse = 250;
		}
		if(color .equalsIgnoreCase("blue")) {
			rob.setPenColor(0, 0, 255);
		}
		else if(color .equals("red")) {
			rob.setPenColor(255,0,0);
		}
		rob.setSpeed(500);
		rob.penDown();
		rob.move(mouse);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(mouse);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
	}
}
