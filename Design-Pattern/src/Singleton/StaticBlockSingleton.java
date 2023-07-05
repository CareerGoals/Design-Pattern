package Singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton singleton;
	
	private StaticBlockSingleton() {}
	
	static {
		singleton = new StaticBlockSingleton();
	}

	public static StaticBlockSingleton getInstance() {
		return singleton;
	}
}
