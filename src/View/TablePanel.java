package View;
/*
Code created by Josh Braza 
*/

import java.awt.*;

import javax.swing.*;

import CardModel.WildCard;
import Components.RoundedBorderJPanel;
import Interfaces.GameConstants;

public class TablePanel extends JPanel implements GameConstants {
	
	private UNOCard topCard;	
	private final RoundedBorderJPanel table;
	
	public TablePanel(UNOCard firstCard){
		setOpaque(false);
		setLayout(new GridBagLayout());
		
		topCard = firstCard;
		table = new RoundedBorderJPanel(40);

		setTable();
		setComponents();
	}
	
	private void setTable(){
		
		table.setPreferredSize(new Dimension(500,200));
		table.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		table.add(topCard, c);
	}
	
	private void setComponents() {
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 130, 0, 45);
		add(table,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.LINE_END;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(0, 1, 0, 1);
		add(infoPanel, c);	
	}

	public void setPlayedCard(UNOCard playedCard){
		table.removeAll();
		topCard = playedCard;
		setTable();
		
		setBackgroundColor(playedCard);
	}
	
	public void setBackgroundColor(UNOCard playedCard){
		Color background;
		if(playedCard.getType()==WILD)
			background = ((WildCard) playedCard).getWildColor();
		else
			background = playedCard.getColor();
		
		table.setBackground(background);
	}
}
