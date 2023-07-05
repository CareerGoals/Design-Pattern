package Singleton;

public class SingletonImplementation {
	
	public static void main(String args[]) {
		EagerSingleton instance = EagerSingleton.getEagerSingletonInstance();
		EagerSingleton instance2 = EagerSingleton.getEagerSingletonInstance();
		EagerSingleton instance3 = EagerSingleton.getEagerSingletonInstance();
		
		//printing the hashcode of above variables
		
		System.out.println("instance " + instance.hashCode());
		System.out.println("instance " + instance2.hashCode());
		System.out.println("instance " + instance3.hashCode());
		
		//condition check
		
		if(instance == instance2 && instance2 == instance3) {
			System.out.println("All three objects pointing to the same memory location in the heap. So they are same objects.");
			
		}else {
		
			System.out.println("All three objects not pointing to the same memory location in the heap.");
		}
	}

}
