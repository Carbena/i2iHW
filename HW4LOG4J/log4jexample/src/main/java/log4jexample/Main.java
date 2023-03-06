package log4jexample;

public class Main {

	public static void main(String[] args) {
		
		int second = 0;
		int minute = 0;
		int hour = 0;
		
		MyTimerLoggings loggings = new MyTimerLoggings();
		
		try {
		for(int i = 1;i<=20000;i++) {
			second++;
			loggings.warn("TIME = " + hour + ":" + minute + ":" + second + " LOG WARN ");
			Thread.sleep(2);
			if(second==59) {
				second = 0;
				minute++;
				loggings.info("TIME = " + hour + ":" + minute + ":" + second + " LOG INFO ");
			}
			if(minute==59) {
				minute = 0;
				hour++;
				loggings.error("TIME = " + hour + ":" + minute + ":" + second +" LOG ERROR ");
			}
		}
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
