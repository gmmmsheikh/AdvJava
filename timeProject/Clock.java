package timeProject;

public class Clock {

	public static void main(String[] args) {
		int minutes, seconds, hours; 
		for(hours =0; hours < 24; hours ++ ) {
			for (minutes = 0; minutes < 60; minutes++) {
				for (seconds = 0; seconds < 60; seconds++)  {
					System.out.print(hours + " hours " +minutes + " minutes " + seconds + " seconds");
				}
 
			} 
		}
	}

}
