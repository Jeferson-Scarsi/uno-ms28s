package Interfaces;
/*
Code created by Josh Braza 
*/
import ServerController.MyButtonListener;
import ServerController.MyCardListener;
import View.InfoPanel;
import View.PlayerIcon;

import java.awt.Color;


public interface GameConstants extends UNOConstants_Original {
	int TOTAL_CARDS = 108;
	int FIRSTHAND = 8;

	UNOConstants unoConstants = new UNOConstants();

	StyleSelectionWindow styleSelection = new StyleSelectionWindow();
	boolean selectedStyle = styleSelection.getSelectedStyle();

	ColorSelectionWindow colorSelection = new ColorSelectionWindow();
	String selectedPalette = colorSelection.getSelectedPalette();

	Color[] UNO_COLORS = {unoConstants.getRED(selectedPalette), unoConstants.getBLUE(selectedPalette),
							unoConstants.getGREEN(selectedPalette), unoConstants.getYELLOW(selectedPalette)};

	Color WILD_CARDCOLOR = BLACK;

	int[] UNO_NUMBERS =  {0,1,2,3,4,5,6,7,8,9};
	
	String[] ActionTypes = {REVERSE, SKIP, DRAW2PLUS};
	String[] WildTypes = {W_COLORPICKER, W_DRAW4PLUS};


	int vsPC = 1;
	int MANUAL = 2;

	int[] GAMEMODES = {vsPC, MANUAL};

	MyCardListener CARDLISTENER = new MyCardListener();
	MyButtonListener BUTTONLISTENER = new MyButtonListener();

	InfoPanel infoPanel = new InfoPanel();

	PlayerIcon[] playerIconOptionList = {
			new PlayerIcon(36, 50, UNO_CARDBACK),
			new PlayerIcon(36, 50, W_COLORPICKER),
			new PlayerIcon(36, 50, W_DRAW4PLUS),
	};
}
