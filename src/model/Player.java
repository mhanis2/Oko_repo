package model;

import java.util.List;

import model.card.Card;

public class Player {

	private List<Card> cards;

	public List<Card> getCards() {
		return cards;
	}

	/**
	 * Set players card in List<Card>.
	 * 
	 * @param cards
	 */
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}
