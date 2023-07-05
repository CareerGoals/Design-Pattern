package Singleton;

public class DoubleLockingThreadSafeSingleton {
	
	private static DoubleLockingThreadSafeSingleton singleton;
	
	private DoubleLockingThreadSafeSingleton() {}
	
	public static DoubleLockingThreadSafeSingleton getInstance() {
		
		if(singleton == null) {
			synchronized(DoubleLockingThreadSafeSingleton.class) {
				if(singleton == null) {
					singleton = new DoubleLockingThreadSafeSingleton();
				}
			}
		}
		
		return singleton;
	}

}
