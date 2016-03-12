package threads;

public class Race {

	public static void main(String[] args) throws InterruptedException {
		int numberOfSprinters = 500;
		int totalDistance = 200;
		Sprinter[] sprinters = new Sprinter[numberOfSprinters];
		Thread[] threads = new Thread[numberOfSprinters];
		for (int i=0; i<sprinters.length;i++){
			sprinters[i] = new Sprinter(totalDistance,"S"+i);
			threads[i]= new Thread(sprinters[i]);
		}
		System.out.println("START");
		for(Thread t : threads){
			t.start();
		}
		Thread.sleep(3000);
		System.out.println("===============================");
		double oTime = 0.0d;
		for (Sprinter s : sprinters){
			if (s.finished) System.out.println(s.name +" dobieg³ w czasie"+s.time +"s ");
			else System.out.println(s.name +" zatrzyma³ siê po "+s.time +"s ");
			oTime+=s.time;
			
		}
		System.out.println("Overal Time = "+Sprinter.overalTime);
		System.out.println("Overal Time2 = "+oTime);
		
		if (Sprinter.overalTime==oTime) System.out.println("RÓWNE");
		else System.out.println("RÓ¯NE");
	}

}
