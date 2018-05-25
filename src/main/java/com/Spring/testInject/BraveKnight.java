package com.Spring.testInject;

public class BraveKnight implements Knight {
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		super();
		this.quest = quest;
	}

	public void embarkQuest() {
		// TODO Auto-generated method stub
		quest.quest();
	}
	
}
