package double_checked_locking;

public class Singleton {

	private volatile static Singleton uniqueInstance;
	private Singleton() {}
 
	public static Singleton getInstance() {
		// With double-checked locking, we first check to see if a instance is created.
		// If not we synchronize.

			if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
