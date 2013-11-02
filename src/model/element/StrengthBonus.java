package model.element;

import model.board.Content;
import model.fighter.Fighter;
import model.fighter.Hero;

public class StrengthBonus extends Item{
	
	public StrengthBonus(int value){
		super(value);
	}
	
	@Override
	public Content interact(Fighter hero){
		((Hero)hero).stronger(getValue());
		return null;
	}
}
