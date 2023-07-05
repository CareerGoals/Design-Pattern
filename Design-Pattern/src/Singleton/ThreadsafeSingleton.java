package Singleton;

public class ThreadsafeSingleton {
	
	private static ThreadsafeSingleton singleton;
	
	private ThreadsafeSingleton() {}
	
	public static synchronized ThreadsafeSingleton getInstance() {
		
		if(singleton == null) {
			singleton = new ThreadsafeSingleton();
		}
		
		return singleton;
	}

}
