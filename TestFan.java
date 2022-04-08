package week1;

import java.util.Scanner;

class Fan{
	//data field
	int speed;
	static boolean on;
	double radius;
	String color;
	String speedName;
	static String status;
	Fan(){
		//no arg constructor
		speed =1;
		on = false;
		radius=1;
		color = "blue";
		speedName = "slow";
		status = "";
	}
	Fan(int speed, double radius, String color){
		this.color=color;
		this.radius=radius;
		this.speed=speed;
		
		
		
		
		
	}
	public void Speeds(int speed) {
		//speed int to string
		if (speed == 1) {
		this.speedName = "slow";
		}
		else if (speed == 2) {
			this.speedName = "medium";
		}
		else if (speed == 3) {
			this.speedName = "fast";
		}
	}
	//action listener
	public void turnOn() {
		
		on=true;
		status = "fan is on";
	}
	public void turnOff() {
		
		on = false;
		
		status = "fan is off";
	}
	
	public String toString(){//overriding the toString() method  
		
		  return "Speed of fan : "+speedName+"\nRadius :"+radius+"\ncolor :"+color+ " \n"+status;  
		
		
}
}

public class TestFan {

	public static void main(String[] args) {
		FanNum1();
		FanNum2();
	
	}
	public static void FanNum1 () {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the speed, radius and color of the fan");
		int a = scan.nextInt();      // a = speed of fan
		double b = scan.nextDouble();  // b = radius of fan
		String c = scan.next();        // c = color of fan
		// TODO Auto-generated method stub
		Fan fan1 = new Fan(a,b,c);
		System.out.println("switch on the first fan press 1");
		int d = scan.nextInt();
		if(d==1) {
			fan1.turnOn();
		}
		else {
			fan1.turnOff();
		}
		
		fan1.Speeds(a);
		System.out.println(fan1.toString());
		
	}
	public static void FanNum2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the speed, radius and color of the second fan");
		int a2 = scan.nextInt();      // a = speed of fan
		double b2 = scan.nextDouble();  // b = radius of fan
		String c2 = scan.next();        // c = color of fan
		// TODO Auto-generated method stub
		Fan fan2 = new Fan(a2,b2,c2);
		System.out.println("switch on the fan press 1, press 0 to continue");
		int d2 = scan.nextInt();
		if(d2==1) {
			fan2.turnOn();
		}
		else {
			fan2.turnOff();
		}
		
		fan2.Speeds(a2);
		System.out.println(fan2.toString());
	}
	
	}

		
	


