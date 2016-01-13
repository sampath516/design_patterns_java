package com.java.designpatterns.observer;


import org.junit.Assert;
import org.junit.Test;

public class ObserverTest {
	@Test
	public void testObserver() {
		Subject sub1 = new ConcreteSubject();
		Subject sub2 = new ConcreteSubject();
		
		Observer obs1 = new ConcreteObserver();
		Observer obs2 = new ConcreteObserver();
		Observer obs3 = new ConcreteObserver();
		
		sub1.attach(obs1);
		sub1.attach(obs2);
		
		sub2.attach(obs2);
		sub2.attach(obs3);
		
		
		StateInfo stateOne = new ConcreteState();
		stateOne.setState(State.One);
		sub1.setState(stateOne);
		Assert.assertEquals(State.One, obs1.getState().getState());
		Assert.assertEquals(State.One, obs2.getState().getState());
		

		StateInfo stateTwo = new ConcreteState();
		stateTwo.setState(State.Two);
		sub2.setState(stateTwo);
		Assert.assertEquals(State.One, obs1.getState().getState());
		Assert.assertEquals(State.Two, obs2.getState().getState());
		Assert.assertEquals(State.Two, obs3.getState().getState());
		
		sub1.detach(obs2);
		
		StateInfo stateThree = new ConcreteState();
		stateThree.setState(State.Three);
		sub1.setState(stateThree);
		Assert.assertEquals(State.Three, obs1.getState().getState());
		Assert.assertEquals(State.Two, obs2.getState().getState());
		Assert.assertEquals(State.Two, obs3.getState().getState());
		
		
	}

}
