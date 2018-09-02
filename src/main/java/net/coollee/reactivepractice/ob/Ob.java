package net.coollee.reactivepractice.ob;

import java.util.Observable;
import java.util.Observer;

public class Ob {

	static class IntObservable extends Observable implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i <= 10; i++) {
				setChanged();
				notifyObservers(i);
			}
		}
	}

	public static void main(String[] args) {
		Observer observer = (o, arg) -> System.out.println(arg);

		IntObservable intObservable = new IntObservable();
		intObservable.addObserver(observer);
		intObservable.run();

	}
}
