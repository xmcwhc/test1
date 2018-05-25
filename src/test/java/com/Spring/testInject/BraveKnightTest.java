package com.Spring.testInject;

import org.junit.Test;
import static org.mockito.Mockito.*;

import com.testSpring.test1.Test1;

public class BraveKnightTest {
	@Test
	public void Test1(){
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkQuest();
		verify(mockQuest,times(1)).quest();
		
	}
}
