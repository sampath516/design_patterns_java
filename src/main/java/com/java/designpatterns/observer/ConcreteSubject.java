package com.java.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class ConcreteSubject implements Subject {

	StateInfo state = new ConcreteState();
	Set<Observer> observers = new HashSet<Observer>();

	@Override
	public void attach(Observer observer) {
		if (observer != null) {
			observers.add(observer);
		}
	}

	@Override
	public void detach(Observer observer) {
		if (observer != null) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer obs : observers) {
			obs.update(this);
		}
	}

	@Override
	public void setState(StateInfo state) {
		this.state = state;
		this.notifyObservers();

	}

	@Override
	public StateInfo getState() {
		return state;
	}

}
