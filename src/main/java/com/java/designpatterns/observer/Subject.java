package com.java.designpatterns.observer;

public interface Subject {

	public void attach(Observer observer);

	public void detach(Observer observer);

	public void notifyObservers();

	public void setState(StateInfo state);

	public StateInfo getState();
}
