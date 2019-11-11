import java.util.Scanner;
abstract class Machine {
	public abstract void start();
	public abstract void running();
	public abstract void shutdown();
	public void run() {start(); running(); shutdown();}
}
class Car extends Machine{
	@Override public void start() {System.out.println("Start car");}
	@Override public void running() {System.out.println("Car running...");}
	@Override public void shutdown() {System.out.println("Stop car");}
}
class Boat extends Machine{
	@Override public void start() {System.out.println("Start boat");}
	@Override public void running() {System.out.println("Boat running...");}
	@Override public void shutdown() {System.out.println("Stop car");}
}
public class AbstactClass {
	public static void main(String[] args) {
		Car c1 = new Car();
		Boat b1 = new Boat();
		Scanner scan = new Scanner(System.in);
		String machine=scan.nextLine();
		
		if(machine.equals("car")) {
			c1.run();}
		else if(machine.equals("boat")) {
			b1.run();}
		else {
			System.out.println("unknown Machine");}
	}
}
