package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
public static void main(String[] args) {
	Robot[]arr=new Robot[2];
	Random rand = new Random();
	
boolean top = false;
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
for (int i = 0; i < arr.length; i++) {
	arr[i]=new Robot("vic");
	
	arr[i].moveTo(100+ i *100, 500);
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
while (!top) {
	for (int i = 0; i < arr.length; i++) {
		int speed = rand.nextInt(50);
		arr[i].setSpeed(400);
		arr[i].move(speed);
		arr[i].turn(4);
		if (arr[i].getY()<=0) {
			top=true;
			arr[i].turn(10000000);
			break;
		}
	}
	
}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}}
