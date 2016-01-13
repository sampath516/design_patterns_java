package com.java.designpatterns.observer;

public interface Observer {
	
	public void update(Subject subject);
	public StateInfo getState();

}
