class Robot {
	private int id;
	public Robot(int id) {this.id = id;}
	//non-static nested class
	private class Brain {
		public void think() {System.out.println("Robot " + id + " is thinking");
		}
	}
	//static nested method
	public static class Battery {
		public void charge() {System.out.println("Battery charging...");
		}
	}
	public void start() {
		Brain b = new Brain(); b.think();
		final String name = "Robot1";
		//local class in method
		class Temp{
			public void doSomething() {System.out.println("My id: " + id);
				System.out.println("My name: " + name);
				}
		}
		Temp t = new Temp(); 
		t.doSomething();}
}
public class InnerClass {
	public static void main(String[] args) {
		Robot r = new Robot(7); Robot.Battery battery = new Robot.Battery();
		r.start(); battery.charge();
	}
}
