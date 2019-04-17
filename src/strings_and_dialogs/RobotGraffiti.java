package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot j= new Robot();
	 j.setSpeed(100);
	
	j.penDown();
	j.turn(-35);
	j.move(200);
	j.turn(-110);
	j.move(200);
	j.turn(-180);
	j.move(100);
	j.turn(55);
	j.move(100);
	j.penUp();
	j.move(200);
	j.penDown();
	
	j.turn(90);
	j.move(100);
	j.turn(180);
	j.move(200);
	j.turn(180);
	j.move(100);
	j.turn(-45);
	j.move(150);
	j.turn(180);
	j.move(150);
	j.turn(90);
	j.move(150);
	j.penUp();
	j.move(200);
	
	
   }
}
