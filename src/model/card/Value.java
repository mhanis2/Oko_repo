package model.card;

import model.Const;

public enum Value {
	SEVEN(Const.SEVEN), EIGHT(Const.EIGHT), NINE(Const.NINE), TEN(Const.TEN), JACK(Const.JACK), QUEEN(
			Const.QUEEN), KING(Const.KING), ACE(Const.ACE);

	private final String label;


	Value(String label) {
		this.label = label;
		// this.value = value;
	}

	public String getLabel() {
		return this.label;
	}

}