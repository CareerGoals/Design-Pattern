package Singleton;

public class EagerSingleton {
	
	//Eager Intialization
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){ // private constructor
		
	}
	
	public static EagerSingleton getEagerSingletonInstance() {
		return instance;
	}
	
}
