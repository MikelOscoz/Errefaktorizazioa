package dataAccess;

import domain.Question;

public class CreateQuoteParameter {
	public String quote;
	public Question question;

	public CreateQuoteParameter(String quote, Question question) {
		this.quote = quote;
		this.question = question;
	}
}
