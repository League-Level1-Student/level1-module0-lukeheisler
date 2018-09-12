import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class Houses {

	static Robot ralph = new Robot("batman");
	
	public static void main(String[] args) {
		Random random = new Random();
		ralph.moveTo(850,550);
		ralph.setSpeed(100);
		ralph.penDown();
		for (int i = 0; i < 10; i++) {
			drawHouse(random.nextInt(249)+1, random.nextInt(255), random.nextInt(255), random.nextInt(255));
		}
	}
	
	static void drawHouse(int height, int r, int g, int b) {
		ralph.setPenColor(r, g, b);
		ralph.setPenWidth(5);
		ralph.move(height);
		ralph.turn(-90);
		ralph.move(50);
		ralph.turn(-90);
		ralph.move(height);
		ralph.turn(90);
		ralph.setPenColor(0,255,100);
		ralph.move(25);
		ralph.turn(90);
	}

}
