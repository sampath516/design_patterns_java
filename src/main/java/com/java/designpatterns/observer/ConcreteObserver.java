package com.java.designpatterns.observer;

public class ConcreteObserver implements Observer {

	StateInfo state = new ConcreteState();;

	@Override
	public void update(Subject subject) {
		StateInfo subjectState = subject.getState();
		this.state = subjectState;
	}

	@Override
	public StateInfo getState() {
		return state;
	}

}
