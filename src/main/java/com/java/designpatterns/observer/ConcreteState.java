package com.java.designpatterns.observer;

public class ConcreteState implements StateInfo {

	State state = State.Initial;

	@Override
	public State getState() {
		return state;
	}

	@Override
	public void setState(State state) {
		this.state = state;

	}

}
