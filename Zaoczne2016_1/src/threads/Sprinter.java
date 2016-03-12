package threads;

import java.util.Random;

public class Sprinter implements Runnable {

	private static Random rand = new Random();
	public double time;
	private double totalDistance;
	public String name;
	public boolean finished = true;
	public volatile static double overalTime =0.0d;
	public static String monitor="MONITOR DLA OVTIME"; 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		double position = 0.0d ;
		double velocity = 0.0d;
		double a = 5.0d;
		double dt = 0.1d;
		double t1= rand.nextDouble()*10;
		double t2= rand.nextDouble()*10;
		int step = (int) (totalDistance/5); //dystans z dok³ do .01 m
		System.out.println(name +" wystartowa³ ");
		while(position<=totalDistance){
			synchronized (monitor) {
				overalTime+=dt;
			}
			velocity+=a*dt;
			position = position+ velocity*dt+a*dt*dt/2;
			time+=dt;
			if(time>t1){
				if (time>t2+t1) a=-5;
				else a=0;
			}
			if (velocity<=0) {
				finished = false;
				break;
			}
			//co 10% total dystance wypisz gdzie jesteœ
			int d = (int) (position); //dystans z dok³ do .01 m
			if ( ((int) time*10)%40  == 0 ) System.out.println(name +" na "+position +"m "+ " "+velocity+"m/s "+a+" m/s^2");
			if( ((int)time*10 )%5 ==0) Thread.yield();
		}		
		if (finished) System.out.println(name +" dobieg³ w czasie"+time +"s ");
		else System.out.println(name +" zatrzyma³ siê na "+position +"m ");
	}

	public Sprinter(double totalDistance, String name) {
		super();
		this.totalDistance = totalDistance;
		this.name = name;
	}


}
