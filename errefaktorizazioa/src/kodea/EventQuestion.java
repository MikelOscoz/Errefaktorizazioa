package kodea;

import domain.Event;

public class EventQuestion {
	private Event event;
	private String question;

	public EventQuestion(Event event, String question) {
		this.event = event;
		this.question = question;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
}