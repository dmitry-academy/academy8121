package by.academy.lesson22.singleton;

public class ThreadSafeSingleton2 {
	private static ThreadSafeSingleton2 instance;

	private ThreadSafeSingleton2() {
	}

	public static ThreadSafeSingleton2 getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton2();
				}
			}
		}
		return instance;
	}
}
