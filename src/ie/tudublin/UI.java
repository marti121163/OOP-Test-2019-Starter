package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;

import java.util.ArrayList;

public class UI extends PApplet {

	public void separate(int value) {

		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings() {

		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
	}

	// this is my array list of colours
	public class colours {
		private ArrayList<String> colours = new ArrayList<>();
	}

	public void loadColours() {
		//
		Table table = loadTable("colours.csv", "header");

		for (int i = 0; i < table.getRowCount(); i++) {
			// creates a new star
			Star s = new Star(table.getRow(i));

			// adds the star to the end of the stars array list
			stars.add(s);
		}
	}
}
